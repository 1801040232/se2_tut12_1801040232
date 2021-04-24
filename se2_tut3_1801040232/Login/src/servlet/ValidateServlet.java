package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Reading the user's input
		String user = req.getParameter("user");
		// Reading the user's input
		String pass = req.getParameter("pass");
		String validate;
		if(user.equals("admin") && pass.equals("123456")) {
			validate = "login successfully";
		} else {
			validate = "login fail";
		}
		// Setting the content type
		res.setContentType("text/html");
		// Getting the stream to write the data
		PrintWriter pw = res.getWriter();
		// Writing html in the stream
		pw.println("<html>\n" + "<body>" + "<h2>" + validate + " !\n" + "</body>" + "</html>");
		// Closing the stream
		pw.close();
	}
}
