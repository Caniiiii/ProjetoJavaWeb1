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
	href="//cdnjs.cloudflare.com/ajax/libs/metisMenu/2.2.0/metisMenu.min.css">

<!-- Custom CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/startbootstrap-sb-admin-2/1.0.7/css/sb-admin-2.css"
	rel="stylesheet">

<!-- Custom2 CSS -->
<link href="http://www.icircuit.com.br/style.css" rel="stylesheet">

<!-- Custom Fonts -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	
	<!-- Date Picker CSS -->
 <script src="http://cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment-with-locales.js"></script>
<script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<link href="http://cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/e8bddc60e73c1ec2475f827be36e1957af72e2ea/build/css/bootstrap-datetimepicker.css" rel="stylesheet" />
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/e8bddc60e73c1ec2475f827be36e1957af72e2ea/src/js/bootstrap-datetimepicker.js"></script>
		
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
   

<!-- /End CSS -->

</head>

<body>

	 <script> $(function() {
  // defualt script for datetimepicket
  $('.startDateTime').datetimepicker({
    
    //uncomment following code to enable debug mode
    //debug: true
  });
  $('.endDateTime').datetimepicker({
    
    //uncomment following code to enable debug mode
    //debug: true,
    
    useCurrent: false
  });
  $(".startDateTime").on("dp.change", function(e) {
    $('.endDateTime').data("DateTimePicker").minDate(e.date);
  });
  $(".endDateTime").on("dp.change", function(e) {
    $('.startDateTime').data("DateTimePicker").maxDate(e.date);
  });
});</script>
	<div class="container">
  <div class="row date-pick">
    <div class="col-md-12">
      <div class="well date-picker-box">
        <div class="col-md-6">
          <input type="text" class="form-control startDateTime" placeholder="Select start date and hour">
        </div>
        <div class="col-md-6">
          <input type="text" class="form-control endDateTime" placeholder="Select End date and hour">
        </div>
      </div>
    </div>
  </div>
  <input type="text" class="form-control days-here" placeholder="Show Days difference here">
  <input type="text" class="form-control time-here" placeholder="Show Hours difference here">
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


<!-- Data Picker JavaScript -->


	<!-- /End Scripts -->
	
	

</body>

</html>