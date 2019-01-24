import java.sql.*;//import class interface
public class hdahjkfa {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/interaksi";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args){
        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM mahasiswa WHERE Nama = 'Ujang'";
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                System.out.println("\nNIM     : "+rs.getString("nim"));
                System.out.println("Nama    : "+rs.getString("nama"));
                System.out.println("Alamat  : "+rs.getString("alamat"));
            }
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
