package crud.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import crud.dao.LibraryDao;
import database.DataBase;
import database.DataBaseException;
import entities.Library;

public class LibraryJDBC implements LibraryDao{

	private Connection conn;
	
	public LibraryJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Library library) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"insert into library "
					+ "(name, session, year_of_publication) "
					+ "values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, library.getName());
			st.setString(2, library.getSession());
			st.setInt(3, library.getYear_of_publication());
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					long id = rs.getInt(1);
					library.setId(id);
				}
				DataBase.closeResultSet(rs);
			}
			else {
				throw new DataBaseException("Erro! There were no records!");
			}
		}
		catch(SQLException e) {
			throw new DataBaseException(e.getMessage());
		}
		finally {
			DataBase.closeStatement(st);
		}
	}

	@Override
	public void update(Library library) {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(
					"update library "
					+ "set name = ? "
					+ "where id = ?");
			
			ps.setString(1, library.getName());
			ps.setLong(2, library.getId());
			
			ps.executeUpdate();
		}
		catch(SQLException e) {
			throw new DataBaseException(e.getMessage());
		}
		finally {
			DataBase.closeConnection();
		}
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Library findbyId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Library> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
