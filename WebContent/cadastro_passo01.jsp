<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
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
<title>Cadastro - Verificar o CPF</title>
</head>
<body>
<!-- BARRA DE ALERTA -->   
    <div class="alert alert-success">
        <strong> ${resultadoCpf}
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
                <h2 class="text-center">Cadastro - Verificar o CPF</h2>

				<script>
				// código de verificação de CPF da receita federal 
				// http://www.receita.fazenda.gov.br/aplicacoes/atcta/cpf/funcoes.js
				
			 function validadorCampoCpf(){
					
					var Soma;
				    var Resto;
				    var MensagemErroCpf = "CPF incorreto. Digite corretamente o CPF";
				    Soma = 0;					
					
					if ((formCpf.cpf.value == "")||(formCpf.cpf.value == null)){
						window.alert("Campos não preenchidos");
					} else {
						for (i=1; i<=9; i++){
					    	Soma = Soma + parseInt(formCpf.cpf.value.substring(i-1, i)) * (11 - i);
					    	Resto = (Soma * 10) % 11;
					    }
						
						if ((Resto == 10) || (Resto == 11))  {
					    	Resto = 0;
					    }
						
						Soma = 0;
						
						for (i = 1; i <= 10; i++) {
							Soma = Soma + parseInt(formCpf.cpf.value.substring(i-1, i)) * (12 - i);				 
						    Resto = (Soma * 10) % 11;
						}
						
						if ((Resto == 10) || (Resto == 11)) {
							Resto = 0;
						}
						
						if ((formCpf.cpf.value == "00000000000") || (Resto != parseInt(formCpf.cpf.value.substring(9, 10))) || (Resto != parseInt(formCpf.cpf.value.substring(10, 11)))) {
							window.alert(MensagemErroCpf);
						} else { 
							document.formCpf.submit();
						}	
												
					}
				}
						
					
				/* 	 function validadorCampoCpf(){
						if ((formCpf.cpf.value == "")||(formCpf.cpf.value == null)){
							window.alert("Campos não preenchidos");
						} else {
							document.formCpf.submit();
						}			    
					}   */
					
				</script>

				<!-- Imagem -->
                <div class="panel panel-default">
                    <div class="panel-body" id="cadastro-usuario">                        
                    	<form name="formCpf" class="navbar-form navbar-left" method="post" action="ServletCadastroUsuario">
                    		<div class="form-group">                    		
                    			CPF: <input id="cpf" type="text" name="cpf" class="form-control" ><br>                    		
                            	<input type="button" value="Verificar" class="btn btn-default" onclick="validadorCampoCpf()"><br>                            	
                           </div>
                        </form>
                    </div>
                </div>

</body>
</html>