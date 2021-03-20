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
@WebServlet(name = "salir", urlPatterns = {"/salir"})
public class salir extends HttpServlet {

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
        processRequest(request, response);
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
        String num = request.getParameter("num1");
        double num1 = Double.parseDouble(num);
        String nu = request.getParameter("num2");
        double num2 = Double.parseDouble(nu);
        String opcion = request.getParameter("opcion");
        int op = Integer.parseInt(opcion);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Salir</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado</h1>");
            if (op == 1) {
                double suma = num1 + num2;
                out.println("<h2>La suma de " + num1 + " + " + num2 + " = " + suma + "</h2>");
            }
            if (op == 2) {
                double resta = num1 - num2;
                out.println("<h2>La resta de " + num1 + " - " + num2 + " = " + resta + "</h2>");
            }
            if (op == 3) {
                double multiplicacion = num1 * num2;
                out.println("<h2>La multiplicación de " + num1 + " * " + num2 + " = " + multiplicacion + "</h2>");
            }
            if (op == 4) {
                double division = num1 / num2;
                out.println("<h2>La división de " + num1 + " / " + num2 + " = " + division + "</h2>");
            }
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
