package login_main_view;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

public class PanelMessage extends javax.swing.JPanel {

    private MessageType messageType = MessageType.SUCCESS;
    private boolean show;

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public PanelMessage() {
        initComponents();
        setOpaque(false);
        setVisible(false);
    }

    public void showMessage(MessageType messageType, String message) {
        this.messageType = messageType;
        ibMessage.setText(message);
        if (messageType == MessageType.SUCCESS) {
            ibMessage.setIcon(new ImageIcon(getClass().getResource("/icon/success.png")));
        } else {
            ibMessage.setIcon(new ImageIcon(getClass().getResource("/icon/error.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibMessage = new javax.swing.JLabel();

        ibMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ibMessage.setForeground(new java.awt.Color(248, 248, 248));
        ibMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibMessage.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ibMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ibMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (messageType == MessageType.SUCCESS) {
            g2.setColor(new Color(15, 174, 37));
        } else {
            g2.setColor(new Color(240, 52, 53));
        }
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9f));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.setComposite(AlphaComposite.SrcOver);
        g2.setColor(new Color(245, 245, 245));
        g2.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        super.paintComponent(g);
    }

    public static enum MessageType {
        SUCCESS, ERROR

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibMessage;
    // End of variables declaration//GEN-END:variables
}
