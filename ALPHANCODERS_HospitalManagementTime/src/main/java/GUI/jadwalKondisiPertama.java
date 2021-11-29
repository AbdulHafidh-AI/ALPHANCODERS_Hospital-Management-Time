/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.time.LocalDate;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane; 

/**
 *
 * @author ACER
 */
public class jadwalKondisiPertama extends javax.swing.JFrame {

    /**
     * Creates new form jadwalKondisiKeempat
     */
    public jadwalKondisiPertama() {
        initComponents();
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jButtonLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonTanggal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        jButtonLogout.setContentAreaFilled(false);
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLogout);
        jButtonLogout.setBounds(80, 390, 70, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 390, 60, 70);

        jButtonTanggal.setContentAreaFilled(false);
        jButtonTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTanggalActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonTanggal);
        jButtonTanggal.setBounds(70, 240, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/date.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 240, 90, 80);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("07:00 - 10:00");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(300, 200, 100, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("10:00 - 13:00");
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(300, 250, 100, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("13:00 - 16:00");
        jPanel2.add(jRadioButton3);
        jRadioButton3.setBounds(300, 300, 100, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("16:00 - 19:00");
        jPanel2.add(jRadioButton4);
        jRadioButton4.setBounds(300, 350, 100, 23);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("19:00 - 20:00");
        jPanel2.add(jRadioButton5);
        jRadioButton5.setBounds(470, 200, 100, 23);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("22:00 - 01:00");
        jPanel2.add(jRadioButton6);
        jRadioButton6.setBounds(470, 250, 100, 23);

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("01:00 - 04:00");
        jPanel2.add(jRadioButton7);
        jRadioButton7.setBounds(470, 300, 100, 23);

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("04:00 - 07:00");
        jPanel2.add(jRadioButton8);
        jRadioButton8.setBounds(470, 350, 100, 23);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/5.png"))); // NOI18N
        jPanel2.add(BG);
        BG.setBounds(2, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButtonTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTanggalActionPerformed
        LocalDate objekMelihatTanggal = LocalDate.now();
       JOptionPane.showMessageDialog(this, "TANGGAL HARI INI ADALAH: " + objekMelihatTanggal);
    }//GEN-LAST:event_jButtonTanggalActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(jadwalKondisiPertama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwalKondisiPertama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwalKondisiPertama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwalKondisiPertama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwalKondisiPertama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    // End of variables declaration//GEN-END:variables
}
