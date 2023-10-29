package app;

import java.sql.SQLException;

import crud.dao.DaoManager;
import crud.dao.LibraryDao;
import entities.Library;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		LibraryDao libraryDao = DaoManager.createLibraryDao();
		
		System.out.println("\n=== TEST 1 : INSERT ===");
		Library newBook = new Library(null, "C# .NET", "Tech", 2018);
		libraryDao.insert(newBook);
		
		
		System.out.println("\n=== TEST 2 : DELETE ===");
		
	}
}
