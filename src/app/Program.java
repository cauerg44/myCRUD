package app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import crud.dao.DaoManager;
import crud.dao.LibraryDao;
import entities.Library;
import model.entities.Department;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		LibraryDao libraryDao = DaoManager.createLibraryDao();
		
		System.out.println("\n=== TEST 2: findAll ===");
		List<Library> libs = libraryDao.findAll();
		libs.forEach(System.out::println);
		
	}
}
