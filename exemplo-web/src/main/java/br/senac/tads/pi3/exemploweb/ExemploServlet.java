/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.exemploweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "ExemploServlet", urlPatterns = "/exemplo")
public class ExemploServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>TODO supply a title</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Exemplo Servlet</h1>");
            out.println("<p>Primeiro exemplo de Servlet de projeto Java Web</p>");

            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
            out.println("<p>Data e hora de acesso: " + formatter.format(new Date()) + "</p>");

            for (int i = 1; i <= 100; i++) {
                out.println("<p>Item" + i + "</p>");
            }

            out.println("</body>");
            out.println("</html>");
        }

    }

}
