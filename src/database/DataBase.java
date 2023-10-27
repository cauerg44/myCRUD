package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	private static Connection conn = null;

	private static final String urlPostgreSQL = "jdbc:postgresql://localhost:5432/myCRUD";
	private static final String user = "postgres";
	private static final String password = "1234567";

	public static Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(urlPostgreSQL, user, password);
			} catch (SQLException e) {
				throw new DataBaseException(e.getMessage());
			}
		}
		return conn;
	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DataBaseException(e.getMessage());
			}
		}
	}

	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DataBaseException(e.getMessage());
			}
		}
	}

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DataBaseException(e.getMessage());
			}
		}
	}

}