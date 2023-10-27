package crud.dao;

import java.util.List;

import entities.Library;

public interface LibraryDao {

	void insert(Library library);
	void update(Library library);
	void deleteById(Integer id);
	Library findbyId(Integer id);
	List<Library> findAll();
}
