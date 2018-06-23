package controller;

import model.Post;
import model.Usuario;
import service.PostService;
import service.CadastroService;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.*;

@WebServlet("/ServletCriarPost")
public class ServletCriarPost extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		//pegando os campos da página de criação de post
		
			//dados do post
		String parTitulo = request.getParameter("titulo");
		String parImagem = request.getParameter("imagem");
		String parMensagem =  request.getParameter("mensagem");
		String parData = request.getParameter("data");
		
			//dados do animal
		String paramTipo = request.getParameter("tipo");
		String parRaca = request.getParameter("raca");
		String parPorte = request.getParameter("porte");
		String parPelagem = request.getParameter("pelagem");
		String parSexo = request.getParameter("sexo");
		String parSituacao = request.getParameter("situacao");
		
		
		//inserindo na model 'Post'
		Post post = new Post();
		
		post.setTitulo(parTitulo);
		post.setUserName("fulanodetal"); //usuário de teste
		post.setImagem(parImagem);
		post.setMensagem(parMensagem);
		post.setData(parData);
		
		post.setCpf_usuario("21212121212"); //cpf de fulanodetal
		post.setTipo(paramTipo);
		post.setRaca(parRaca);
		post.setPorte(parPorte);
		post.setPelagem(parPelagem);
		post.setSexo(parSexo);
		post.setSituacao(parSituacao);
		
		
		//adicionando ao banco de dados
		try {
			new PostService().cadastrar(post);
			
		} catch (SQLException e) {
			e.printStackTrace();
		};
		
		//retornando uma requisição com uma lista de todos os post criados.
		Object resposta = null;
		
		try {
			resposta = new PostService().listar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// setando um atributo
		request.setAttribute("post", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("indexLogin.jsp");
		reqDispatcher.forward(request, response);
		
	}

}
