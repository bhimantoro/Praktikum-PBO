/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigassessment;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class AddMateri extends javax.swing.JFrame {
    Connection conn;
    Statement stmt = null;
    String sql;

    /**
     * Creates new form AddMateri
     */
    public AddMateri() {
        initComponents();
        Koneksi db = new Koneksi();
        db.config();
        conn = db.conn;
        stmt = db.stm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MataPelajaran = new javax.swing.JTextField();
        Judul = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnTambahMateri = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDataUser = new javax.swing.JButton();
        btnTugasSiswa = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        KontenMateri = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Google Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 129, 129));
        jLabel3.setText("Isi Materi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 13, -1, -1));

        jLabel4.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 129));
        jLabel4.setText("Mata Pelajaran");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        MataPelajaran.setFont(new java.awt.Font("Google Sans", 0, 13)); // NOI18N
        MataPelajaran.setForeground(new java.awt.Color(129, 129, 129));
        MataPelajaran.setText("Masukan Mata Pelajaran");
        getContentPane().add(MataPelajaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 373, -1));

        Judul.setFont(new java.awt.Font("Google Sans", 0, 13)); // NOI18N
        Judul.setForeground(new java.awt.Color(129, 129, 129));
        Judul.setText("Masukan Penulis");
        Judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JudulActionPerformed(evt);
            }
        });
        getContentPane().add(Judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 373, -1));

        jLabel5.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 129));
        jLabel5.setText("Judul");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(49, 176, 213));
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(129, 129, 129));
        jLabel2.setText("Navigation");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        btnTambahMateri.setBackground(new java.awt.Color(255, 255, 255));
        btnTambahMateri.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnTambahMateri.setForeground(new java.awt.Color(129, 129, 129));
        btnTambahMateri.setText("1. Tambah Materi");
        btnTambahMateri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahMateriActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambahMateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(157, 173, 227));
        jLabel8.setText("Belajar");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(147, 218, 147));
        jLabel1.setText("PD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        btnDataUser.setBackground(new java.awt.Color(255, 255, 255));
        btnDataUser.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnDataUser.setForeground(new java.awt.Color(129, 129, 129));
        btnDataUser.setText("2. Data User");
        btnDataUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnDataUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, -1));

        btnTugasSiswa.setBackground(new java.awt.Color(255, 255, 255));
        btnTugasSiswa.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnTugasSiswa.setForeground(new java.awt.Color(129, 129, 129));
        btnTugasSiswa.setText("3. Data Tugas Siswa");
        btnTugasSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTugasSiswaActionPerformed(evt);
            }
        });
        jPanel2.add(btnTugasSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        btnLogOut.setBackground(new java.awt.Color(255, 255, 255));
        btnLogOut.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(129, 129, 129));
        btnLogOut.setText("LogOut");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 151, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 440));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(129, 129, 129));
        jLabel7.setText("Konten Materi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(KontenMateri, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(2, 2, 2)
                .addComponent(KontenMateri, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 400, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JudulActionPerformed

    private void btnTambahMateriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMateriActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TambahMateri tambahmateri=new TambahMateri();
        tambahmateri.setVisible(true);
    }//GEN-LAST:event_btnTambahMateriActionPerformed

    private void btnDataUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataUserActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TambahSiswa datauser=new TambahSiswa();
        datauser.setVisible(true);
    }//GEN-LAST:event_btnDataUserActionPerformed

    private void btnTugasSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTugasSiswaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DataTugasSiswa tugassiswa=new DataTugasSiswa();
        tugassiswa.setVisible(true);
    }//GEN-LAST:event_btnTugasSiswaActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login start=new Login();
        start.setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        try {
            stmt = conn.createStatement();
            String mapel = MataPelajaran.getText();
            String judul = Judul.getText();
            String konten = KontenMateri.getText();
            sql = "INSERT INTO materi(`mata_pelajaran`, `judul`, `konten_materi`) VALUES('"+mapel+"', '"+judul+"', '"+konten+"')";
            stmt.executeUpdate(sql);
            this.setVisible(false);
            TambahMateri tambahmateri = new TambahMateri();
            tambahmateri.setVisible(true);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(AddMateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMateri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Judul;
    private javax.swing.JTextField KontenMateri;
    private javax.swing.JTextField MataPelajaran;
    private javax.swing.JButton btnDataUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnTambahMateri;
    private javax.swing.JButton btnTugasSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}