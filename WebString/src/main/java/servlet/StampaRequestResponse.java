package servlet;
//cambiare le import, cancellando le automatiche (Tomcat10)
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimaServlet
 */
@WebServlet("/print")
public class StampaRequestResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count=0;
	
	//private ArrayList<String> dizionario = getDB();
	private String nome = "";
	
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	String paeseCercato = request.getParameter("paese");
    	count++;
    	//CheckStringUse.checkString(dizionario,paeseCercato);
    	
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Print GET</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<label>Request:</label>");
        out.println("<ul><li>request = " +request.toString() +"</li>" );
        out.println("<li>Method = " +request.getMethod() +"</li>" );
        out.println("<li>Request URL = " + request.getRequestURL() + "</li>" );
        out.println("<li>Paese cercato = '" + paeseCercato + "'</li></ul>" );
        
        out.println("<label>Response:</label>");
        out.println("<ul><li>response = " +response.toString() +"</li>" );
        out.println("<li>Location = " +response.getLocale() +"</li>" );
        out.println("<li>Status = " + response.getStatus() + "</li></ul>" );
        out.println("<label>Contatore di utilizzo della Servlet: </label>" + count );
        out.println("</body>");
        out.println("</html>");
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}