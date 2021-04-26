package servlet;
//cambiare le import, cancellando le automatiche (Tomcat10)
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import com.corso.checkString.CheckStringUse;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimaServlet
 */
@WebServlet("/find")
public class FindCountry extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count=0;
	
	private ArrayList<String> dizionario = CheckStringUse.getDB();
	private String nome = "";
	
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	String paeseCercato = request.getParameter("country");
    	count++;
    	
    	/*Collection<String> sinonimi = new ArrayList();
    	
    	Collection<Corrispondenza> cor = CheckStringUse.getSinonimi(dizionario,paeseCercato);
    	for(Corrispondenza c2 : cor) {
    		sinonimi.add(c2.getPaese().getNome());
	    }*/
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Find</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Paese cercato = '" + paeseCercato+"'");
        out.println("<table style=\"width:100%\">");
        out.println("<tr><th>Risultati</th></tr>");
        out.println("<tr><td style=\"text-align:center\">biefdiujrfjoi</td></tr></table>");
        //add lista/table di sinonimi se ce ne sono
        /*for(String paese: sinonimi) {
            out.println("<tr>"); 
            out.println("<td style=\"text-align:center\">"+paese+"</td> ");
            out.println("</tr>");
        }*/
        out.println("<p>Contatore di utilizzo della Servlet:" + count +"</p>");
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