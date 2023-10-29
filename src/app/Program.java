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
		
		System.out.println("\n=== TEST 1: findById ===");
		System.out.println("Enter id for search: ");
		int idSearch = sc.nextInt();
		Library lib = libraryDao.findbyId(idSearch);
		System.out.println(lib);
		
	}
}
