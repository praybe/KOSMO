package Nov18;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Triangle
 */
@WebServlet("/tri")
public class Triangle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html; charset=euc-kr");

		writer.println("<h1> Wrong place :p <h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String width = request.getParameter("width");
		String height = request.getParameter("height");

		PrintWriter writer = response.getWriter();
		response.setContentType("text/html; charset=euc-kr");

		writer.println("<html><head></head><body>");

		int w = Integer.valueOf(width);
		int h = Integer.valueOf(height);
		double area = w * h *0.5 ;

		writer.println("Area of the Triangle: " + area);

		writer.println("</body></html>");

		System.out.println("가로: " + width);
		System.out.println("세로: " + height);

	}

}
