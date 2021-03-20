/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7;

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
        String vn= request.getParameter("numero");
        int numero=Integer.parseInt(vn);
        int filas=numero;
        int columnas=numero;
        boolean derecha = true, izquierda = false, abajo = false;
        int[][] matrizc = new int[ filas ][ columnas ];
        int x = 0, y = -1;
        for( int k = 1; k <= columnas * filas; k++ ) {
          if( izquierda ) {
            y --;
            if( y == -1 ) {
              y = 0; x --;
              izquierda = false;
            } else if( matrizc[ x ][ y ] != 0 ) {
              y ++; x --;
              izquierda = false;
            }
          } else if( derecha ) {
            y ++;
            if( y == columnas ) {
              y = columnas - 1; x ++;
              derecha = false;
              abajo = true;
            } else if( matrizc[ x ][ y ] != 0 ) {
              y --; x ++;
              derecha = false;
              abajo = true;
            }
          } else if( abajo ) {
            x ++;
            if( x == filas ) {
              x = filas - 1; y --;
              abajo = false;
              izquierda = true;
            } else if( matrizc[ x ][ y ] != 0 ) {
              y --; x --;
              abajo = false;
              izquierda = true;
            }
          } else {
            x --;
            if( x == -1 || matrizc[ x ][ y ] != 0 ) {
              x ++; y ++;
              derecha = true;
            }
          }

          matrizc[ x ][ y ] = k;
        }
        

                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet salir</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>Matriz: " +numero+" X "+numero+"</h1>");
            out.println("<table border='1' align='center' cellspacing='0' cellpadding='4'");
            
            for( int i = 0; i < filas; i++ ) 
            {
            out.println("<tr>");    
              for( int j = 0; j < columnas; j++ ) 
              {
                out.println("<td><center>"+matrizc[i][j]+"</center></td>");
              }
            out.println("</tr>");
            }
            out.println("</table");

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
