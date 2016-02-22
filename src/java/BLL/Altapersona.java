/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.NewHibernateUtil;
import DAO.Operaciones;
import POJO.Direccion;
import POJO.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.SessionFactory;

/**
 *
 * @author Usuario
 */
public class Altapersona extends HttpServlet {
private SessionFactory con;
    @Override
    public void init() throws ServletException {
        con= NewHibernateUtil.getSessionFactory();
    }
    
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
        
        
        HttpSession session=request.getSession(true);
        
        String name=request.getParameter("name");
        String surname=request.getParameter("apellido");
        String phone=request.getParameter("phone");
        String DNI=request.getParameter("nif");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nacimiento=LocalDate.parse(request.getParameter("birthdate"),formatter);
        
        
        
        
        String calle=request.getParameter("street");
        String portal=request.getParameter("portal");
        String piso=request.getParameter("floor");
        
        
        Persona personaalta=new Persona(name, surname, phone,DNI, nacimiento);
        Direccion direccionalta=new Direccion(calle,portal,piso);
        personaalta.setDireccion(direccionalta);
        
        Operaciones operation=new Operaciones();
        int result=operation.Alta(personaalta, con);
        
        if(result==1){
            session.setAttribute("error", "<span style='color:green'>Persona dada de alta correctamente</span>");
        }
        else{
            session.setAttribute("error", "<span style='color:red'>Error añadiendo a la persona</span>");
        }
        
        
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Altapersona</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Altapersona at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
