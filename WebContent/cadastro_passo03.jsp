<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/principal.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/principal.js"></script>
	<title>Cadastro</title>
</head>
<body>
	<!-- BARRA DE ALERTA -->   
    <div class="alert alert-success">
        <strong> 
            <a href="#">
                <span class="glyphicon glyphicon-user"></span>
            </a>
        </strong>
    </div>
    
    <!-- <div class=""> -->
        
        <!-- CABEÇALHO -->
       
             <div class="jumbotron">
              <a href="index.jsp"><h1>Rede Animal</h1></a>
              <p>Aenean nec aliquet ante. Ut quis dapibus lorem. Suspendisse sed mi enim. Maecenas ultrices imperdiet aliquet. Nam faucibus tempus lorem in luctus.</p> 
            </div>          
          

        <!-- BARRA DE MENU -->          
        <nav class="navbar navbar-default">
                <div class="container-fluid">
                  <!-- Brand and toggle get grouped for better mobile display -->
                  <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                      <span class="sr-only">Toggle navigation</span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Mural</a>
                  </div>
              
                  <!-- Collect the nav links, forms, and other content for toggling -->
                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                      <li ><a href="#">ONGs <span class="sr-only">(current)</span></a></li>
                      <li ><a href="#">Quem Somos</a></li>
                      <li><a href="#">Contato</a></li>
                    </ul>
                 <!--  
                    <ul class="nav navbar-nav navbar-right">
                    	<a href="cadastroUsuario.html">Não tem uma conta? Clique aqui</a>
                    	<form class="navbar-form navbar-left" method="post" action="ServletVerificaLogin">
                    		<div class="form-group">
                    			<input type="text" name="usuario" class="form-control" placeholder="Usuário">
                    		</div>
                            <div class="form-group">
                            	<input type="password" name="senha" class="form-control" placeholder="Senha">
                            </div>
                            <button type="submit" class="btn btn-default">Entrar</button>
                        </form>
                    </ul>                                 -->   
                  </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
              </nav>
            
           
        <!-- CONTEÚDO -->
        <div class="container-fluid"> 
        
        <div class="row">
            <div class="col-sm-3 " ></div>
            <div class="col-sm-6 ">

                <!-- Título da imagem -->
                <h2 class="text-center">Cadastro</h2>

                <!-- Imagem -->
                <div class="panel panel-default">
                    <div class="panel-body" id="cadastro-usuario">
                    	                   
                    	<form class="navbar-form navbar-left" method="post" action="ServletCadastroUsuario">
                    		<div class="form-group">
                    		CPF: <input type="text" name="cpf" class="form-control" value="${usuarioTemp.cpf}" > ${resultadoCpf} <br>
                    		Username:  <input type="text" name="username" class="form-control" value="${usuarioTemp.username}" > ${resultadoUsername} <br>   
                    		Nome completo: <input type="text" name="nome" class="form-control" placeholder="Nome completo" value="${usuarioTemp.nome}"><br>
                  <!--  	CPF: <input type="text" name="cpf" class="form-control" placeholder="CPF"><br>  --> 
                    		Endereço: <input type="text" name="endereco" class="form-control" placeholder="Endereço" value="${usuarioTemp.endereco}"><br>
                    		Cidade: <input type="text" name="cidade" class="form-control" placeholder="Cidade" value="${usuarioTemp.cidade}"><br>
                    		CEP: <input type="text" name="cep" class="form-control" placeholder="99.999-999" pattern="[0-9]{2}\.?[0-9]{3}\-?[0-9]{3}" value="${usuarioTemp.cep}"> Use . e - entre os números<br>
                    		Telefone: <input type="tel" name="telefone" class="form-control" placeholder="(99)99999-9999" pattern="\(?[0-9]{2}\)?[0-9]{5}\-?[0-9]{4}" value="${usuarioTemp.telefone}"> Use () e - entre os números<br>
                    		E-mail: <input type="email" name="email" class="form-control" placeholder="usuario@email.com" 
                    		pattern="^([-a-zA-Z0-9_-]*@(gmail|yahoo|ymail|rocketmail|bol|hotmail|live|msn|ig|globomail|oi|pop|inteligweb|r7|folha|zipmail|uol).(com|info|gov|net|org|tv)(.[-a-z]{2})?)*$" value="${usuarioTemp.email}"><br>                    		
                  <!--  	Username: <input type="text" name="username" class="form-control" placeholder="Username"><br>  -->  		
                    		Senha: <input type="password" name="senha" class="form-control" placeholder="Senha" ><br>
                            Confirme a senha: <input type="password" name="senha2" class="form-control" placeholder="Confirmar a Senha"> ${resultadoSenha}<br>
                            <button type="submit" class="btn btn-default">Enviar</button>
                           </div>
                        </form>
                    </div>
                </div>
</body>
</html>