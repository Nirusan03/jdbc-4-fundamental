import java.sql.*;

public class Demo {
    public static void main (String[] args) throws SQLException {

        String sql = "SELECT name FROM public.product WHERE name = 'Laptop'";

        String url = "jdbc:postgresql://localhost:5432/telusko";
        String username = "postgres";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        rs.next();

        String name = rs.getString(1);

        System.out.println(name);

        con.close();
    }
}