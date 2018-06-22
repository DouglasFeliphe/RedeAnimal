package DAO;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.PreparedStatement;

import model.Animal;
import model.Post;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PostDAO {

	Conexao conexao = new Conexao();

	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;

	public void insert(Post post) throws SQLException {
		sql = "INSERT INTO post(cpf, id_animal, mensagem, data_post, status, imagem) VALUES(?,?,?,?,?,?)";
		try {
			conexao.conecta();
			ps = (PreparedStatement) conexao.con.prepareStatement(sql);
			ps.setString(1, post.getUsuario().getCpf());
			ps.setInt(2, post.getAnimal().getIdAnimal());
			ps.setString(3, post.getDescricao());
			ps.setDate(4, (Date) post.getDataPost());
			ps.setBoolean(5, post.isStatus());
			ps.setBlob(6, post.getImagem());
			ps.execute();

		} catch (ClassNotFoundException erro) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir o post \n" + erro);
		} finally {
			conexao.desconecta();
			ps.close();
		}

	}

	public Post select() throws SQLException, ClassNotFoundException {

		String sql = "SELECT * FROM post;";
		conexao.conecta();
		ps = (PreparedStatement) conexao.con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		rs.next();

		Post post = new Post();
		
		post.getUsuario().setCpf(rs.getString("cpf"));
		post.getAnimal().setIdAnimal(rs.getInt("id_animal"));
		post.setDescricao(rs.getString("descricao"));
		post.setDataPost(rs.getDate("data_post"));
		post.setStatus(rs.getBoolean("status"));
		post.setImagem((Blob) rs.getBlob("imagem"));

		return post;

	}

}
