
package admin_utils;

import admin_model.User;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    
     public static List<User> listOfUser= new ArrayList<User>();

    public static List<User> getListOfUser() {
        return listOfUser;
    }

    public static void setListOfUser(List<User> listOfCDs) {
        UserManager.listOfUser = listOfCDs;
    }
        
}
