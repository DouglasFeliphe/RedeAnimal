package testesJUnit;

import DAO.PostDAO;
import model.Post;

public class PostDaoTest {
	
	private PostDAO postDao = new PostDAO();
	private Post post;

/*	@Test
	public void testListarPosts() throws SQLException {
		
		postDao.listarPosts();
		//List<Post> resultadoList = new ArrayList<>();
		assertEquals(18, postDao.listarPosts());
	}*/
	
/*	@Test
	public void inserirPost() throws ClassNotFoundException, SQLException {
		post = new Post();
		post.setTitulo("teste");
		post.setUserName("fulanodetal"); // usuário de teste
		post.setMensagem("teste");
		post.setData("teste");
		post.setCpf_usuario("teste"); // cpf de fulanodetal
		post.setTipo("teste");
		post.setRaca("teste");
		post.setPorte("teste");
		post.setPelagem("teste");
		post.setSexo("teste");
		post.setSituacao("teste");
		
		postDao.insert(post);
		assertEquals( , postDao.insert(post));
	}*/

}
