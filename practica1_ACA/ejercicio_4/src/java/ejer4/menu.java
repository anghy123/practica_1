/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

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
            out.println("<title>Servlet menu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='1' align='center' cellspacing='0' cellpadding='4'>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<h1 align='center'> introducir datos en bolivianos y en dolares</h1>");
            out.println("<form action='menu' method='post'>");
            out.println("<label>monto en bolivianos</label>");
            out.println("<input type='number' name='bolivianos'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label>monto en dolares</label>");
            out.println("<input type='number' name='dolares'>");
            out.println("<br>");
            out.println("<input type='submit' value='procesar'>");
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
        String bolivianos=request.getParameter("bolivianos");
        int boliviano = Integer.parseInt(bolivianos);
        String dolares=request.getParameter("dolares");
        int dolar = Integer.parseInt(dolares);
        double r1,r2;
        double t=6.90;
        r1= boliviano*t;
        double t2=0.144;
        r2= dolar*t2;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet menu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'> introducir datos en bolivianos y en dolares</h1>");
            out.println("<p align='center'>el monto en bolivianos es: "+r1+"</p>");
            out.println("<p align='center'>el monto en dolares es: "+r2+"</p>");
            out.println("</body>");
            out.println("</html>");
        }
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
