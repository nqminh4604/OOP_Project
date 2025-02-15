package main;

import admin_model.User;
import admin_utils.UserDAO;
import login_main_view.*;
import login_main_view.PanelCover;
import login_main_view.PanelLoginAndRegister;
import login_main_view.PanelMessage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import admin_utils.UserManager;
import java.io.File;

public class Main extends javax.swing.JFrame {

    private MigLayout layout;
    private PanelCover cover;
    private final double addSize = 30;
    private final double coverSize = 40;
    private boolean isLogin;
    private final DecimalFormat df = new DecimalFormat("##0.###");

    private PanelLoginAndRegister loginAndRegister;
    private final double loginSize = 60;

    public Main() {
        initComponents();
        init();

    }

    private void init() {
        layout = new MigLayout("fill, insets 0");
        cover = new PanelCover();
        ActionListener eventRegister = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
            }
        };
        ActionListener eventLogin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        };
        loginAndRegister = new PanelLoginAndRegister(eventRegister, eventLogin);
//        loginAndRegister = new PanelLoginAndRegister(eventLogin);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double fractionCover;
                double fractionLogin;
                double size = coverSize;
                if (fraction <= 0.5f) {
                    size += fraction * size;
                } else {
                    size += addSize - fraction * addSize;
                }
                if (isLogin) {
                    fractionCover = 1f - fraction;
                    fractionLogin = fraction;
                    if (fraction >= 0.5f) {
                        cover.registerRight(fractionCover * 100);
                    } else {
                        cover.loginRight(fractionLogin * 100);
                    }
                } else {
                    fractionCover = fraction;
                    fractionLogin = 1f - fraction;
                    if (fraction <= 0.5f) {
                        cover.registerLeft(fraction * 100);
                    } else {
                        cover.loginLeft((1f - fraction) * 100);
                    }
                }

                if (fraction >= 0.5f) {
                    loginAndRegister.showRegister(isLogin);
                }
                fractionCover = Double.valueOf(df.format(fractionCover));
                fractionLogin = Double.valueOf(df.format(fractionLogin));
                layout.setComponentConstraints(cover, "width " + size + "%, pos " + fractionCover + "al 0 n 100%");
                layout.setComponentConstraints(loginAndRegister, "width " + loginSize + "%, pos " + fractionLogin + "al 0 n 100%");
                bg_new.revalidate();
            }

            @Override
            public void end() {
                isLogin = !isLogin;
            }

        };
        Animator animator = new Animator(800, target);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.setResolution(0); //for smooth
        bg_new.setLayout(layout);
        bg_new.add(cover, "width " + coverSize + "%, pos 0al 0 n 100%");
        bg_new.add(loginAndRegister, "width " + loginSize + "%, pos 1al 0 n 100%"); // 1al = 100%
        cover.addEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!animator.isRunning()) {
                    animator.start();
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();
        bg_new = new javax.swing.JLayeredPane();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1037, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        bg_new.setBackground(new java.awt.Color(255, 255, 255));
        bg_new.setOpaque(true);

        javax.swing.GroupLayout bg_newLayout = new javax.swing.GroupLayout(bg_new);
        bg_new.setLayout(bg_newLayout);
        bg_newLayout.setHorizontalGroup(
            bg_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
        );
        bg_newLayout.setVerticalGroup(
            bg_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        getContentPane().add(bg_new, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void register() {
        User user = loginAndRegister.getUser();

        List<User> listUser = UserDAO.loadUserFromFile();
        boolean result = false;

        if (user.getUserName().equals("") || user.getEmail().equals("") || user.getPassword().equals("")) {
//            showMessage(PanelMessage.MessageType.ERROR, "All information need to be filled");
            result = true;
        }

        for (User each : listUser) {
            if (each.equals(user)) {
                result = true;
                break;
            }

        }

        if (!result) {
            showMessage(PanelMessage.MessageType.SUCCESS, "Register Successfull");
            UserDAO.saveUserToFile(user);
        } else {
            showMessage(PanelMessage.MessageType.ERROR, "Register Unsuccessfull");
        }
//      kiem tra xem login dc ko hay chua co account

    }

    private void login() {
        User user = loginAndRegister.getUser();
        List<User> listUser = UserDAO.loadUserFromFile();
        String email = "";
        boolean result = false;
        for (User each : listUser) {
            if (each.getUserName().equals(user.getUserName()) && each.getPassword().equals(user.getPassword())) {
                result = true;
                email = each.getEmail();
                break;
            }

        }
        User userLogin = new User(user.getUserName(), user.getPassword(), email);
        if (!result) {
            showMessage(PanelMessage.MessageType.ERROR, "Login Unsuccessfull");
        } else {
            showMessage(PanelMessage.MessageType.SUCCESS, "Login Successfull");
            
            new Home().setVisible(true);
            this.dispose();
            UserManager.getListOfUser().add(userLogin);
        }
    }

    public void showMessage(PanelMessage.MessageType messageType, String message) {
        PanelMessage ms = new PanelMessage();
        ms.showMessage(messageType, message);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void begin() {
                if (!ms.isShow()) {
                    bg_new.add(ms, "pos 0.5al -30", 0);//Insert to bg first index 0
                    ms.setVisible(true);
                    bg_new.repaint();
                }
            }

            @Override
            public void timingEvent(float fraction) {
                float f;
                if (ms.isShow()) {
                    f = 40 * (1f - fraction);
                } else {
                    f = 40 * fraction;
                }
                layout.setComponentConstraints(ms, "pos 0.5al " + (int) (f - 30));
                bg_new.repaint();
                bg_new.revalidate();
            }

            @Override
            public void end() {
                if (ms.isShow()) {
                    bg_new.remove(ms);
                    bg_new.repaint();
                    bg_new.revalidate();
                } else {
                    ms.setShow(true);
                }
            }
        };
        Animator animator = new Animator(300, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    animator.start();
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            }
        }).start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    private javax.swing.JLayeredPane bg_new;
    // End of variables declaration//GEN-END:variables
}
