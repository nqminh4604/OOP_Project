package student_model;

import java.util.List;
import subject_model.Subject;

public class Student {

    private String studentID;
    private String name;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String department;
    private String schoolYear;
    private String hometown;
    private List<Subject> subjectOfStudent;

    public Student(String studentID, String name, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, String department, String schoolYear, String hometown) {
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.department = department;
        this.schoolYear = schoolYear;
        this.hometown = hometown;
//        this.subjectOfStudent;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getHometown() {
        return hometown;
    }

    public void setAddress(String address) {
        this.hometown = address;
    }

    public String getFunction(int index) {
        switch (index) {
            case 0:
                return getStudentID();
            case 1:
                return getName();
            case 2:
                return getGender();

            case 3:
                return String.valueOf(getDayOfBirth() + "/" + getMonthOfBirth() + "/" + getYearOfBirth());

            case 4:
                return getDepartment();

            case 5:
                return getSchoolYear();
            case 6:
                return getHometown();

        }
        return null;
    }

}
