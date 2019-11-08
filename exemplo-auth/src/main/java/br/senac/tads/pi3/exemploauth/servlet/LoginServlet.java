/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.exemploauth.servlet;

import br.senac.tads.pi3.exemploauth.usuario.UsuarioSistema;
import br.senac.tads.pi3.exemploauth.usuario.UsuarioSistemaService;
import br.senac.tads.pi3.exemploauth.usuario.UsuarioSistemaServiceMockImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    private UsuarioSistemaService service
            = new UsuarioSistemaServiceMockImpl();

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        if (sessao.getAttribute("usuario") != null) {
            response.sendRedirect(request.getContextPath() + "/home");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp")
                .forward(request, response);
       
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String senha = request.getParameter("senha");

        UsuarioSistema usuario = service.findByUsername(username);
        if (usuario != null && usuario.validarSenha(senha)) {
            // Usuario válido - adiciona na sessão
            HttpSession sessao = request.getSession();
            sessao.setAttribute("usuario", usuario);
            
            // Apresenta tela home para usuario.
            response.sendRedirect(request.getContextPath() + "/home");
        } else {
            // Usuario não está cadastrado, deve mostrar erro
            request.setAttribute("msgErro", "Usuario inexistente ou senha inválida");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp")
                .forward(request, response);
        }

    }

}
