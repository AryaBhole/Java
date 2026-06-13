import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServletApp
 */
@WebServlet("/FirstServlet")
public class FirstServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServletApp() {
		System.out.println("Servlet objext is created internally by container");
	}
	
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String ucity = request.getParameter("ucity");
		
		PrintWriter writer = response.getWriter();
	
		writer.print("Hello " + uname);
		writer.println(" from " + ucity);
		
		writer.close();
	}

}