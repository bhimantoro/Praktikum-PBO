/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigassessment;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class TambahMateri extends javax.swing.JFrame {
    Connection conn;
    Statement stmt;
    ResultSet rs;
    String sql;
    private final DefaultTableModel def_mod;
    
    /**
     * Creates new form TambahMateri
     */
    public TambahMateri() {
        initComponents();
        Koneksi db = new Koneksi();
        db.config();
        conn = db.conn;
        stmt = db.stm;
        
        String[] judul={"Mata Pelajaran", "Judul", "Konten Materi"};
        def_mod = new DefaultTableModel(null, judul);
        tambahMateri.setModel(def_mod);
        tampilData();
    }
    
    final void tampilData()
    {
        try
        {
            stmt = conn.createStatement();
            sql = "SELECT * FROM materi";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                String mapel = rs.getString("mata_pelajaran");
                String judul = rs.getString("judul");
                String konten = rs.getString("konten_materi");
                
                String[] kolom = {mapel, judul, konten};
                def_mod.addRow(kolom);
            }
            rs.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnAddMateri = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        entribaris = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnTambahMateri = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTugasSiswa = new javax.swing.JButton();
        btnDataUser = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tambahMateri = new javax.swing.JTable();
        Search = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddMateri.setBackground(new java.awt.Color(49, 176, 213));
        btnAddMateri.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        btnAddMateri.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMateri.setText("Tambah Materi");
        btnAddMateri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMateriActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddMateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 30));

        jLabel3.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 129, 129));
        jLabel3.setText("Show");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        entribaris.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        entribaris.setForeground(new java.awt.Color(129, 129, 129));
        entribaris.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "25", "50", "100" }));
        entribaris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                entribarisMouseReleased(evt);
            }
        });
        entribaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entribarisActionPerformed(evt);
            }
        });
        getContentPane().add(entribaris, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 440));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tambahMateri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tambahMateri);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 410, 340));

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel3.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 125, -1));

        jLabel5.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 129));
        jLabel5.setText("Search");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Google Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 129));
        jLabel4.setText("entries");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 430, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entribarisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entribarisMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_entribarisMouseReleased

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void btnAddMateriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMateriActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AddMateri addmateri=new AddMateri();
        addmateri.setVisible(true);
    }//GEN-LAST:event_btnAddMateriActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login start=new Login();
        start.setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnTugasSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTugasSiswaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DataTugasSiswa tugassiswa=new DataTugasSiswa();
        tugassiswa.setVisible(true);
    }//GEN-LAST:event_btnTugasSiswaActionPerformed

    private void btnDataUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataUserActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TambahSiswa datauser=new TambahSiswa();
        datauser.setVisible(true);
    }//GEN-LAST:event_btnDataUserActionPerformed

    private void btnTambahMateriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMateriActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TambahMateri tambahmateri=new TambahMateri();
        tambahmateri.setVisible(true);
    }//GEN-LAST:event_btnTambahMateriActionPerformed

    private void entribarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entribarisActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_entribarisActionPerformed

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
            java.util.logging.Logger.getLogger(TambahMateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahMateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahMateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahMateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahMateri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search;
    private javax.swing.JButton btnAddMateri;
    private javax.swing.JButton btnDataUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnTambahMateri;
    private javax.swing.JButton btnTugasSiswa;
    private javax.swing.JComboBox<String> entribaris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tambahMateri;
    // End of variables declaration//GEN-END:variables
}