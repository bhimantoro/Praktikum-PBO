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
public class AddGuru extends javax.swing.JFrame {
    Connection conn;
    Statement stmt = null;
    String sql;

    /**
     * Creates new form AddGuru
     */
    public AddGuru(){
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

        jPanel1 = new javax.swing.JPanel();
        btnBatal = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        PassGuru = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NamaGuru = new javax.swing.JTextField();
        NomorInduk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UserGuru = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTambahMateri = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDataUser = new javax.swing.JButton();
        btnTugasSiswa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBatal.setBackground(new java.awt.Color(49, 176, 213));
        btnBatal.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(129, 129, 129));
        btnBatal.setText("Batal");

        btnSubmit.setBackground(new java.awt.Color(49, 176, 213));
        btnSubmit.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(129, 129, 129));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        PassGuru.setFont(new java.awt.Font("Google Sans", 0, 13)); // NOI18N
        PassGuru.setForeground(new java.awt.Color(129, 129, 129));
        PassGuru.setText("Masukkan Password");

        jLabel7.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(129, 129, 129));
        jLabel7.setText("Password");

        NamaGuru.setFont(new java.awt.Font("Google Sans", 0, 13)); // NOI18N
        NamaGuru.setForeground(new java.awt.Color(129, 129, 129));
        NamaGuru.setText("Masukan Nama");

        NomorInduk.setFont(new java.awt.Font("Google Sans", 0, 13)); // NOI18N
        NomorInduk.setForeground(new java.awt.Color(129, 129, 129));
        NomorInduk.setText("Masukan Nomor Induk");
        NomorInduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomorIndukActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 129));
        jLabel5.setText("Nomor Induk");

        UserGuru.setFont(new java.awt.Font("Google Sans", 0, 13)); // NOI18N
        UserGuru.setForeground(new java.awt.Color(129, 129, 129));
        UserGuru.setText("Masukan Username");
        UserGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserGuruActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(129, 129, 129));
        jLabel6.setText("Username");

        jLabel3.setFont(new java.awt.Font("Google Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 129, 129));
        jLabel3.setText("Tambah User Guru");

        jLabel4.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 129));
        jLabel4.setText("Nama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubmit)
                        .addGap(7, 7, 7)
                        .addComponent(btnBatal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomorInduk, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(NomorInduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(UserGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(PassGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addComponent(btnBatal))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 370, 380));

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

        btnLogOut.setBackground(new java.awt.Color(255, 255, 255));
        btnLogOut.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(129, 129, 129));
        btnLogOut.setText("LogOut");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 151, -1));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NomorIndukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomorIndukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomorIndukActionPerformed

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
            String nama = NamaGuru.getText();
            String nomor = NomorInduk.getText();
            String pass = PassGuru.getText();
            String user = UserGuru.getText();
            sql = "INSERT INTO users(`nomor_induk`,`nama`,`username`,`password`,`akses`) VALUES('"+nomor+"','"+nama+"','"+user+"','"+pass+"', 'guru')";
            stmt.executeUpdate(sql);
            this.setVisible(false);
            TambahSiswa datauser = new TambahSiswa();
            datauser.setVisible(true);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void UserGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserGuruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserGuruActionPerformed

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
            java.util.logging.Logger.getLogger(AddGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NamaGuru;
    private javax.swing.JTextField NomorInduk;
    private javax.swing.JTextField PassGuru;
    private javax.swing.JTextField UserGuru;
    private javax.swing.JButton btnBatal;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
