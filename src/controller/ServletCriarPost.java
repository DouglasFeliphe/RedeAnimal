package controller;

import model.Post;
import service.PostService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

@WebServlet("/ServletCriarPost")
public class ServletCriarPost extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// pegando os campos da página de criação de post

		// dados do post
		String parTitulo = request.getParameter("titulo");
		String parImagem = request.getParameter("imagem");
		String parMensagem = request.getParameter("mensagem");
		String parData = request.getParameter("data");

		// dados do animal
		String paramTipo = request.getParameter("tipo");
		String parRaca = request.getParameter("raca");
		String parPorte = request.getParameter("porte");
		String parPelagem = request.getParameter("pelagem");
		String parSexo = request.getParameter("sexo");
		String parSituacao = request.getParameter("situacao");

		// inserindo na model 'Post'
		Post post = new Post();
		post.setTitulo(parTitulo);
		post.setUserName("fulanodetal"); // usuário de teste

		post.setImagem(parImagem);
		//enviando arquivo para a pasta imagens
		 try {
	            String inFileName = "C:\\Users\\salguod\\Pictures\\interruptor.jpg";
	            String outFileName = "D:\\copia.jpg";
	            FileInputStream in = new FileInputStream(inFileName);
	            FileOutputStream out = new FileOutputStream(outFileName);
	            byte[] buf = new byte[1024];
	            int len;
	            while ((len = in.read(buf)) > 0) {
	                out.write(buf, 0, len);
	            }
	            out.close();
	            in.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
		post.setMensagem(parMensagem);
		post.setData(parData);
		post.setCpf_usuario("21212121212"); // cpf de fulanodetal
		post.setTipo(paramTipo);
		post.setRaca(parRaca);
		post.setPorte(parPorte);
		post.setPelagem(parPelagem);
		post.setSexo(parSexo);
		post.setSituacao(parSituacao);

		// adicionando ao banco de dados
		try {
			new PostService().cadastrar(post);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		// retornando uma requisição com uma lista de todos os post criados.
		
		List<Post> resposta = new ArrayList<>();

		try {
			resposta = new PostService().listar();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// setando um atributo
		request.setAttribute("listaDePosts", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("indexLogin.jsp");
		reqDispatcher.forward(request, response);

	}

}
