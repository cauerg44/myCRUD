package app;

import java.util.List;
import java.util.Scanner;

import crud.dao.DaoManager;
import crud.dao.LibraryDao;
import entities.Library;

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
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Session: ");
				String session = sc.nextLine();
				System.out.print("Year published: ");
				Integer yearPublished = sc.nextInt();
				
				Library newRecord = new Library(null, name, session, yearPublished);
				libraryDao.insert(newRecord);
				System.out.println("New record inserted! Id: " + newRecord.getId());
			case 2:
				System.out.print("Enter id for update: ");
				int idForUpdate = sc.nextInt();
				Library libUp = libraryDao.findbyId(idForUpdate);
				System.out.print("Would you like to update name or session? (n/s): ");
				char resp = sc.next().charAt(0);
				sc.nextLine();
				if(resp == 'n') {
					System.out.print("Set name to update: ");
					libUp.setName(sc.nextLine());
					libraryDao.update(libUp);
					System.out.println("Update completed");
					break;
				} else if (resp == 's') {
					System.out.print("Set session to update: ");
					libUp.setSession(sc.nextLine());
					libraryDao.update(libUp);
					System.out.println("Update completed!");
					break;
				} else {
					return;
				}
			case 3:
				System.out.println("LIBRARY COLLECTION: ");
				System.out.println();
				List<Library> libCollection = libraryDao.findAll();
				libCollection.forEach(System.out::println);
			}
		} while (choice != 6);
	}
}
