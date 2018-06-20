package service;

import DAO.LoginDAO;
import model.Usuario;

public class LoginService {
	public Usuario verificaLogin(String username, String senha) {
		LoginDAO loginDAO = new LoginDAO();
		return loginDAO.validarLogin(username, senha);
	}
}
