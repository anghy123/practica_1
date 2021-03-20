/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ANGELA CATACORA
 */
@WebServlet(name = "menu", urlPatterns = {"/menu"})
public class menu extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Menu</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='1' align='center' cellspacing='0' cellpadding='4'>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<h1>Operaciones</h1>");
            out.println("<form action='salir' method='post'>");
            out.println("<label align='center'>Ingrese numero</label>");
            out.println("<input type='text' name='num1'>");
            out.println("<br><br>");
            out.println("<label align='center'>Ingrese numero</label>");
            out.println("<input type='text' name='num2'>");
            out.println("<br><br>");
            out.println("<label for='op'>Escoja una operacion</lavel>");
            out.println("<select name='opcion' id='op'>");
            out.println("<option value='1'>Suma</option>");
            out.println("<option value='2'>Resta</option>");
            out.println("<option value='3'>Multiplicacion</option>");
            out.println("<option value='4'>Division</option>");
            out.println("</select>");
            out.println("<br><br>");
            out.println("<input type='submit' value='PROCESAR'>");
            out.println("</form>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }  
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
