package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.Serializable;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import pe.edu.ulima.beans.Alumno;

@WebServlet("/alumno")
public class AlumnoServelt extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;


    public AlumnoServelt() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacion = request.getParameter("operacion");
	
		try{
			switch (operacion) {
	        case "index" :
	        	request.getRequestDispatcher("/alumno/index.jsp").forward(request, response);
	            break;
	        case "crear" :
	        	request.getRequestDispatcher("/alumno/alumno.jsp").forward(request, response);
	            break;
	        default:
	        	request.getRequestDispatcher("/error/404.jsp").forward(request, response);
	            break;
			}
		}catch (Exception NullPointerException){
				request.getRequestDispatcher("/error/404.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacion = request.getParameter("operacion");
		
		switch (operacion) {
        case "crear" :
        	String data = request.getParameter("data");
        	Alumno alumno = new Alumno(new JSONObject(data));
        	alumno.crear();
            break;
        default:
        	//request.getRequestDispatcher("/error/404.jsp").forward(request, response);
        	response.setContentType("application/json");
        	response.getWriter().write("paso algo");
            break;
		}
	}

}
