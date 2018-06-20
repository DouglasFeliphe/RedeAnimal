package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import service.CadastroService;

public class CadastroDAO {
	private Conexao conexao = new Conexao();
	private String sql;
	private PreparedStatement prepStat;
	private ResultSet resuSet;	

	public void cadastrarUsuario(CadastroService cadastroService) throws SQLException {
		sql = "INSERT INTO usuario (cpf, nome, endereco, cidade, cep, telefone, email, username, senha) VALUES(?,?,?,?,?,?,?,?,?)";
		try {
			conexao.conecta();
			prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
			prepStat.setString(1, cadastroService.getCpf());
			prepStat.setString(2, cadastroService.getNome());
			prepStat.setString(3, cadastroService.getEndereco());
			prepStat.setString(4, cadastroService.getCidade());
			prepStat.setString(5, cadastroService.getCep());
			prepStat.setString(6, cadastroService.getTelefone());
			prepStat.setString(7, cadastroService.getEmail());
			prepStat.setString(8, cadastroService.getUsername());
			prepStat.setString(9, cadastroService.getSenha());
			prepStat.execute();
		} catch (ClassNotFoundException erro) {
			System.out.println("Ocorreu um erro ao inserir o usuário\n" + erro);
		} finally {
			conexao.desconecta();
		}
	}

	public boolean verificarCpfExistenteUsuario(String cpfDAO) throws SQLException {
		boolean retorno = true;
		sql = "SELECT * FROM usuario WHERE cpf = ?";
		try {
			conexao.conecta();
			prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
			prepStat.setString(1, cpfDAO);
			resuSet = prepStat.executeQuery();
			retorno = resuSet.next();

		} catch (SQLException | ClassNotFoundException erro) {
			System.out.println("Ocorreu um erro na verificação do login\n" + erro);

		} finally {
			conexao.desconecta();
		}
		return retorno;
	}

	public boolean verificarUserNamefExistenteUsuario(String userNameDAO) throws SQLException {
		sql = "SELECT * FROM usuario WHERE username = ?";
		boolean retorno = true;
		try {
			conexao.conecta();
			prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
			prepStat.setString(1, userNameDAO);
			resuSet = prepStat.executeQuery();
			retorno = resuSet.next();

		} catch (SQLException | ClassNotFoundException erro) {
			System.out.println("Ocorreu um erro na verificação do login\n" + erro);

		} finally {
			conexao.desconecta();
		}
		return retorno;
	}
}
