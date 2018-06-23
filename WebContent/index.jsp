<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		</strong>
		<a href="cadastro_passo01.jsp"">Não tem uma conta? Clique aqui</a>
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
				
				<form class="navbar-form navbar-left" method="post"
					action="ServletVerificaLogin">
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
	<!-- /.container-fluid --> </nav>


	<!-- CONTEÚDO -->
	<div class="container-fluid">

		<div class="row">
			<div class="col-sm-3 "></div>
			<div class="col-sm-6 ">

				<!-- Título da imagem -->
				<h2 class="text-center">Título da Imagem</h2>

				<!-- Imagem -->
				<div class="panel panel-default">
					<div class="panel-body" id="imagens">
						<img id="imagem" class="img-rounded img-responsive"
							src="imagens/caes.jpeg" alt="sem_imagem" width="660px"
							max-width="initial" max-height="fit-content">
					</div>
				</div>

				<!-- Texto da Imagem -->
				<div class="text-center">
					<article> ivamus viverra sed diam vel consequat. Morbi
					scelerisque metus metus, ut luctus ligula lobortis ac. Aliquam
					dictum commodo libero at consequat. Sed metus est, dignissim quis
					augue at, egestas laoreet libero. Aenean nec aliquet ante. Ut quis
					dapibus lorem. Suspendisse sed mi enim. Maecenas ultrices imperdiet
					aliquet. Nam faucibus tempus lorem in luctus. Suspendisse faucibus,
					neque at finibus iaculis, libero magna ornare mi, ut suscipit
					ligula nulla eu massa. Curabitur fermentum, lacus id ornare
					ultrices, justo ligula lobortis ligula, nec suscipit ex purus nec
					urna. Vestibulum molestie elit non leo consequat, sed rutrum nisl
					gravida. Aenean metus eros, imperdiet eget nulla eget, tristique
					lobortis nisl. Sed commodo mattis velit a facilisis
					 </article>
				</div>
			</div>
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


</body>
</html>
