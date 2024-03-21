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
			<div class="col">
				<h1>Cadastro</h1>
					<form action="cadastro_script.php" method="POST">
						<div class="form-group">
							<label for="nome">Nome completo</label>
							<input type="text" class="form-control" name="nome">
						</div>
						<div class="form-group">
							<label for="endereco">Endereço</label>
							<input type="text" class="form-control" name="endereço">
						</div>
						<div class="form-group">
							<label for="nome">Telefone</label>
							<input type="text" class="form-control" name="endereço">
						</div>
						<div class="form-group">
							<label for="nome">Email</label>
							<input type="email" class="form-control" name="email">
						</div>
						<div class="form-group">
							<label for="nome">Data de Nascimento</label>
							<input type="date" class="form-control" name="dt_nascimento">
						</div>
						<div class="form-group">
							<input type="submit" class="btn btn-success">
						</div>
			        </form>
		</div>	
	</div>
  </body>
</html>