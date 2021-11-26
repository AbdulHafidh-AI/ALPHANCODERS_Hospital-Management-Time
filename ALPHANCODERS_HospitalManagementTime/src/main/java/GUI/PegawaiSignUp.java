/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Classes.AkunDokter;
/**
 *
 * @author LENOVO C740
 */
public class PegawaiSignUp extends javax.swing.JFrame {

    // Khusus untuk reg pertama akan didapatkan Id secara acak
    static int random = (int) (Math.random() * (1000000 - 100000)) + 100000;
    // convert dia ke string karena data bilangan ini akan di simpan di file database beresktensi .txt
    static String id = Integer.toString(random);

    /**
     * Creates new form DokterSignUp
     */
    public PegawaiSignUp() {
        initComponents();
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }

    private static void tambahAkun(ArrayList<String> data) throws IOException
    {
        // Memanggil method constructor tanpa disertai parameter
        AkunDokter akun = new AkunDokter();

        FileWriter fileWriter = new FileWriter("DatabasePegawai.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(id + "," + akun.getPin() + "," + data.get(2) + "," + data.get(1) + "," + data.get(0));
        bufferedWriter.newLine();
        bufferedWriter.flush();
        // Wajib tutup
        bufferedWriter.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfUsername = new javax.swing.JTextField();
        tfGender = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        ButtonRegister = new javax.swing.JButton();
        ButtonReset = new javax.swing.JButton();
        ButtonReturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);
        jPanel1.add(tfUsername);
        tfUsername.setBounds(420, 220, 200, 40);
        jPanel1.add(tfGender);
        tfGender.setBounds(420, 290, 200, 40);
        jPanel1.add(tfAddress);
        tfAddress.setBounds(420, 370, 200, 40);

        ButtonRegister.setBackground(new java.awt.Color(204, 255, 255));
        ButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonRegister.setText("REGISTER");
        ButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegister);
        ButtonRegister.setBounds(790, 493, 150, 40);

        ButtonReset.setBackground(new java.awt.Color(255, 102, 102));
        ButtonReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonReset.setText("RESET");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonReset);
        ButtonReset.setBounds(680, 290, 100, 40);

        ButtonReturn.setBackground(new java.awt.Color(204, 255, 255));
        ButtonReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonReturn.setText("BACK");
        ButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReturnActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonReturn);
        ButtonReturn.setBounds(90, 490, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Register.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 1070, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReturnActionPerformed
        DokterLogin objekDokterLogin = new DokterLogin();
        objekDokterLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonReturnActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        tfUsername.setText("");
        tfGender.setText("");
        tfAddress.setText("");

    }//GEN-LAST:event_ButtonResetActionPerformed

    private void ButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegisterActionPerformed
        // Inisialisasi varibel dalam kasus membuat akun pekerja rumah sakit
        String nama, alamat, jk;
        // DATA COLLECTION
        ArrayList<String> data = new ArrayList<>();
        nama = tfUsername.getText();
        data.add(nama);
        alamat = tfAddress.getText();
        data.add(alamat);
        jk = tfGender.getText();
        data.add(jk);
        try {
            tambahAkun(data);
        } catch (IOException e) {
            
        }
       
    }//GEN-LAST:event_ButtonRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(PegawaiSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PegawaiSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PegawaiSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PegawaiSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PegawaiSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegister;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfGender;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
