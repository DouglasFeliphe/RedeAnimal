package controller;

import model.Animal;
import service.AnimalService;

import java.io.IOException;
import java.sql.SQLException;

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
		
		String resposta = null;
		
		//pegando os campos da página de cadastro
		String cpf = request.getParameter("cpf");
		String paramTipo = request.getParameter("tipo");
		String raca = request.getParameter("raca");
		String porte = request.getParameter("porte");
		String pelagem = request.getParameter("pelagem");
		String sexo = request.getParameter("sexo");
		String situacao = request.getParameter("situacao");
		/*Blob imagem = request.getParameter("imagem");*/
		
		//inserindo na model
		Animal post = null;
		Animal animal = new Animal();
		animal.setCpf_usuario(cpf);
		animal.setTipo(paramTipo);
		animal.setRaca(raca);
		animal.setPorte(porte);
		animal.setPelagem(pelagem);
		animal.setSexo(sexo);
		animal.setSituacao(situacao);
		
		//adicionando ao banco
		try {
			new AnimalService().cadastrar(animal);
			
		} catch (SQLException e) {
			e.printStackTrace();
		};
		
		try {
			post = new AnimalService().pesquisa();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	TODO*/
		
		request.setAttribute("post", post);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("indexLogin.jsp");
		reqDispatcher.forward(request, response);
		
	}

}
