import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VotingServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws IOException, ServletException{
		
		String emailAddress = request.getParameter("emailAddress");
		String name = request.getParameter("name");
		String song1 = request.getParameter("song1");
		String song2 = request.getParameter("song2");
		String song3 = request.getParameter("song3");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Name: "+name+"s your top3 songs are submitted!!</body></html>");
		
		
	}

}
