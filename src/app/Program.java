package app;

import java.sql.SQLException;
import java.util.Scanner;

import crud.dao.DaoManager;
import crud.dao.LibraryDao;
import entities.Library;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		LibraryDao libraryDao = DaoManager.createLibraryDao();
		
		
		
	}
}
