<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Usuario"%>
<%
	Usuario usuario = new Usuario();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/principal.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js/principal.js"></script>

<title>Insert title here</title>
</head>
<body>

	<!-- BARRA DE ALERTA -->
	<div class="alert alert-success">
		<strong> Bem-vindo, Visitante <a href="#"> <span
				class="glyphicon glyphicon-user"></span>
		</a>
		</strong>
	</div>

	<!-- <div class=""> -->

	<!-- CABE�ALHO -->

	<div class="jumbotron">
		<h1>Rede Animal</h1>
		<p>Aenean nec aliquet ante. Ut quis dapibus lorem. Suspendisse sed
			mi enim. Maecenas ultrices imperdiet aliquet. Nam faucibus tempus
			lorem in luctus.</p>
	</div>


	<!-- BARRA DE MENU -->
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Mural</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="#">ONGs <span class="sr-only">(current)</span></a></li>
				<li><a href="#">Quem Somos</a></li>
				<li><a href="#">Contato</a></li>
			</ul>
			<!--  
                    <ul class="nav navbar-nav navbar-right">
                    	<a href="cadastroUsuario.html">N�o tem uma conta? Clique aqui</a>
                    	<form class="navbar-form navbar-left" method="post" action="ServletVerificaLogin">
                    		<div class="form-group">
                    			<input type="text" name="usuario" class="form-control" placeholder="Usu�rio">
                    		</div>
                            <div class="form-group">
                            	<input type="password" name="senha" class="form-control" placeholder="Senha">
                            </div>
                            <button type="submit" class="btn btn-default">Entrar</button>
                        </form>
                    </ul>                                 -->
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>


	<!-- CONTE�DO -->
	<div class="container-fluid">

		<div class="row">
			<div class="col-sm-3 "></div>
			<div class="col-sm-6 ">

				<!-- T�tulo da imagem -->
				<h2 class="text-center">Cadastro</h2>

				<!-- Imagem -->
				<div class="panel panel-default">
					<div class="panel-body" id="cadastro-usuario">
						<form class="navbar-form navbar-left" method="post"
							action="CadastroAnimal">
							<div class="form-group">

								<input type="hidden" name="cpf" value="<%usuario.getCpf();%>"><br>
								Tipo: <input type="text" name="tipo" class="form-control"
									placeholder="Tipo" required> <br> 
								Ra�a: <input type="text"
									name="raca" class="form-control" placeholder="Ra�a"><br>
								Porte: <input type="text" name="porte" class="form-control"
									placeholder="Porte"> <br> 
								Pelagem: <input
									type="text" name="pelagem" class="form-control"
									placeholder="Pelagem"> 
									<br>
								Sexo: <select name="sexo" class="form-control">
							<option value="Macho">Macho</option>
							<option value="Femea">F�mea</option>
								</select> 
								<br>
								
								
								Situa��o<select name="situacao" class="form-control">
							<option value="Perdido">Perdido</option>
							<option value="Enconrado">Encontrado</option>	
								</select> 
								<br>
								Selecione a imagem: <input type="file" name="imagem" required>
								<br>
								<button type="submit" class="btn btn-default">Enviar</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>