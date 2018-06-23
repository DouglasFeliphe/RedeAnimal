package service;

import DAO.PostDAO;
import model.Post;
import java.sql.SQLException;
import java.util.List;

public class PostService {
	
	private PostDAO postDao;
	
	public PostService() {
		postDao = new PostDAO();
	}
	
	public void cadastrar(Post post) throws SQLException, ClassNotFoundException{
		postDao.insert(post);
	}
	
	public List<Post> listar() throws ClassNotFoundException, SQLException {
		return postDao.listarPosts();
	}
	
}
