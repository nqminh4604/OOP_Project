package admin_utils;

import admin_model.User;
import java.io.BufferedReader;
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
import javax.tools.FileObject;

public class UserDAO {

    public static void saveUserToFile(User user) {
        File file = new File("user.txt");
        PrintWriter pw = null;
        try {

            pw = new PrintWriter(new FileWriter("user.txt", true));
            pw.println(user.getUserName().toString());
            pw.println(user.getEmail().toString());
            pw.println(user.getPassword().toString());

            pw.flush();

        } catch (IOException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }

    }

    public static void saveUserToFileWhenSaveInformation(List<User> user) {
        File file = new File("user.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("user.txt"));
            for (User each : user) {
                pw.println(each.getUserName().toString());
                pw.println(each.getEmail().toString());
                pw.println(each.getPassword().toString());
            }
            pw.flush();

        } catch (IOException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }

    }

    public static List<User> loadUserFromFile() {
        List<User> results = new ArrayList<User>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("user.txt"));

            String line = null;

            while ((line = br.readLine()) != null) {
                String userName = line;
                String userEmail = br.readLine();
                String userPassword = br.readLine();
                User user = new User(userName, userPassword, userEmail);
                results.add(user);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return results;
    }
}
