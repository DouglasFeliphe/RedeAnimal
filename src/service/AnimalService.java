package service;

import DAO.AnimalDAO;
import model.Animal;
import java.sql.SQLException;

public class AnimalService {
	
	private AnimalDAO animalDAO;
	
	public AnimalService() {
		animalDAO = new AnimalDAO();
	}
	
	public void cadastrar(Animal animal) throws SQLException{
		animalDAO.insert(animal);
	}
	
	public Animal pesquisa() throws ClassNotFoundException, SQLException {
		return animalDAO.select();
	}
	
}
