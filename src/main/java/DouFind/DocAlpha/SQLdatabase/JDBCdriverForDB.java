package DouFind.DocAlpha.SQLdatabase;

import DouFind.ClassFeatures;
import org.testng.annotations.Test;

import java.sql.*;

public class JDBCdriverForDB extends ClassFeatures {

    @Test

    public void connection() throws ClassNotFoundException, SQLException {

        //Loading the required JDBC Driver class
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        //Create connection to the database
        Connection conn = null;
        String connectionUrl = "jdbc:sqlserver://<localhost>:1434;databaseName=<991>;integratedSecurity=true;user=<sa>;password=<Artsyl0154dA>";
        conn = DriverManager.getConnection(connectionUrl);

        //Executing SQL query and fetching the result
        Statement st = conn.createStatement();
        String sqlStr = "select * from TabKod";
        ResultSet rs = st.executeQuery(sqlStr);
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
    }
}
