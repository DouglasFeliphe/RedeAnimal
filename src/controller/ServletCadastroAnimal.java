package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.*;

@WebServlet("/ServletCadastroAnimal")
public class ServletCadastroAnimal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String cpf = request.getParameter("cpf");
		String paramTipo = request.getParameter("tipo");
		String raca = request.getParameter("raca");
		String porte = request.getParameter("porte");
		String pelagem = request.getParameter("pelagem");
		String sexo = request.getParameter("sexo");
		String situacao = request.getParameter("situacao");
		/*Blob imagem = request.getParameter("imagem");*/
	/*	TODO*/
		String resposta = null;
		request.setAttribute("resultadoLogin", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("indexLogin.jsp");
		reqDispatcher.forward(request, response);
		
	}

}
