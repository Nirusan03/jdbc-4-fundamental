package Statement;

import java.sql.*;

public class Execution_Statement_Select_All {
    public static void main (String[] args) throws SQLException {

        String productData = "";
        String sql = "SELECT * FROM public.product";

        String url = "jdbc:postgresql://localhost:5432/telusko";
        String username = "postgres";
        String password = "";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()){
            for (int i = 1; i < 6; i++){
                productData += rs.getString(i) + " | ";
            }
            productData += "\n";
        }

        System.out.println(productData);

        con.close();
    }
}