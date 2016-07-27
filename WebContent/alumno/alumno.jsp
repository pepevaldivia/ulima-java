<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="shortcut icon" href="http://www.ulima.edu.pe/sites/default/files/favicon_1_1.ico" type="image/vnd.microsoft.icon">
<!-- Inicio Css -->
<link href="http://localhost:81/WebTest01/public/css/bootstrap.min.css" rel="stylesheet">
<link href="http://localhost:81/WebTest01/public/css/font-awesome.min.css" rel="stylesheet">
<link href="http://localhost:81/WebTest01/public/css/styles.css" rel="stylesheet">
<!-- Fin Css -->
</head>
<body>
<!-- Inicio Modal -->
    <button type="button" id="btnModal" class="btn btn-primary oculto" data-toggle="modal" data-target=".bs-example-modal-lg">Large modal</button>
    <div id="modal-container"></div>
    <!-- Fin Modal -->
    <!-- Inicio Header -->
    <header class="navbar navbar-static-top bs-docs-nav" id="top" role="banner"> 
        <div class="container"> 
            <div class="navbar-header"> 
                <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#bs-navbar" aria-controls="bs-navbar" aria-expanded="false"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button> 
                <a href="../" class="navbar-brand">ULima Tesis</a> </div> 
                <nav id="bs-navbar" class="collapse navbar-collapse"> 
                    <ul class="nav navbar-nav"> 
					                    	
                    </ul> 
                    <ul class="nav navbar-nav navbar-right"> 
                        <li><a href="http://expo.getbootstrap.com" onclick="ga(&quot;send&quot;,&quot;event&quot;,&quot;Navbar&quot;,&quot;Community links&quot;,&quot;Expo&quot;)">Expo</a></li> 
                        <li><a href="login/cerrar" onclick="ga(&quot;send&quot;,&quot;event&quot;,&quot;Navbar&quot;,&quot;Community links&quot;,&quot;Blog&quot;)">Cerrar Sesión <i class="fa fa-sign-out icono-cerrar-sesion" aria-hidden="true"></i></a></li> 
                    </ul> 
                </nav> 
        </div> 
    </header>
    <!-- Fin Header -->
    <!-- Inicio Yield -->
    <div class="container" id="container">
        <div class="col-md-3" id="menu-izquierda-app">
            <div class="box">
                
            </div>
        </div>
        <div class="col-md-9" id="container-app">
            <h2 class="titulo">Maestros/ Alumno / Crear</h2>
			<div class="row borde-bajo">
				<p><h5 class="subtitulo">Ingrese los datos del nuevo alumno</h5><label class="texto-der oculto" id="txtMensajeRpta"></label></p>
			</div>
			</br>
			<div class="row">
				<label id="lblOperacion" class="oculto">crear</label>
				<label id="lblDni" class="oculto">0</label>
				<div class="col-md-2">
					<div class="form-group">
					    <label for="txtDni">DNI</label>
					    <input type="text" class="form-control" id="txtDni">
					  </div>
				  </div>
				  <div class="col-md-2">
					<div class="form-group">
					    <label for="txtCodigo">Código</label>
					    <input type="text" class="form-control" id="txtNombres">
					  </div>
				  </div>
				<div class="col-md-2">
					<div class="form-group">
					    <label for="txtNombres">Nombre(s)</label>
					    <input type="text" class="form-control" id="txtNombres">
					  </div>
				  </div>
				  <div class="col-md-3">
					<div class="form-group">
					    <label for="txtPaterno">Apellido Paterno</label>
					    <input type="text" class="form-control" id="txtPaterno">
					  </div>
				  </div>
				  <div class="col-md-3">
					<div class="form-group">
					    <label for="txtMaterno">Apellido Materno</label>
					    <input type="text" class="form-control" id="txtMaterno">
					  </div>
				  </div>
			</div>
			<div class="row">
				<div class="col-md-2">
					<div class="form-group">
					    <label for="txtTelefono">Teléfono</label>
					    <input type="text" class="form-control" id="txtTelefono">
					  </div>
				  </div>
				  <div class="col-md-2">
					<div class="form-group">
					    <label for="txtCelular">Celular</label>
					    <input type="text" class="form-control" id="txtCelular">
					  </div>
				  </div>
				  <div class="col-md-3">
					<div class="form-group">
					    <label for="txtCorreo">Correo</label>
					    <input type="text" class="form-control" id="txtCorreo">
					  </div>
				  </div>
				  <div class="col-md-3">
					<div class="form-group">
					    <label for="">Carrera</label>
					    <select id="cboCarrera" class="form-control">
						  <option value="1">Administración</option>
						  <option value="2">Arquitectura</option>
						  <option value="3">Derecho</option>
						  <option value="4">Ingeniería Industrial</option>
						  <option value="5">Ingeniería de Sistemas</option>
						</select>
					  </div>
				  </div>
				  <div class="col-md-2">
				  	<button class="btn alinear-derecha" id="btnGuardarAlumno" style="margin-top: 25px;"> <i class="fa fa-check" style="margin-right:5px; "></i>Guardar Cambios</button>
				  </div>
			</div>
        </div>
    </div>
    <!-- Fin Yield -->
    <!-- Footer -->
    <footer class="footer">
      <div class="container">
        <p>Place sticky footer content here.</p>
      </div>
    </footer>
<!-- Inicio Js -->
<script type="text/javascript" src="http://localhost:81/WebTest01/public/js/jquery.min.js"></script>
<script type="text/javascript" src="http://localhost:81/WebTest01/public/js/bootstrap.min.js"></script>
<script type="text/javascript" src="http://localhost:81/WebTest01/public/js/app.js"></script>
<script type="text/javascript" src="http://localhost:81/WebTest01/app/alumno/js/alumno.js"></script>
<!-- Fin Js -->
</body>
</html>