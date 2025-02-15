package admin_model;

import java.io.Serializable;

public class User implements Serializable {

    String userName;
    String password;
    String email;

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        User thisUser = this;
        User anotherUser = (User) obj;
        if ((thisUser.userName.equals(anotherUser.getUserName())) || (thisUser.email.equals(anotherUser.getEmail()))) {
            return true;
        }
        return false;
    }

}
