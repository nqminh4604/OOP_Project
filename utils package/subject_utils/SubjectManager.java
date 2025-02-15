/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject_utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import subject_model.Subject;
import java.util.List;
import student_model.Student;
import student_utils.*;

/**
 *
 * @author ASUS
 */
public class SubjectManager {

    public int subjectPosition;
    public static List<Subject> listOfSubject_Main = initilize();
    public static List<Subject> listOfSubject_Choose;
    public static List<Subject> searchList = initilize();
//    = initChooseSubject(StudentManager.List_Of_Student.get(StudentManager.studentPosition));

    private static List<Subject> initilize() {
        List<Subject> list = SubjectDAO.loadSubjectAsChar("sub.txt");
        return list;
    }

    public void initChooseSubject(Student student) {
        listOfSubject_Choose = SubjectDAO.loadSubjectAsChar("studentSubjectData\\student" + student.getStudentID() + ".txt");
    }

    public static List<Subject> getListOfSubject_Main() {
        Collections.sort(listOfSubject_Main, Comparator.comparing(Subject::getId));
        return listOfSubject_Main;
    }

    public static void setListOfSubject(List<Subject> listOfSubject) {
        SubjectManager.listOfSubject_Main = listOfSubject;
    }

    public static boolean addNewSubject(Subject subject) {
        try {
            listOfSubject_Main.add(subject);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean deleteSubject(Subject subject) {
        try {
            listOfSubject_Main.remove(subject);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static List<Subject> findSubjectByName(String search) {
        searchList.clear();
        for (Subject each : getListOfSubject_Main()) {
            if (each.getName().toLowerCase().contains(search.toLowerCase())) {
                searchList.add(each);
            }
        }
        return searchList;
    }

    public static List<Subject> findSubjectBySubCode(String search) {
        searchList.clear();
        for (Subject each : getListOfSubject_Main()) {
            if (each.getCode().toLowerCase().contains(search.toLowerCase())) {
                searchList.add(each);
            }
        }
        return searchList;
    }

}
