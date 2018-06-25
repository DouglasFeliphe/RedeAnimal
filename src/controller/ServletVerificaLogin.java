package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Post;
import model.Usuario;
import service.LoginService;
import service.PostService;


@WebServlet("/ServletVerificaLogin")
public class ServletVerificaLogin extends HttpServlet {	
	private static final long serialVersionUID = 1L;   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramUsername = request.getParameter("username");
		String paramSenha = request.getParameter("senha");
		Usuario usuarioLogado = null;
		String pagina = null;		
		String mensagem = null;
		
		LoginService loginService = new LoginService();
	
		usuarioLogado = loginService.verificaLogin(paramUsername, paramSenha);
		
		if(usuarioLogado!=null) {
			pagina = "indexLogin.jsp";
			mensagem = "Logado com sucesso, ";
			
		} else {
			pagina = "index.jsp";
			mensagem = "Usuário ou senha inválidos.";	
			
		}
		
		//listar os posts
		List<Post> posts = new ArrayList<>();
		
		try {
			posts = new PostService().listar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("mensagem", mensagem);
		request.setAttribute("resultadoLogin", usuarioLogado);
		request.setAttribute("listaDePosts", posts);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher(pagina);
		reqDispatcher.forward(request, response);
		
	}
}