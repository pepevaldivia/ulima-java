package pe.edu.ulima.beans;

import org.json.JSONObject;

import pe.edu.ulima.daos.Alumnos;

public class Alumno {
	private int id;
	private int dni;
	private int codigo;
	private String nombres;
	private String paterno;
	private String materno;
	private String telefono;
	private String celular;
	private String correo;
	private int id_carrera;
	
	public Alumno(JSONObject alumnoJson){
		this.id = (int) alumnoJson.get("id");
		this.dni = (int) alumnoJson.get("dni");
		this.codigo = (int) alumnoJson.get("codigo");
		this.nombres = (String)alumnoJson.get("nombres");
		this.paterno = (String)alumnoJson.get("paterno");
		this.materno = (String)alumnoJson.get("materno");
		this.telefono = (String)alumnoJson.get("telefono");
		this.celular = (String)alumnoJson.get("celular");
		this.correo = (String)alumnoJson.get("correo");
		this.id_carrera = (int) alumnoJson.get("codigo");
	}
	
	public JSONObject crear(){
		Alumnos alumnos = new Alumnos(this);
		JSONObject rpta = new JSONObject();
		rpta.put("id_generado", alumnos.crear());
		System.out.println("1 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return rpta;
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getId_carrera() {
		return id_carrera;
	}
	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", codigo=" + codigo + ", nombres=" + nombres + ", paterno=" + paterno
				+ ", materno=" + materno + ", telefono=" + telefono + ", celular=" + celular + ", correo=" + correo
				+ ", id_carrera=" + id_carrera + "]";
	}
}
