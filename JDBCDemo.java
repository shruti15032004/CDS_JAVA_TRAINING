import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCDemo {
    public static void main(String[] args) {
        String username= "root";
        String password="";
        String url ="jdbc:mysql://localhost:3306/javabatch2";
        try {
            Connection C= DriverManager.getConnection(url,username,password);
            System.out.println("Database Connected");
        } catch (SQLException e) {
            throw new RuntimeException(e+"Not Connected");
        }
    }
}