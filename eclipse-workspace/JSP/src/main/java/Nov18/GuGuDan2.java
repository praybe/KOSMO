package Nov18;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuGuDan2
 */
@WebServlet("/gugudan2")
public class GuGuDan2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GuGuDan2() {
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

		String dan = request.getParameter("dan");
		System.out.println("구구단: " + dan + "단");

		PrintWriter writer = response.getWriter();
		response.setContentType("text/html; charset=euc-kr");

		writer.println("<html><head></head><body>");

		int d = Integer.valueOf(dan);

		for (int i = 1; i < 10; i++) {
			writer.println(d + "x" + i + "= " + d * i + "</br>");
		}

		writer.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
