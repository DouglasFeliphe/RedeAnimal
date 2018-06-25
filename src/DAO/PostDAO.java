package DAO;

import model.Post;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PostDAO {
    
    Conexao conexao;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rSet;
    
    public PostDAO() {
    	conexao = new Conexao();
    }

    //criar post
    public void insert(Post post) throws SQLException, ClassNotFoundException{
        sql = "INSERT INTO post (titulo, username,  cpf_usuario, imagem, mensagem, data_post,"
        		+ "tipo_animal, raca_animal, porte_animal, pelagem_animal,"
        		+ " sexo_animal, situacao_animal) VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";

        conexao.conecta();
            ps = conexao.con.prepareStatement(sql);
            ps.setString(1, post.getTitulo());
            ps.setString(2, post.getUserName());
            ps.setString(3, post.getCpf_usuario());
            ps.setString(4, post.getImagem());
            ps.setString(5, post.getMensagem());
            ps.setString(6, post.getData());
            ps.setString(7, post.getTipo());
            ps.setString(8, post.getRaca());
            ps.setString(9, post.getPorte());
            ps.setString(10, post.getPelagem());
            ps.setString(11, post.getSexo());
            ps.setString(12, post.getSituacao());
            
            ps.executeUpdate();
            ps.close();
            conexao.desconecta(); 
        
    }
    
    //pesquisar post criado
//    public Post select(String valorCampo) throws SQLException, ClassNotFoundException{
//    	
//    	 String sql = "SELECT * FROM post WHERE username = ?";   	 
//   	     	 
//    	 conexao.conecta();
//         ps = (PreparedStatement) conexao.con.prepareStatement(sql);
//		
//		ResultSet rs = ps.executeQuery();
//		
//		rs.next();
//		
//		Post post = new Post();
//		
//		post.setTitulo(rs.getString("titulo"));
//		post.setUserName(rs.getString("username"));
//		post.setCpf_usuario(rs.getString("cpf_usuario"));
//		post.setImagem(rs.getString("imagem"));
//		post.setMensagem(rs.getString("mensagem"));
//		post.setData(rs.getString("data_post"));
//		
//		post.setTipo(rs.getString("tipo_animal"));
//		post.setRaca(rs.getString("raca_animal"));
//		post.setPorte(rs.getString("porte_animal"));
//		post.setPelagem(rs.getString("pelagem_animal"));
//		post.setSexo(rs.getString("sexo_animal"));
//		post.setSituacao(rs.getString("situacao_animal"));
//		
//		return post;
//    	
//    }
    
    //retornando uma lista de  todos os posts do banco
    public List<Post> listarPosts() throws SQLException
    {
        List<Post> posts = new ArrayList<Post>();
        sql = "SELECT * FROM post ORDER BY id_post DESC";
        try {
            conexao.conecta();
            ps = (PreparedStatement) conexao.con.prepareStatement(sql);
            rSet = ps.executeQuery();
            
            while(rSet.next())
            {
                
                Post post = new Post();
				post.setTitulo(rSet.getString("titulo"));
				post.setUserName(rSet.getString("username"));
				post.setCpf_usuario(rSet.getString("cpf_usuario"));
				post.setImagem(rSet.getString("imagem"));
				post.setMensagem(rSet.getString("mensagem"));
				post.setData(rSet.getString("data_post"));
				
				post.setTipo(rSet.getString("tipo_animal"));
				post.setRaca(rSet.getString("raca_animal"));
				post.setPorte(rSet.getString("porte_animal"));
				post.setPelagem(rSet.getString("pelagem_animal"));
				post.setSexo(rSet.getString("sexo_animal"));
				post.setSituacao(rSet.getString("situacao_animal"));
				
				posts.add(post);
				
            }
        } catch (ClassNotFoundException erro) {
            //Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro \n"+erro);
        }
        finally
        {
            conexao.desconecta();
            ps.close();
            rSet.close();
        }
        return posts;
    }
    
}
