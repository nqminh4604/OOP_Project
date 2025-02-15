/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject_utils;

import java.io.BufferedReader;
import subject_model.Subject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Minh
 */
public class SubjectDAO {

    public static File checkAndMakeFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists())
            try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return file;
    }

    public static void saveSubjectAsChar(List<Subject> list, String path) {
        PrintWriter pw = null;
        try {
            File file = checkAndMakeFile(path);

            pw = new PrintWriter(new FileWriter(file.getPath()));
            for (Subject subject : list) {

                pw.println(subject.getId());
                pw.println(subject.getCode());
                pw.println(subject.getName());
                pw.println(subject.getStatus());
                pw.println(subject.getGPA());

            }
            pw.flush();

        } catch (IOException ex) {
            Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }

    }

    public static List<Subject> loadSubjectAsChar(String path) {
        List<Subject> result = new ArrayList<>();
        BufferedReader br = null;
        try {
            File file = checkAndMakeFile(path);

            br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null) {
                String id = line;
                String code = br.readLine();
                String name = br.readLine();
                String status = br.readLine();
                double gpa = Double.parseDouble(br.readLine().toString());

                Subject s = new Subject(id, code, name, status, gpa);
                result.add(s);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return result;
    }

    public static void backup(List<Subject> listSubject, String path) {

        File file = SubjectDAO.checkAndMakeFile(path);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(listSubject);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static List<Subject> restore(String path) {
        ObjectInputStream ois = null;
        List<Subject> result = new ArrayList<>();
        try {
            ois = new ObjectInputStream(new FileInputStream(path));
            result = (List) ois.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(SubjectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

}
