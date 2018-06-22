package service;

import java.sql.SQLException;

import DAO.CadastroDAO;

public class VerificadorService {
	public boolean verificaCpf(String cpf) throws SQLException {
		CadastroDAO cadastroDAO = new CadastroDAO();
		return cadastroDAO.verificarCpfExistenteUsuario(cpf);		
	}
	
	public boolean verificaUserName(String username) throws SQLException {
		CadastroDAO cadastroDAO = new CadastroDAO();
		return cadastroDAO.verificarUserNamefExistenteUsuario(username);		
	}
	
	public boolean verificaSenha(String senha1, String senha2) {
		return senha1.equals(senha2);
	}
	
}
