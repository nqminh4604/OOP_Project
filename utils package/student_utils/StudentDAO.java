package student_utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import student_model.Student;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentDAO {

    public static List<Student> readFromExcelFile(String fileName) {
        List<Student> result = new ArrayList<Student>();
        try {

            FileInputStream fis = new FileInputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet1 = workbook.getSheetAt(0);
            FormulaEvaluator formula = workbook.getCreationHelper().createFormulaEvaluator();
            for (Row row : sheet1) {
                int i = 0;
                while (row.getCell(i) != null) {
                    String ID = String.valueOf(row.getCell(i));
                    i++;
                    String name = String.valueOf(row.getCell(i));
                    i++;
                    String gender = String.valueOf(row.getCell(i));
                    i++;
                    String birthDay = String.valueOf(row.getCell(i));
                    String[] numbers = birthDay.split("/");
                    int day = Integer.parseInt(numbers[0]);
                    int month = Integer.parseInt(numbers[1]);
                    int year = Integer.parseInt(numbers[2]);
                    i++;
                    String department = String.valueOf(row.getCell(i));
                    i++;
                    String schoolyear = String.valueOf(row.getCell(i));
                    i++;
                    String hometown = String.valueOf(row.getCell(i));
                    i++;
                    result.add(new Student(ID, name, gender, day, month, year, department, schoolyear, hometown));
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;

    }

    public static void writeToExcelFile(String fileName) {

        FileOutputStream fos = null;
        XSSFWorkbook workbook = null;
        try {
            fos = new FileOutputStream(fileName);
            workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Student Infomation");
            XSSFRow rowData;
            XSSFCell cellWrite;
            rowData = sheet.createRow(0);

            for (int i = 0; i < StudentManager.List_Of_Student.size(); i++) {
                rowData = sheet.createRow(i);
                for (int j = 0; j < 7; j++) {
                    cellWrite = rowData.createCell(j);
                    cellWrite.setCellValue(StudentManager.List_Of_Student.get(i).getFunction(j));
                }

            }
            workbook.write(fos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                workbook.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
