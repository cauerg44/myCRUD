package crud.dao;

import crud.dao.impl.LibraryJDBC;
import database.DataBase;

public class DaoManager{
	
	public static LibraryDao createLibraryDao() {
		return new LibraryJDBC(DataBase.getConnection());
	}

}
