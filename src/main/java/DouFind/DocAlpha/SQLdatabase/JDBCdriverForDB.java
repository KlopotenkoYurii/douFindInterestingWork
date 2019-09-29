package DouFind.DocAlpha.SQLdatabase;

import DouFind.ClassFeatures;
import org.testng.annotations.Test;

import java.sql.*;

public class JDBCdriverForDB extends ClassFeatures {

    @Test

    public void connection() throws ClassNotFoundException, SQLException {

        //Loading the required JDBC Driver class
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        //Creating a connection to the database
        Connection conn = null;
        String connectionUrl = "jdbc:sqlserver://<localhost>:1433;databaseName=<TestDB>;integratedSecurity=true;user=<Yurii>;password=<52679>";
        conn = DriverManager.getConnection(connectionUrl);

        //Executing SQL query and fetching the result
        Statement st = conn.createStatement();
        String sqlStr = "select * from TableForTest";
        ResultSet rs = st.executeQuery(sqlStr);
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }       }
}
