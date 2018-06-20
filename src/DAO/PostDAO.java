package DAO;

import com.mysql.jdbc.PreparedStatement;

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
 
    public void criarPost(Post post) throws SQLException{
        sql = "INSERT INTO post(cpf, id_animal, mensagem, data_post, status, imagem) VALUES(?,?,?,?,?,?)";
        try {
            conexao.conecta();
            ps = (PreparedStatement) conexao.con.prepareStatement(sql);
            ps.setInt(1, post.getCpf());
            ps.setInt(2, post.getCpf());
            ps.setString(3, post.getMensagem());            
            ps.setDate(4, (Date) post.getDataPost());
            ps.setBoolean(5, post.isStatus());
            ps.setBlob(6, post.getImagem());
            ps.execute();
            
            
        } catch (ClassNotFoundException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao inserir o post \n"+erro);
        }
        finally
        {
            conexao.desconecta();
            ps.close();
        }

    }



}
