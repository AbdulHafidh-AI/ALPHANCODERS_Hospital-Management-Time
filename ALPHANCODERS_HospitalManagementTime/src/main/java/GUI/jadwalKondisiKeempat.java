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
* sebuah class untuk memilih jadwal kerja
* @author Alphancoders
* @version 2021.11.27
*/
public class jadwalKondisiKeempat extends javax.swing.JFrame {

    /**
     * Creates new form jadwalKondisiKeempat
     */
    public jadwalKondisiKeempat() {
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButtonLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonDate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonCekJadwal = new javax.swing.JButton();
        icon_2 = new javax.swing.JLabel();
        icon_1 = new javax.swing.JLabel();
        icon_3 = new javax.swing.JLabel();
        icon_4 = new javax.swing.JLabel();
        icon_5 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        jRadioButton1.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("07:00 - 19:00");
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(400, 240, 130, 30);

        jRadioButton2.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("19:00 - 07:00");
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(630, 240, 130, 30);

        jButtonLogout.setContentAreaFilled(false);
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLogout);
        jButtonLogout.setBounds(80, 400, 70, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 400, 70, 80);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(230, 450, 800, 116);

        jButtonDate.setContentAreaFilled(false);
        jButtonDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDate);
        jButtonDate.setBounds(70, 260, 80, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("WAKTU KERJA ANDA MINIMAL 12 JAM DIKARENKAN ANDA MENANGANI KURANG LEBIH 90 PASIEN");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(300, 640, 730, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ANDA BERPERAN SEBAGAI TENAGA MEDIS DI RUMAH SAKIT INI");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(360, 590, 650, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/date.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 260, 90, 80);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("CHOOSE YOUR FAVOURITE TIME ^_^");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(670, 130, 380, 22);

        jButtonCekJadwal.setBackground(new java.awt.Color(255, 153, 255));
        jButtonCekJadwal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCekJadwal.setText("CEK JADWAL");
        jButtonCekJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCekJadwalActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCekJadwal);
        jButtonCekJadwal.setBounds(830, 400, 140, 25);

        icon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Doctor & Nurse.png"))); // NOI18N
        jPanel2.add(icon_2);
        icon_2.setBounds(1140, 600, 102, 120);

        icon_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hospital.png"))); // NOI18N
        jPanel2.add(icon_1);
        icon_1.setBounds(1070, 480, 250, 240);

        icon_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Awan.png"))); // NOI18N
        jPanel2.add(icon_3);
        icon_3.setBounds(1060, 370, 240, 100);

        icon_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Awan.png"))); // NOI18N
        jPanel2.add(icon_4);
        icon_4.setBounds(1110, 430, 240, 100);

        icon_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Awan.png"))); // NOI18N
        jPanel2.add(icon_5);
        icon_5.setBounds(990, 450, 240, 100);

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

    private void jButtonDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDateActionPerformed
         LocalDate objekMelihatTanggal = LocalDate.now();
        JOptionPane.showMessageDialog(this, "TANGGAL HARI INI ADALAH: " + objekMelihatTanggal);
    }//GEN-LAST:event_jButtonDateActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
       
        System.exit(0);
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonCekJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCekJadwalActionPerformed
        String pernyataan;
        if(jRadioButton1.isSelected()){
           pernyataan = "WAKTU MASUK: 07:00" +
                        "\nWAKTU KELUAR: 19.00"
                       +"\nANDA HARUS MASUK JAM 7 PAGI DAN DIPERBOLEHKAN PULANG JAM 7 MALAM"
                   ; 
        }else{
            pernyataan = "WAKTU MASUK: 19:00" +
                        "\nWAKTU KELUAR: 07.00"
                        +"\nANDA HARUS MASUK JAM MALAM DAN DIPERBOLEHKAN PULANG JAM 7 PAGI"
                    ; 
        }
        jTextArea1.setText(pernyataan);
    }//GEN-LAST:event_jButtonCekJadwalActionPerformed

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
            java.util.logging.Logger.getLogger(jadwalKondisiKeempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwalKondisiKeempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwalKondisiKeempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwalKondisiKeempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwalKondisiKeempat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel icon_1;
    private javax.swing.JLabel icon_2;
    private javax.swing.JLabel icon_3;
    private javax.swing.JLabel icon_4;
    private javax.swing.JLabel icon_5;
    private javax.swing.JButton jButtonCekJadwal;
    private javax.swing.JButton jButtonDate;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
