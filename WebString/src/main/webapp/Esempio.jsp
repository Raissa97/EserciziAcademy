<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EsempioJSP</title>
</head>
<body>
	<h1>Hello world!!</h1>
	
	<%! int count = 1; %>
	<%	
	String paeseCercato = request.getParameter("country");
	request.setAttribute("country",paeseCercato);
	/*Collection<String> sinonimi = new ArrayList();
    	
   	Collection<Corrispondenza> cor = CheckStringUse.getSinonimi(dizionario,paeseCercato);
   	for(Corrispondenza c2 : cor) {
   		sinonimi.add(c2.getPaese().getNome());
    }*/
	%>

	<h2> Paese cercato = <%= paeseCercato %></h2>
	$(country.nome) <!--  se la variabile che ho etichettato con country (riga 17) fosse u
					      un Paese, allora leggerebbe il getNome del paese.  -->
    <table style="width:100%">
	    <tr>
	    	<th>Risultati</th>
	    </tr>
	    <tr>
	    	<td style="text-align:center">biefdiujrfjoi</td>
	    </tr>
    </table>
    <%-- add lista/table di sinonimi se ce ne sono --%>
    <%--for(String paese: sinonimi) {
        out.println("<tr>"); 
        out.println("<td style=\"text-align:center\">"+paese+"</td> ");
        out.println("</tr>");
    } --%>

	<p>Numero di visitatori = <%=  count++ %></p>
</body>
</html>