package service;

import DAO.PostDAO;
import model.Animal;
import model.Post;
import java.sql.SQLException;;

public class PostService {
	
	private PostDAO postDao;
	
	public PostService() {
		postDao = new PostDAO();
	}
	
	public void criar(Post post) throws SQLException{
		postDao.insert(post);
	}
	
	public Post pesquisa() throws ClassNotFoundException, SQLException {
		return postDao.select();
	}

}
