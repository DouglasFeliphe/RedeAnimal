<%@ page import="org.apache.jasper.tagplugins.jstl.core.Import"
	import="service.PostService" import="model.Post"
	import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/principal.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js/principal.js"></script>
<title>Rede Animal</title>
</head>
<body>

	<!-- BARRA DE ALERTA -->
	<div class="alert alert-success">
		<strong> Bem Vindo, Visitante <a href="#"> <span
				class="glyphicon glyphicon-user"></span>
		</a>
		</strong> <a href="cadastro_passo01.jsp">Não tem uma conta? Clique aqui</a>
	</div>

	<!-- <div class=""> -->

	<!-- CABEÇALHO -->

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
				<a class="navbar-brand" href="index.jsp">Mural</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="#">ONGs <span class="sr-only">(current)</span></a></li>
					<li><a href="#">Quem Somos</a></li>
					<li><a href="#">Contato</a></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<form action="ServletVerificaLogin" method="post"
						class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" name="username" class="form-control"
								placeholder="Usuário">
						</div>
						<div class="form-group">
							<input type="password" name="senha" class="form-control"
								placeholder="Senha">
						</div>
						<button type="submit" class="btn btn-default">Entrar</button>
					</form>
				</ul>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>


	<!-- CONTEÚDO -->

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 "></div>
			<div class="col-sm-6 ">


				<!-- POST -->
				<%
					List<Post> lista = (List) new PostService().listar();
					if (lista != null) {
						for (Post p : lista) {
				%>
				<!-- Título do Post -->
				<h2 class="text-center"><%=p.getTitulo()%></h2>

				<!-- Imagem do Post-->
				<div class="panel panel-default">
					<div class="panel-body" id="imagens">
						<img id="imagem" class="img-rounded img-responsive"
							src="imagens/<%=p.getImagem()%>" alt="sem_imagem" width="660px"
							max-width="initial" max-height="fit-content">
					</div>
				</div>

				<!--  Texto do Post -->
				<div class="text-center">
					<article><%=p.getMensagem()%></article>
				</div>

				<%
					}
					} else {
						out.println("lista vazia");
					}
				%>

				<!-- FIM DO POST -->


				<!--    <div class="col-sm-3 ">
                <button type="button" class="btn btn-info btn-circle btn-xl "><i class="glyphicon glyphicon-plus "></i></button>
            </div>  -->
			</div>
			<br>
			<!-- ROPAPÉ -->
			<footer>
				<hr>
				<div class="text-center">&copy;2018 Rede Animal</div>
			</footer>
		</div>
	</div>
</body>
</html>
