/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.exemploweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "ParametrosServlet", urlPatterns = {"/parametros"})
public class ParametrosServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String dtNascStr = request.getParameter("dtnasc"); // Formato: yyyy-MM-dd
        if (dtNascStr != null) {
            LocalDate dtNasc = LocalDate.parse(dtNascStr);
            Period periodo = Period.between(dtNasc, LocalDate.now());
            request.setAttribute("idade", periodo.getYears());
        }
        request.setAttribute("nome", nome);
        request.setAttribute("dtNasc", dtNascStr);
        
        RequestDispatcher dispatcher = 
                request.getRequestDispatcher("/WEB-INF/parametro-resultado.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }

}
