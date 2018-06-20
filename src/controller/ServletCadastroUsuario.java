package controller;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.VerificadorService;
import service.CadastroService;

@WebServlet("/ServletCadastroUsuario")
public class ServletCadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramCpf = request.getParameter("cpf");
		String paramUsername = request.getParameter("username");
		
		String paramNome = request.getParameter("nome");
		String paramEndereco = request.getParameter("endereco");
		String paramCidade = request.getParameter("cidade");
		String paramCep = request.getParameter("cep");
		String paramEmail = request.getParameter("email");
		String paramTelefone = request.getParameter("telefone");	
		String paramSenha1 = request.getParameter("senha1");
		String paramSenha2 = request.getParameter("senha2");
		
		String resultadoVerificacao = null;
		String resposta = null;		
		String pagina = null;
		String parametro1 = null;
		String parametro2 = null;
		
		VerificadorService verificador = new VerificadorService();
		CadastroService usuarioVerificado = new CadastroService();
		
		if (paramCpf!=null && paramUsername==null) {
			resultadoVerificacao = "resultadoCpf";
			try {
				if(verificador.verificaCpf(paramCpf)) {
					resposta = "CPF já cadastrado. Digite um cpf não cadastrado.";
					pagina = "cadastro_passo01.jsp";
					
				} else {
					resposta = "CPF validado.";
					pagina = "cadastro_passo02.jsp";
					usuarioVerificado.setCpf(paramCpf);					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		
		if (paramCpf!=null && paramUsername!=null) {
			resultadoVerificacao = "resultadoUsername";
			try {
				if(verificador.verificaUserName(paramUsername)) {
					resposta = "Username já cadastrado. Digite um username não cadastrado.";
					pagina = "cadastro_passo02.jsp";
					
				} else {
					resposta = "Username validado.";
					pagina = "cadastro_passo03.jsp";
					usuarioVerificado.setCpf(paramCpf);	
					usuarioVerificado.setUsername(paramUsername);					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (paramCpf!=null && paramUsername!=null && paramSenha1!=null && paramSenha2!=null) {
			if (verificador.verificaSenha(paramSenha1, paramSenha2)) {
				try {
					usuarioVerificado.cadastrar(paramCpf, paramNome, paramEndereco, paramCidade, paramCep, paramTelefone, paramEmail, paramUsername, paramSenha1);
				} catch (SQLException e) {
					e.printStackTrace();
				}				
		        pagina = "/ServletVerificaLogin";
		        parametro1 = usuarioVerificado.getUsername();
		        parametro2 = usuarioVerificado.getSenha();
		        
			} else {
				resultadoVerificacao = "resultadoSenha";
				resposta = "A segunda senha não confere com a primeira. Digite a senha novamente.";
				pagina = "cadastro_passo03.jsp";
				usuarioVerificado.setCpf(paramCpf);	
				usuarioVerificado.setUsername(paramUsername);
				usuarioVerificado.setNome(paramNome);	
				usuarioVerificado.setEndereco(paramEndereco);
				usuarioVerificado.setCidade(paramCidade);	
				usuarioVerificado.setCep(paramCep);
				usuarioVerificado.setTelefone(paramTelefone);	
				usuarioVerificado.setEmail(paramEmail);				
			}
		}
		request.setAttribute("username", parametro1);
		request.setAttribute("senha", parametro2);
		request.setAttribute("usuarioTemp", usuarioVerificado);		
		request.setAttribute(resultadoVerificacao, resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher(pagina);
		reqDispatcher.forward(request, response);
	}

}
