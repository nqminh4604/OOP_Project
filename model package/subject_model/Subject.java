/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject_model;

import java.io.Serializable;

/**
 *
 * @author Nguyen Minh
 */
public class Subject implements Serializable {

    private String id;
    private String code;
    private String name;
    private String status;
    private double GPA;

    public Subject(String id, String code, String name, String status, double gpa) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.status = status;
        this.GPA = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
