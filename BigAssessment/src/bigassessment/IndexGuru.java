/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigassessment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class IndexGuru extends javax.swing.JFrame {
    Connection conn;
    Statement stmt;
    ResultSet rs;
    String sql;

    /**
     * Creates new form IndexGuru
     */
    public IndexGuru() {
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

        jLabel2 = new javax.swing.JLabel();
        btnTambahMateri = new javax.swing.JButton();
        btnDataUser = new javax.swing.JButton();
        btnTugasSiswa = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 243, 243));
        setPreferredSize(new java.awt.Dimension(611, 467));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(129, 129, 129));
        jLabel2.setText("Navigation");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, -1, -1));

        btnTambahMateri.setBackground(new java.awt.Color(255, 255, 255));
        btnTambahMateri.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnTambahMateri.setForeground(new java.awt.Color(129, 129, 129));
        btnTambahMateri.setText("1. Tambah Materi");
        btnTambahMateri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahMateriActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambahMateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 72, 160, -1));

        btnDataUser.setBackground(new java.awt.Color(255, 255, 255));
        btnDataUser.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnDataUser.setForeground(new java.awt.Color(129, 129, 129));
        btnDataUser.setText("2. Data User");
        btnDataUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnDataUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 104, 160, -1));

        btnTugasSiswa.setBackground(new java.awt.Color(255, 255, 255));
        btnTugasSiswa.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnTugasSiswa.setForeground(new java.awt.Color(129, 129, 129));
        btnTugasSiswa.setText("3. Data Tugas Siswa");
        btnTugasSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTugasSiswaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTugasSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 136, 160, -1));

        btnLogOut.setBackground(new java.awt.Color(255, 255, 255));
        btnLogOut.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(129, 129, 129));
        btnLogOut.setText("LogOut");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 212, 151, -1));

        jLabel3.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 129, 129));
        jLabel3.setText("Anda Login Sebagai Guru");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 49, 193, 24));

        jLabel4.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 129));
        jLabel4.setText("Anda Memiliki Fasilitas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 80, 193, 25));

        jLabel5.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 129));
        jLabel5.setText("1. Tambah Materi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 112, 193, 27));

        jLabel6.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(129, 129, 129));
        jLabel6.setText("2. Menambahkan User Siswa dan Guru");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 146, -1, 25));

        jLabel7.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(129, 129, 129));
        jLabel7.setText("3. Melihat Tugas Siswa");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 178, -1, 29));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(157, 173, 227));
        jLabel8.setText("Belajar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(147, 218, 147));
        jLabel1.setText("PD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 410));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 350, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(IndexGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexGuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnTambahMateri;
    private javax.swing.JButton btnTugasSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
