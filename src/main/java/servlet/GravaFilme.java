package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classe respons�vel por demonstrar a utiliza��o de servlet passando parametros
 * 
 * @author Diego Munhoz
 * @since 23/04/2021
 * @version 1.0
 */
public class GravaFilme extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// capturando a referencia do objeto de escrita de HTML - objeto resp
		PrintWriter tela = resp.getWriter();

		// desenhando uma tela HTML
		tela.println("<html>");
		tela.println("<head>");
		tela.println("<title>Filme Gravado</title>");
		tela.println("</head>");

		tela.println("<body>");

		tela.println("<h1>Filme Gravado com sucesso!</h1><br><br>");
		tela.println(req.getParameter("nome"));
		tela.println(req.getParameter("valor"));

		tela.println("<br><br>");
		tela.println("<a href='http://localhost:8080/web-servlet/'>P�gina Principal</a>");

		tela.println("</body>");

		tela.println("</html>");

	}

}
