package proyek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Koneksi 
{
    Connection conn;
    Statement stm;
    
    public void config() 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/proyek", "root", "");
            stm = conn.createStatement();
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+ e.getMessage());
        }
    }
}
