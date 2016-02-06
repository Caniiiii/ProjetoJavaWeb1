<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>

<head>

<title>Cadastro de Produto - Sistema de gest�o de patrim�nio</title>

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
					de patrimônio</a>
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
						<li><a
							href="${pageContext.request.contextPath}/usuario/logout"><i
								class="fa fa-sign-out fa-fw"></i>Deslogar</a></li>
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

						<li><a href="#"><i class="fa fa-search fa-fw"></i>Visualizar<span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="visualizarProduto.jsp"><i
										class="fa fa-copy fa-fw"></i>Produtos</a></li>
								<li><a href="visualizarItemEspecifico.jsp"><i
										class="fa fa-file-o fa-fw"></i>Itens Especificos</a></li>
							</ul> <!-- /.nav-second-level --></li>

						<li><a href="#"><i class="fa fa-tags  fa-fw"></i>Cadastros
								Gerais<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="cadastroProduto.jsp"><i
										class="fa fa-cube fa-fw"></i>Cadastrar Produto</a></li>
								<li><a href="cadastroFabricante.jsp"><i
										class="fa fa-building fa-fw"></i>Cadastrar Fabricante</a></li>
								<li><a href="cadastroCategoria.jsp"><i
										class="fa fa-desktop fa-fw"></i>Cadastrar Categoria</a></li>
								<li><a href="${pageContext.request.contextPath}/departamento/adicionar"><i
										class="fa fa-external-link fa-fw"></i>Cadastrar Departamento</a></li>
								<li><a
									href="${pageContext.request.contextPath}/unidade/cadastro"><i
										class="fa fa-institution fa-fw"></i>Cadastrar Unidade</a></li>
								<li><a
									href="${pageContext.request.contextPath}/endereco/adicionar"><i
										class="fa fa-institution fa-fw"></i>Cadastrar endereco</a></li>
							</ul> <!-- /.nav-second-level --></li>
					</ul>
					<!-- /.nav-second-level -->
					</li>

					<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>Relatórios<span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="relatorioItens.jsp"><i
									class="fa fa-desktop fa-fw"></i>Relat�rio de itens</a></li>
							<li><a href="#"><i class="fa fa-external-link fa-fw"></i>Relat�rio
									2</a></li>
							<li><a href="#"><i class="fa fa-institution fa-fw"></i>Relat�rio
									3</a></li>
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
					<h1 class="page-header">Cadastro de Patrimônio</h1>
				</div>
			</div>


			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-green">
						<div class="panel-heading">Pesquisa de Produto</div>
						<div class="panel-body">

							<div class="form-group input-group">
								<input type="text" class="form-control"
									placeholder="Digite o nome de um produto para busca"> <span
									class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div>

							<div class="form-group input-group">
								<input type="number" class="form-control"
									placeholder="Digite um código de produto para busca"> <span
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
					<div class="panel panel-success">
						<div class="panel-heading">Incluir Patrimônio</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-md-12">
									<div class="row">
										<div class="col-lg-6">
											<div class="row">
												<div class="col-lg-4">
													<form:form role="form"
														action="${pageContext.request.contextPath}/item/cadastro/process"
														method="GET" commandname="item" modelAttribute="item">
														<div class="form-group">

															<label>Código do item</label>
															<form:input type="number" class="form-control"
																placeholder="Digite o código do item"
																required="required" path="codigo" />
														</div>
													</form:form>
												</div>

												<div class="col-lg-4">
													<form:form role="form"
														action="${pageContext.request.contextPath}/item/cadastro/process"
														method="GET" commandname="item" modelAttribute="item">
														<div class="form-group">

															<label>N da plaqueta</label>
															<form:input type="number" class="form-control"
																placeholder="Número da plaqueta" required="required"
																path="numeroPlaqueta" />
														</div>
													</form:form>
												</div>

												<div class="col-lg-4">
													<form:form role="form"
														action="${pageContext.request.contextPath}/item/cadastro/process"
														method="GET" commandname="item" modelAttribute="item">
														<div class="form-group">

															<label>Data de Compra</label>
															<form:input type="date" class="form-control"
																placeholder="Data de compra" require="required"
																path="dataDeCompra" />
														</div>
													</form:form>
												</div>
											</div>

											<div class="row">
												<div class="col-lg-4">
													<form:form role="form"
														action="${pageContext.request.contextPath}/item/cadastro/process"
														method="GET" commandname="item" modelAttribute="item">
														<div class="form-group">
															<label>N da nota</label>
															<form:input type="number" class="form-control"
																placeholder="Digite o numero da nota"
																required="required" path="notaFiscalPdf" />
														</div>
													</form:form>
												</div>

												<div class="col-lg-4">
													<form:form role="form"
														action="${pageContext.request.contextPath}/item/cadastro/process"
														method="GET" commandname="item" modelAttribute="item">
														<div class="form-group">
															<label>Quantidade</label>
															<form:input type="number" class="form-control"
																placeholder="Digite a quantidade de itens"
																required="required" path="quantidade" />
														</div>
													</form:form>

												</div>
												<div class="col-lg-4">

													<form:form role="form"
														action="${pageContext.request.contextPath}/item/cadastro/process"
														method="GET" commandname="item" modelAttribute="item">
														<div class="form-group">
															<label>Situação</label>
															<form:select class="form-control" path="situacao">
																<form:option value="#">Novo</form:option>
																<form:option value="#">Usado</form:option>
																<form:option value="#">Perecível</form:option>
															</form:select>
														</div>
													</form:form>
												</div>
											</div>

											<form:form role="form"
												action="${pageContext.request.contextPath}/item/cadastro/process"
												method="GET" commandname="item" modelAttribute="item">

												<div class="form-group">
													<label>Nome do item</label>
													<form:input class="form-control"
														placeholder="Digite o nome do item" required="required"
														path="nomeItem" />
												</div>

												<div class="form-group">
													<label>Fabricante</label>
													<form:select class="form-control" path="fabricante">
														<form:option value="#">Apple</form:option>
														<form:option value="#">LG</form:option>
														<form:option value="#">Outros</form:option>
													</form:select>
												</div>
												<div class="form-group">
													<label>Tempo de garantia</label>
													<form:select class="form-control" path="tempoGarantia">
														<form:option value="#">1 ano</form:option>
														<form:option value="#">2 anos</form:option>
														<form:option value="#">3 anos</form:option>
														<form:option value="#">4 anos</form:option>
														<form:option value="#">5 anos</form:option>
														<form:option value="#">Ilimitada</form:option>
														<form:option value="#">Sem garantia</form:option>
													</form:select>
												</div>
												<div class="form-group">
													<label>Categoria</label>
													<form:select class="form-control" path="categoria">
														<form:option value="#">Eletronico</form:option>
														<form:option value="#">Mobilia</form:option>
													</form:select>
												</div>
												<div class="form-group">
													<label>Unidade</label>
													<form:select class="form-control" path="unidades">
														<form:option value="#">Goiãnia - Setor Sul</form:option>
														<form:option value="#">Goiãnia - T10</form:option>
														<form:option value="#">Anápolis</form:option>
													</form:select>
												</div>
												<div class="form-group">
													<label>Departamento</label>
													<form:select class="form-control" path="departamento">
														<form:option value="#">Financeiro</form:option>
														<form:option value="#">Assistência</form:option>
														<form:option value="#">Salão</form:option>
													</form:select>
												</div>
												<div class="form-group">
													<label>Responsável</label>
													<form:input class="form-control"
														placeholder="Digite o responsável pelo equipamento caso exista"
														path="responsavel" />
												</div>
												<div class="form-group">
													<label>Observação</label>
													<form:textarea class="form-control" rows="3"
														path="observacao"></form:textarea>
												</div>
											</form:form>
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

											<div class="panel panel-info">
												<div class="panel-heading">Arquivo nota fiscal</div>
												<div class="panel-footer">
													<div class="form-group">
														<label>Enviar .pdf nota fiscal</label> <input type="file">
													</div>
												</div>
											</div>
											<button type="submit" class="btn btn-outline btn-success">Enviar</button>
											<button type="reset" class="btn btn-outline btn-warning">Resetar</button>
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


	</div>
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