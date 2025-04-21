package Statement;

import java.sql.*;

public class Execution_Statement_Insert {
    public static void main (String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/telusko";
        String userName = "postgres";
        String password = "";

        String sql = "INSERT INTO public.product (id, name, type, place, warrenty) VALUES (22, 'Thermal Paste', '2', 'Colombo', 2025)";

        Connection con = DriverManager.getConnection(url, userName,password);
        Statement st = con.createStatement();
        int effectedRows = st.executeUpdate(sql);

        System.out.println("Effected Rows : " + effectedRows);
        con.close();
    }
}
