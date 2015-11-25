<!DOCTYPE html>
<html>

<head>

<title>Cadastro de Produto - Sistema de gestão de património</title>

<!-- CSSs -->

<!-- Bootstrap Core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- MetisMenu CSS -->
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/metisMenu/2.2.0/metisMenu.min.css">

<!-- Custom CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/startbootstrap-sb-admin-2/1.0.7/css/sb-admin-2.css"
	rel="stylesheet">

<!-- Custom2 CSS -->
<link href="http://www.icircuit.com.br/style.css" rel="stylesheet">

<!-- Custom Fonts -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- /End CSS -->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-topo navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<a class="navbar-brand" href="index.jsp">UFG - Sistema de gestão
					de património</a>
			</div>
			<!-- /.navbar-header -->

			<ul class="nav navbar-top-links navbar-right">
				<li class="dropdown">
					<!-- /.dropdown -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i>Perfil</a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i>Configurações</a>
						</li>
						<li class="divider"></li>
						<li><a href="#"><i class="fa fa-user-md fa-fw"></i>Manutenção
								de usuários</a>
						<li class="divider"></li>
						<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>Deslogar</a>
						</li>
					</ul> <!-- /.dropdown-user --></li>
				<!-- /.dropdown -->
			</ul>
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control"
									placeholder="Pesquisar..."> <span
									class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div> <!-- /input-group -->
						</li>
						<li><a href="cadastroItem.jsp"><i
								class="fa fa-plus-circle fa-fw"></i>Cadastrar Itens</a></li>

						<li><a href="#"><i class="fa fa-search  fa-fw"></i>Visualizar
								Itens<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="visualizarItemGeral.jsp"><i
										class="fa fa-copy fa-fw"></i>Itens Gerais</a></li>
								<li><a href="visualizarItemEspecifico.jsp"><i
										class="fa fa-file-o fa-fw"></i>Itens Especificos</a></li>
							</ul> <!-- /.nav-second-level --></li>

						<li><a href="#"><i class="fa fa-tags  fa-fw"></i>Cadastros
								Gerais<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="cadastroFabricante.jsp"><i
										class="fa fa-building fa-fw"></i>Cadastrar Fabricante</a></li>
								<li><a href="cadastroCategoria.jsp"><i
										class="fa fa-desktop fa-fw"></i>Cadastrar Categoria</a></li>
								<li><a href="cadastroDepartamento.jsp"><i
										class="fa fa-external-link fa-fw"></i>Cadastrar Departamento</a></li>
								<li><a href="cadastroUnidade.jsp"><i
										class="fa fa-institution fa-fw"></i>Cadastrar Unidade</a></li>
							</ul> <!-- /.nav-second-level --></li>

						<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>Relatórios<span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="#"><i class="fa fa-desktop fa-fw"></i>Relatório
										por Categorias</a></li>
								<li><a href="#"><i class="fa fa-external-link fa-fw"></i>Relatório
										por Departamento</a></li>
								<li><a href="#"><i class="fa fa-institution fa-fw"></i>Relatório
										por Unidades</a></li>
							</ul> <!-- /.nav-second-level --></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Visualizar Item Geral</h1>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-green">
						<div class="panel-heading">Pesquisa de Item Geral</div>
						<div class="panel-body">

							<div class="form-group input-group">
								<input type="text" class="form-control"
									placeholder="Digite o nome de um item para busca"> <span
									class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div>

							<div class="form-group input-group">
								<input type="number" class="form-control"
									placeholder="Digite um código para busca"> <span
									class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-primary">
						<div class="panel-heading">Informações do Item</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-md-12">

									<div class="row">
										<div class="col-lg-6">
											<div class="row">
												<div class="col-lg-12">
													<form role="form">
														<div class="form-group">

															<label>Código do item</label> <input type="number"
																class="form-control"
																placeholder="Digite o código do item">
														</div>
													</form>
												</div>
											</div>

											<div class="row"></div>
											<form role="form">
												<div class="form-group">
													<label>Nome do item</label> <input class="form-control"
														placeholder="Digite o nome do item">
												</div>


												<div class="form-group">
													<label>Fábricante</label> <select class="form-control">
														<option>Apple</option>
														<option>LG</option>
														<option>Outros</option>
													</select>
												</div>
												<div class="form-group">
													<label>Tempo de garantia</label> <select
														class="form-control">
														<option>1 ano</option>
														<option>2 anos</option>
														<option>3 anos</option>
														<option>4 anos</option>
														<option>5 anos</option>
														<option>Ilimitada</option>
														<option>Sem garantia</option>
													</select>
												</div>
												<div class="form-group">
													<label>Categoria</label> <select class="form-control">
														<option>Eletronico</option>
														<option>Mobilia</option>
													</select>
												</div>
												<div class="form-group">
													<label>Observação</label>
													<textarea class="form-control" rows="3"></textarea>
												</div>
											</form>
										</div>
										<div class="col-lg-6">

											<div class="panel panel-info">
												<div class="panel-heading">Imagem do produto</div>
												<div class="panel-body">
													<center>
														<a href="#"><img
															src="http://iacom.s8.com.br/produtos/01/00/item/111804/8/111804870G1.jpg"
															width="250" height="250" class="img-thumbnail" /></a>
													</center>
												</div>
												<div class="panel-footer">
													<div class="form-group">
														<label>Enviar foto</label> <input type="file">
													</div>
												</div>
											</div>
											<button type="submit" class="btn btn-outline btn-success">Enviar</button>
											<button type="reset" class="btn btn-outline btn-warning">Resetar</button>
											<button type="submit" class="btn btn-outline btn-danger">Editar</button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /#wrapper -->

		<!-- Scripts -->

		<!-- /#wrapper -->

		<!-- jQuery -->
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0-alpha1/jquery.min.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script
			src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

		<!-- Metis Menu Plugin JavaScript -->
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/metisMenu/2.2.0/metisMenu.min.js"></script>

		<!-- Custom Theme JavaScript -->
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/startbootstrap-sb-admin-2/1.0.7/js/sb-admin-2.js"></script>



		<!-- /End Scripts -->
</body>
</html>