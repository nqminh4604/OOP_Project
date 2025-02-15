package login_main_view;

import admin_model.User;
import admin_utils.UserDAO;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import main.Main;
import net.miginfocom.swing.MigLayout;
import swing_model.Button;
import swing_model.MyPasswordField;
import swing_model.MyTextField;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

    private User user;

    public User getUser() {
        return user;
    }

    public PanelLoginAndRegister(ActionListener eventRegister, ActionListener eventLogin) {

        initComponents();
        initRegister(eventRegister);;
        initLogin(eventLogin);
        login.setVisible(false);
        register.setVisible(true);
    }

    private void initRegister(ActionListener eventRegister) {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]10[]25[]push"));
        JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(7, 164, 121));
        register.add(label);

        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/user.png")));
        txtUser.setHint("Name");
        register.add(txtUser, "w 60%");

        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/mail.png")));
        txtEmail.setHint("Email");
        register.add(txtEmail, "w 60%");

        MyPasswordField txtPassword = new MyPasswordField();
        txtPassword.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/pass.png")));
        txtPassword.setHint("Password");
        register.add(txtPassword, "w 60%");

        JCheckBox cmdShowPassword = new JCheckBox("Show password");
        cmdShowPassword.setForeground(new Color(100, 100, 100));
        cmdShowPassword.setFont(new Font("sansserif", 1, 12));
        cmdShowPassword.setContentAreaFilled(false);
        cmdShowPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
        register.add(cmdShowPassword);
        cmdShowPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox checkBox = (JCheckBox) e.getSource();
                if (checkBox.isSelected()) {
                    txtPassword.setEchoChar((char) 0);
                } else {
                    txtPassword.setEchoChar('*');

                }
            }
        });

        Button cmd = new Button();
        cmd.setBackground(new Color(7, 164, 121));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.addActionListener(eventRegister);
        cmd.setText("SIGN UP");
        register.add(cmd, "w 40%, h 40");

        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String userName = txtUser.getText().toString();
                String password = String.valueOf(txtPassword.getPassword());
                String email = txtEmail.getText().toString();
                user = new User(userName, password, email);

            }
        });

    }

    private void initLogin(ActionListener eventLogin) {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]10[]25[]push"));
        JLabel label = new JLabel("SIGN IN");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(7, 164, 121));
        login.add(label);

        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/user.png")));
        txtUser.setHint("Name");
        login.add(txtUser, "w 60%");

        MyPasswordField txtPassword = new MyPasswordField();
        txtPassword.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/pass.png")));
        txtPassword.setHint("Password");
        login.add(txtPassword, "w 60%");

        JCheckBox cmdShowPassword = new JCheckBox("Show password");
        cmdShowPassword.setForeground(new Color(100, 100, 100));
        cmdShowPassword.setFont(new Font("sansserif", 1, 12));
        cmdShowPassword.setContentAreaFilled(false);
        cmdShowPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdShowPassword);
        cmdShowPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox checkBox = (JCheckBox) e.getSource();
                if (checkBox.isSelected()) {
                    txtPassword.setEchoChar((char) 0);
                } else {
                    txtPassword.setEchoChar('*');

                }
            }
        });

        JButton cmdForget = new JButton("Forgot your password ?");

        cmdForget.setForeground(
                new Color(100, 100, 100));
        cmdForget.setFont(
                new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);

        Button cmd = new Button();

        cmd.setBackground(
                new Color(7, 164, 121));
        cmd.setForeground(
                new Color(250, 250, 250));

        cmd.setText("SIGN IN");

        cmd.addActionListener(eventLogin);

        login.add(cmd, "w 40%, h 40");

        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String userName = txtUser.getText().trim();
                String password = String.valueOf(txtPassword.getPassword());

                user = new User(userName, password, null);

                login.setVisible(false);

            }
        });

        login.add(cmd, "w 40%, h 40");

    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
