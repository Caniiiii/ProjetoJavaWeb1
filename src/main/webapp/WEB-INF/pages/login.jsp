<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UFG - Projeto Web</title>


<!-- CSS Pagina de login -->
<link href="http://seonglee.com/theme/authenty-v1.2/css/bootstrap.css"
	rel="stylesheet">
<link href="http://seonglee.com/theme/authenty-v1.2/css/animation.css"
	rel="stylesheet">
<link
	href="http://seonglee.com/theme/authenty-v1.2/css/checkbox/orange.css"
	rel="stylesheet">
<link href="http://seonglee.com/theme/authenty-v1.2/css/preview.css"
	rel="stylesheet">
<link href="http://seonglee.com/theme/authenty-v1.2/css/authenty.css"
	rel="stylesheet">
<link rel="shortcut icon" href="images/favicon.png">

<!-- Font Awesome CDN -->
<link
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">

<!-- SCRIPTs -->

<!-- SCRIPT GOOGLE ANALYTICS -->

<script>
	(function(i, s, o, g, r, a, m) {
		i['GoogleAnalyticsObject'] = r;
		i[r] = i[r] || function() {
			(i[r].q = i[r].q || []).push(arguments)
		}, i[r].l = 1 * new Date();
		a = s.createElement(o), m = s.getElementsByTagName(o)[0];
		a.async = 1;
		a.src = g;
		m.parentNode.insertBefore(a, m)
	})(window, document, 'script', '//www.google-analytics.com/analytics.js',
			'ga');

	ga('create', 'UA-40778022-1', 'icircuit.com.br');
	ga('send', 'pageview');
</script>
</head>

<body>
	<section id="authenty_preview">
		<section id="signin_main" class="authenty signin-main">
			<div class="section-content">
				<div class="wrap">
					<div class="container">
						<div class="form-wrap">
							<div class="row">
								<div class="title" data-animation="fadeInDown"
									data-animation-delay=".8s">
									<h2>CATSA Sistemas</h2>
									<p>Cuidando do seu patrimônio</p>
								</div>
								<div id="form_1" data-animation="bounceIn">
									<div class="form-header">
										<i class="fa fa-user"></i>
									</div>

									<div class="form-main">


										<div class="form-group">
											<form:form
												action="${pageContext.request.contextPath}/usuario/efetuarLogin"
												method="POST" commandname="usuario" modelAttribute="usuario">
												<form:input type="text" id="un_1" class="form-control"
													placeholder="Usuario" required="required" path="userName"></form:input>
												<form:input type="password" id="pw_1" class="form-control"
													placeholder="Senha" required="required" path="senha"></form:input>
													<input type="submit"
											class="btn btn-block signin" value="Logar">
											<br>
											<span color="red">${message}</span>
								               </form:form>
										</div>
										

									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</section>

	<!-- js library -->
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/jquery-ui.min.js"></script>
	<script
		src="http://seonglee.com/theme/authenty-v1.2/js/bootstrap.min.js"></script>
	<script
		src="http://seonglee.com/theme/authenty-v1.2/js/jquery.icheck.min.js"></script>
	<script
		src="http://seonglee.com/theme/authenty-v1.2/js/waypoints.min.js"></script>

	<!--     authenty js -->
	<script src="http://seonglee.com/theme/authenty-v1.2/js/authenty.js"></script>

	<!-- preview scripts -->
	<script
		src="http://seonglee.com/theme/authenty-v1.2/js/preview/jquery.malihu.PageScroll2id.js"></script>
	<script
		src="http://seonglee.com/theme/authenty-v1.2/js/preview/jquery.address-1.6.min.js"></script>
	<script
		src="http://seonglee.com/theme/authenty-v1.2/js/preview/scrollTo.min.js"></script>
	<script
		src="http://seonglee.com/theme/authenty-v1.2/js/preview/init.js"></script>

	<!-- preview scripts -->
	<script>
		(function($) {
			var firstInput = $('section').find(
					'input[type=text], input[type=email]').filter(
					':visible:first');

			if (firstInput != null) {
				firstInput.focus();
			}
			$('[data-animation]').waypoint(function(direction) {
				if (direction == "down") {
					$(this).addClass("animated " + $(this).data("animation"));
				}
			}, {
				offset : '90%'
			}).waypoint(
					function(direction) {
						if (direction == "up") {
							$(this).removeClass(
									"animated " + $(this).data("animation"));
						}
					}, {
						offset : '100%'
					});

		})(jQuery);
	</script>
</body>
</html>