package controller;

import java.io.IOException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Operaciones
 */
@WebServlet("/Operaciones")
public class Operaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final char[] valor1 = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Operaciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String valor1 = request.getParameter("valor1");
		String valor2 = request.getParameter("valor2");
		if (!validarEnteros(valor1, valor2)) {
			response.sendRedirect("error.html");
		}
		String accion = request.getParameter("operacion");
		String respuesta = "";
		
		if (accion == "sumar") {
			respuesta = sumar (Integer.parseInt(valor1), Integer.parseInt(valor2);
		} else if (accion == "restar") {
			
		}else if (accion == "multiplicar") {
			
		}else if (accion == "dividir") {
			
		}else if (accion == "ordenar") {
			
		}else if (accion == "paroimpar") {
			
		} 
	}

	public String sumar(int valor1, int valor2) {
		return "El resultado de la suma es: " + Integer.toString(valor1 + valor2);
	}

	public String restar(int valor1, int valor2) {
		return "El resultado de la resta es: " + Integer.toString(valor1 - valor2);
	}

	public String multiplicar(int valor1, int valor2) {
		return "El resultado de la multlicación es: " + Integer.toString(valor1 * valor2);
	}

	public boolean validarEnteros(String valor1, String valor2) {
		boolean resultado;

		try {
			Integer.parseInt(valor1);
			Integer.parseInt(valor2);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}

		return resultado;
	}

	public boolean validarDivision(String valor2) {
		boolean resultado;

		try {
			int aux = Integer.parseInt(valor2);
			if (aux != 0) {
				resultado = true;
			} else {
				resultado = false;
			}

		} catch (NumberFormatException excepcion) {
			resultado = false;
		}

		return resultado;

	}

	public String dividir(int valor1, int valor2) {
		return "El resultado de la division es: " + Integer.toString(valor1 / valor2);
	}

	public String ordenarNumero(int valor1, int valor2) {
		int[] arr = { valor1, valor2 };
		Arrays.sort(arr);
		return "Ordenar el numero: " + arr[0] + " " + arr[1];
	}

	public String EsParOImpar(int valor1, int valor2) {
		if (valor1 % 2 == 0 && valor2 % 2 == 0) {
			return "Los dos numeros son pares";
		} else if (valor1 % 2 == 0) {
			return ("El " + valor1 + " es par y el " + valor2 + " es impar");
		} else {
			return ("El " + valor2 + " es par y el " + valor1 + " es par");
		}
	}
}
