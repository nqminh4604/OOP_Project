package student_utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import student_model.Student;

public class StudentManager {

    public static int studentPosition;
    public static List<Student> List_Of_Student = initialize();
    public static List<Student> Search_List = initialize();

    public static List<Student> getList_Of_Student() {
        Collections.sort(List_Of_Student, Comparator.comparing(Student::getStudentID));
        return List_Of_Student;
    }

    private static List<Student> initialize() {
        List<Student> list = StudentDAO.readFromExcelFile("student.xlsx");
        return list;
    }

    public static void setList_Of_Student(List<Student> List_Of_Student) {
        StudentManager.List_Of_Student = List_Of_Student;
    }

    static boolean addStudent(Student student) {
        if (findByID(student.getStudentID())) {
            return false;
        }
        List_Of_Student.add(student);
        return true;
    }

    public static boolean findByID(String ID) {
        for (Student each : List_Of_Student) {
            if (each.getStudentID().equals(ID)) {
                return true;
            }
        }
        return false;
    }

}
