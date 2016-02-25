<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored="false"%>
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
						<li><a
							href="${pageContext.request.contextPath}/itens/cadastrar"><i
								class="fa fa-plus-circle fa-fw"></i>Cadastrar Itens</a></li>

						<li><a href="#"><i class="fa fa-search fa-fw"></i>Visualizar<span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a
									href="${pageContext.request.contextPath}/produto/visualizar"><i
										class="fa fa-copy fa-fw"></i>Produtos</a></li>
								<li><a href="visualizarItemEspecifico.jsp"><i
										class="fa fa-file-o fa-fw"></i>Itens Especificos</a></li>
							</ul> <!-- /.nav-second-level --></li>

						<li><a href="#"><i class="fa fa-tags  fa-fw"></i>Cadastros
								Gerais<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a
									href="${pageContext.request.contextPath}/produto/adicionar"><i
										class="fa fa-cube fa-fw"></i>Cadastrar Produto</a></li>
								<li><a
									href="${pageContext.request.contextPath}/fabricante/adicionar"><i
										class="fa fa-building fa-fw"></i>Cadastrar Fabricante</a></li>
								<li><a
									href="${pageContext.request.contextPath}/categoria/adicionar"><i
										class="fa fa-desktop fa-fw"></i>Cadastrar Categoria</a></li>
								<li><a
									href="${pageContext.request.contextPath}/departamento/adicionar"><i
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
							<li><a
								href="${pageContext.request.contextPath}/relatorio/categoria"><i
									class="fa fa-desktop fa-fw"></i>Relatório por Categorias</a></li>
							<li><a
								href="${pageContext.request.contextPath}/relatorio/departamento"><i
									class="fa fa-external-link fa-fw"></i>Relatório por
									Departamento</a></li>
							<li><a
								href="${pageContext.request.contextPath}/relatorio/unidade"><i
									class="fa fa-institution fa-fw"></i>Relatório por Unidades</a></li>
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
					<h1 class="page-header">Relatório por Unidade</h1>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-green">
						<div class="panel-heading">Pesquisa de Itens</div>
						<div class="panel-body">
							<form:form
								action="${pageContext.request.contextPath}/relatorio/unidade/envio"
								commandname="unidade" modelAttribute="unidade">
								<label>Nome da Unidade</label>
								<div class="form-group input-group">
									<form:select path="nomeUnidade">
										<c:forEach var="unidade" items="${unidades}">
											<option class="form-control"
												placeholder="Digite o nome de uma categoria para busca"
												name="nome"><span class="input-group-btn"
													value="${unidade.nomeUnidade}">${unidade.nomeUnidade}</option>
										</c:forEach>
									</form:select>
									<button class="btn btn-default" type="submit">
										<i class="fa fa-search"></i>
									</button>
									</span>
								</div>

							</form:form>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-primary">
						<div class="panel-heading">Lista de Itens</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-md-12">



									<c:if test="${itens!=null }">
									     Total de itens: ${quantidades}
										<c:forEach var="item" items="${itens}">
											<div class="alert alert-info fade in">
												<a href="#" class="close" data-dismiss="alert"
													aria-label="close">&times;</a> <strong>Unidade:
													${item.unidade.nomeUnidade }</strong><br>
												<br> Codigo do item: ${item.codigo}<br> Codigo do
												produto: ${item.produto.codigo}<br> Nome do produto:
												${item.produto.nomeProduto}<br> Fabricante:
												${item.produto.fabricante.nomeFabricante}<br> Numeroa
												da plaqueta: ${item.numeroPlaqueta}<br> Data de compra:
												${item.dataDeCompra}<br> Departamento:
												${item.departamento.nomeDepartamento} <br> Quantidade
												de itens: ${item.quantidade}<br>
												<span style="display:none">"${item.id}"</span><br>
												<button><a href="${pageContext.request.contextPath}/item/delete/${item.id}.html">Deletar</a></button>
											    <button><a href="${pageContext.request.contextPath}/item/edita/${item.id}.html">Editar</a></button>

											</div>
										</c:forEach>

									</c:if>

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