package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import service.LoginService;


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
		
		request.setAttribute("mensagem", mensagem);
		request.setAttribute("resultadoLogin", usuarioLogado);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher(pagina);
		reqDispatcher.forward(request, response);
		
	}
}