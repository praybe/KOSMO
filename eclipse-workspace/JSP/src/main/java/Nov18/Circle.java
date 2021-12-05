package Nov18;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Circle
 */
@WebServlet("/cir")
public class Circle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter writer = response.getWriter();
		
		writer.println("<h1>Not here :D</h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String radius = request.getParameter("radius");

		response.setContentType("text/html; charset=euc-kr");
		PrintWriter writer = response.getWriter();

		writer.println("<html><head></head><body>");

		int r = Integer.valueOf(radius);
		double area = r * r * Math.PI;
		writer.println("Area of Circle: " + area);

		writer.println("</body></head>");

		System.out.println("¹ÝÁö¸§: " + radius);

	}

}
