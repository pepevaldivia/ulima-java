$("#btnGuardarAlumno").click(function(){
	var alumno = {};
	alumno.id = $("#lblDni").html();
	alumno.dni = $("#txtDni").val();
	alumno.codigo =$("#txtCodigo").val() ;
	alumno.nombres = $("#txtNombres").val();
	alumno.paterno = $("#txtPaterno").val();
	alumno.materno = $("#txtMaterno").val();
	alumno.telefono = $("#txtTelefono").val();
	alumno.celular = $("#txtCelular").val();
	alumno.correo = $("#txtCorreo").val();
	alumno.id_carrera = $("#cboCarrera").val();
	
	$.ajax({
		type: "POST",
		url: BASE_URL + "alumno?crear",
		data: {
			data : JSON.stringify(alumno),
			operacion : $("#lblOperacion").html()
		},
		async: false,
		success:function(data){
			data = JSON.parse(data);
			console.log(data);
		}
	});
});