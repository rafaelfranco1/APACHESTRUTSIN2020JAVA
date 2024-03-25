<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
    <title>Cadastro</title>
  </head>
  <body>
    <h1>Cadastro</h1>
	
	<div class="container">
		<div class="row">
			<?php
			$nome = $_POST['nome'];
			$endereco = $_POST['endereco'];
			$telefone = $_POST['telefone'];
			$email = $_POST['email'];
			$data = $_POST['data'];
			$data_nascimento = $_POST['data_nascimento'];
			
			$sql = "INSERT INTO 'PESSOAS' VALUES "
			?>
		</div>
	</div>
  </body>
</html>