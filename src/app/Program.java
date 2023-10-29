package app;

import java.util.Scanner;

import crud.dao.DaoManager;
import crud.dao.LibraryDao;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LibraryDao libraryDao = DaoManager.createLibraryDao();
		
		int choice;
		
		do{
			System.out.println("1 - INSERT");
			System.out.println("2 - UPDATE");
			System.out.println("3 - FIND ALL");
			System.out.println("4 - FIND BY ID");
			System.out.println("5 - DELETE BY ID");
			System.out.println("6 - EXIT");
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				
			}
		} while (choice != 6);
	}
}
