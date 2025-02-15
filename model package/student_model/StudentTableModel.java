package student_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel {

    String[] columnHeader = new String[]{"ID", "Name", "Gender", "Birth Day", "Department", "School Year", "Home Town"};
    List<Object[]> listRow = new ArrayList<Object[]>();
    

    public StudentTableModel(List<Student> listOfStudent) {
        for (Student each : listOfStudent) {
            Object[] row = new Object[]{each.getStudentID(), each.getName(), each.getGender(),
                each.getDayOfBirth() + "/" + each.getMonthOfBirth() + "/" + each.getYearOfBirth(),
                each.getDepartment(), each.getSchoolYear(), each.getHometown()};
            listRow.add(row);
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return listRow.get(0)[columnIndex].getClass();
    }

    @Override
    public String getColumnName(int column) {
        return columnHeader[column];
    }

    @Override
    public int getColumnCount() {
        return columnHeader.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return listRow.get(rowIndex)[columnIndex];
    }

    @Override
    public int getRowCount() {
        return listRow.size();
    }

}
