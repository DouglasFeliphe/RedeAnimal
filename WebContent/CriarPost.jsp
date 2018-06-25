<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Usuario"%>
<%
	//Usuario usuario = new Usuario();
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
<link rel="stylesheet" type="text/css" href="css/CriarPost.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js/index.js"></script>

<title>Criar Postagem</title>
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
				<a class="navbar-brand" href="index.jsp">Mural</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="#">ONGs <span class="sr-only">(current)</span>
					</a></li>
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
		<!-- /.container-fluid -->
	</nav>

	<!-- CONTEÚDO -->
	<div class="container-fluid">

		<div class="row">
			<div class="col-sm-3 "></div>
			<div class="col-sm-6 ">

				<!-- Título -->
				<h2 class="text-center">Postagem</h2>


				<div class="panel panel-default carousel slide" id="meuCarousel"
					data-ride="carousel">
					<div class="panel-body" id="cadastro-usuario">

						<div class="col-sm-2"></div>
						<div class="col-sm-8">

							<!-- formulario 'CRIAR POST'-->
							<form action="ServletCriarPost" method="POST"
								class="form-horizontal">
								<fieldset>
									<!-- Form Name -->
									<legend>Dados do Animal</legend>
									<!-- inputs-->
									<div class="form-group">
										<label class="col-md-4 control-label" for="tipo">Tipo</label>
										<div class="col-md-5">
											<input type="text" name="tipo" class="form-control"
												placeholder="Tipo" required>
										</div>
									</div>

									<div class="form-group">
										<label for="Raca" class="col-md-4 control-label">Raça:</label>
										<div class="col-md-5">
											<input type="text" name="raca" class="form-control"
												placeholder="Raça">
										</div>
									</div>

									<div class="form-group">
										<label for="Porte" class="col-md-4 control-label">Porte:</label>
										<div class="col-md-5">
											<input type="text" name="porte" class="form-control"
												placeholder="Porte">
										</div>
									</div>

									<div class="form-group">
										<label for="Pelagem" class="col-md-4 control-label">Pelagem:</label>
										<div class="col-md-5">
											<input type="text" name="pelagem" class="form-control"
												placeholder="Pelagem">
										</div>
									</div>

									<div class="form-group">
										<label for="Sexo" class="col-md-4 control-label">Sexo:</label>
										<div class="col-md-5">
											<select name="sexo" class="form-control">
												<option value="Macho">Macho</option>
												<option value="Femea">Fêmea</option>
											</select>
										</div>
									</div>

									<div class="form-group">
										<label for="Situação" class="col-md-4 control-label">Situação:</label>
										<div class="col-md-5">
											<select name="situacao" class="form-control">
												<option value="Perdido">Perdido</option>
												<option value="Enconrado">Encontrado</option>
											</select>
										</div>
									</div>



									<!-- 'DADOS DO POST' -->
									<!-- Form Name -->
									<legend>Dados do Post</legend>
									<div class="form-group"></div>

									<div class="form-group">
										<label class="col-md-4 control-label" for="textinput">Título
											da Postagem</label>
										<div class="col-md-8">
											<input type="text" class="form-control input-md"
												name="titulo" placeholder="título da postagem" required>
										</div>
									</div>

									<div class="form-group">
										<label for="imagem" class="col-md-4 control-label ">Selecione
											a imagem:</label>
										<div class="col-md-8">
											<input type="file" name="imagem" multiple required>
										</div>
									</div>

									<div class="form-group">
										<label class="col-md-4 control-label" for="passwordinput">Mensagem</label>
										<div class="col-md-8">
											<textarea class="form-control" rows="5" maxlength="255"
												name="mensagem" required></textarea>
										</div>
									</div>

									<div class="form-group">
										<label class="col-md-4 control-label" for="passwordinput">Data</label>
										<div class="col-md-6">
											<input type="date" class="form-control input-md" id="data"
												name="data" placeholder="Data" required>
										</div>
									</div>

									<div class="form-group">
										<div class="col-md-4">
											<input type="submit" class="btn btn-success"
												value="Criar Postagem" />
										</div>
									</div>

								</fieldset>
							</form>

							<!-- fim do form  -->

						</div>
						<div class="col-sm-2"></div>
					</div>

				</div>

			</div>
		</div>
	</div>


	<!-- ROPAPÉ -->
	<!-- <footer>
							<hr>
							<div class="text-center">&copy;2018 Rede Animal </div>
						</footer> -->
</body>

</html>