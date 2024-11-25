package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HRSalary {

	static final String dburl = "jdbc:mysql://localhost:3306/hrdb";
	static final String dbuser = "hrdb";
	static final String dbpass = "hrdb";
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,
					dbuser, dbpass);

		
			String sql = "select concat(first_name, ' ', last_name) full_name, salary "
					+ "from employees "
					+ "where salary > (select min(salary) from employees) and salary < (select max(salary) from employees) "
					+ "order by salary asc;";
			
			pstmt = conn.prepareStatement(sql);
			
			
            rs = pstmt.executeQuery();
            
        	
        	System.out.println("==============================================================");
            while (rs.next()) {
                System.out.printf("%s \t\t %d%n", 
                                  rs.getString("full_name"), 
                                  rs.getInt("salary"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
