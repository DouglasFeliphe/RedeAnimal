<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List" import="model.Post"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/indexlogin.css">
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
		<strong> ${mensagem} ${resultadoLogin.nome} <a href="#">
				<span class="glyphicon glyphicon-user"></span>
		</a>
		</strong> <a href="index.jsp"><button class="btn btn-default">Sair</button></a>
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
			<a class="navbar-brand" href="indexLogin.jsp">Mural</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="#">ONGs <span class="sr-only">(current)</span></a></li>
				<li><a href="#">Quem Somos</a></li>
				<li><a href="#">Contato</a></li>
			</ul>

			<!--      <ul class="nav navbar-nav navbar-right">
                    	<form class="navbar-form navbar-left" method="post" action="ServletVerificaLogin">
                    		<div class="form-group">
                    			<input type="text" name="usuario" class="form-control" placeholder="Usuï¿½rio">
                    		</div>
                            <div class="form-group">
                            	<input type="password" name="senha" class="form-control" placeholder="Senha">
                            </div>
                            <button type="submit" class="btn btn-default">Entrar</button>
                        </form>
                    </ul>  -->
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>


	<!-- CONTEUDO -->
	<div class="container-fluid">

		<div class="row">
			<div class="col-sm-3 "></div>
			<div class="col-sm-6 ">

				<!-- POST -->
				
				${post.titulo}<br>
				${post.imagem}<br>
				${post.mensagem}<br>
				${post.data}<br>
				${post.userName}<br>
				<hr>
				${post.tipo}<br>
				 ${post.raca}<br>
				  ${post.porte}<br>
				   ${post.pelagem}<br>
				    ${post.sexo}<br>
				 ${post.situacao}<br>
				 
				 
				<!-- Titulo da imagem -->
				<!-- <h2 class="text-center">Tï¿½tulo da Imagem</h2>

				Imagem
				<div class="panel panel-default">
					<div class="panel-body" id="imagens">
						<img id="imagem" class="img-rounded img-responsive"
							src="imagens/caes.jpeg" alt="sem_imagem" width="660px"
							max-width="initial" max-height="fit-content">
					</div>
				</div>

				Texto da Imagem
				<div class="text-center">
					<article> ivamus viverra sed diam vel consequat. Morbi
					scelerisque metus metus, ut luctus ligula lobortis ac. Aliquam
					dictum commodo libero at consequat. Sed metus est, dignissim quis
					augue at, egestas laoreet libero. </article>
				</div> -->
				<!-- FIM DO POST -->

			</div>

			<!-- Botao 'Criar Post' -->
			<div class="col-sm-3 ">
				<form action="CriarPost.jsp">
					<button type="submit" class="btn btn-info btn-circle btn-xl">
						<i class="glyphicon glyphicon-plus "></i>
					</button>
				</form>
			</div>
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

