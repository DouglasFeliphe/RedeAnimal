package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import model.Usuario;


public class LoginDAO {
	private Conexao conexao = new Conexao();

	private String sql = "SELECT * FROM usuario WHERE username = ? AND senha = ?";
	private PreparedStatement prepStat;
	private ResultSet resuSet;
	private Usuario usuario;
	public Usuario validarLogin(String usernameDAO, String senhaDAO) {
		try {
			conexao.conecta();
			prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
			prepStat.setString(1, usernameDAO);
			prepStat.setString(2, senhaDAO);
			resuSet = prepStat.executeQuery();
			if (resuSet.next()) {
				usuario = new Usuario(resuSet.getString(1), resuSet.getString(2), resuSet.getString(3),
						resuSet.getString(4), resuSet.getString(5), resuSet.getString(6), resuSet.getString(7),
						resuSet.getString(8), resuSet.getString(9));
			}
			
		} catch (SQLException | ClassNotFoundException erro) {
			System.out.println("Ocorreu um erro na verificação do login\n" + erro);
			
		} finally {
			conexao.desconecta();
		}		
		return usuario;
	}
}
