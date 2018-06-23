package DAO;

import model.Post;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {
    
    Conexao conexao = new Conexao();
//    private Animal animal = new Animal();

    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    //criar post
    public void insert(Post post) throws SQLException, ClassNotFoundException{
        sql = "INSERT INTO post (titulo, username,  cpf_usuario, imagem, mensagem, data_post,"
        		+ "tipo_animal, raca_animal, porte_animal, pelagem_animal, sexo_animal, situacao_animal) VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";

        conexao.conecta();
            ps = conexao.con.prepareStatement(sql);
            ps.setString(1, post.getTitulo());
            ps.setString(2, post.getUserName());
            ps.setString(4, post.getCpf_usuario());
            ps.setString(3, post.getImagem());
            ps.setString(5, post.getMensagem());
            ps.setString(6, post.getData());
            
            ps.setString(7, post.getTipo());
            ps.setString(8, post.getRaca());
            ps.setString(9, post.getPorte());
            ps.setString(10, post.getPelagem());
            ps.setString(11, post.getSexo());
            ps.setString(12, post.getSituacao());
            
//          prepStat.setBlob(8, animal.getImagem());
                      
            ps.executeUpdate();
            ps.close();
            conexao.desconecta(); 
        
    }
    
    //pesquisar post criado
//    public Post select(String valorCampo) throws SQLException, ClassNotFoundException{
//    	
//    	 String sql = "SELECT * FROM post WHRERE username = ?";   	 
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
    public List<Post> listarPosts() throws ClassNotFoundException, SQLException {
    	
    	//criando os objetos
    	List<Post> posts = new ArrayList<>();
    	Post post = new Post();
    	
    	sql = "select * from post;";
    	
    	conexao.conecta();
    	rs = ps.executeQuery();
    	
    	while(rs.next()) {

    		post.setTitulo(rs.getString("titulo"));
    		post.setUserName(rs.getString("username"));
    		post.setCpf_usuario(rs.getString("cpf_usuario"));
    		post.setImagem(rs.getString("imagem"));
    		post.setMensagem(rs.getString("mensagem"));
    		post.setData(rs.getString("data_post"));
    		
    		post.setTipo(rs.getString("tipo_animal"));
    		post.setRaca(rs.getString("raca_animal"));
    		post.setPorte(rs.getString("porte_animal"));
    		post.setPelagem(rs.getString("pelagem_animal"));
    		post.setSexo(rs.getString("sexo_animal"));
    		post.setSituacao(rs.getString("situacao_animal"));
    		
    		posts.add(post);
    		
    	}
    	
    	
    	
    	return posts;
    	
    }
    
    
}
