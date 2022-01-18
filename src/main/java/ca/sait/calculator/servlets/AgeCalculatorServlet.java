
package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrater
 */
public class AgeCalculatorServlet extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
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
//        String ageInput = request.getAttribute("age");  //work with jsp <p style="request.getParameter("age") ? > 1 "good" : "not good"">${age}</p>
        if(request.getParameter("age") !=null){
            try{
                String ageString = request.getParameter("age");
                int age = Integer.parseInt(ageString);

                int ageNextBirthday = age + 1;

                request.setAttribute("message", "You will be " + ageNextBirthday + " after your next birthday.");
            }catch(Exception ex){   
                request.setAttribute("message", "Invalid age sumitted.");
            }

        }else{
            request.setAttribute("message", "Age is missing.");
        }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
    }

}
