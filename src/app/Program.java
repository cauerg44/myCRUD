package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DataBase;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DataBase.getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("select * from library");
		
		while(rs.next()) {
			System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
		}
	}
}
