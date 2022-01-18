/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class ArithmeticCalculatorServlet extends HttpServlet {
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
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
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
                String firstNumString = request.getParameter("firstNum");
                String secondNumString = request.getParameter("secondNum");
        if((request.getParameter("firstNum")!=null && request.getParameter("secondNum")!=null) && (request.getParameter("firstNum")!="" && request.getParameter("secondNum")!="")){
            
            try{
//                String firstNumString = request.getParameter("firstNum");
//                String secondNumString = request.getParameter("secondNum");

                int firstNumInt = Integer.parseInt(firstNumString);
                int secondNumInt = Integer.parseInt(secondNumString);            
                if(request.getParameter("operation").equals("a")){
                    String result=firstNumInt+secondNumInt+"";               
                    request.setAttribute("messagea",result);
                }
                else if(request.getParameter("operation").equals("b")){
                    String result=firstNumInt-secondNumInt+""; 
                    request.setAttribute("messagea", result);
                }
                else if(request.getParameter("operation").equals("c")){
                    String result=firstNumInt*secondNumInt+"";
                    request.setAttribute("messagea", result);
                }
                else if(request.getParameter("operation").equals("d")){
                    String result=firstNumInt/secondNumInt+"";
                    request.setAttribute("messagea", result);
                }
            }catch(Exception ex){   
                     request.setAttribute("messagea", "Invalid");
            }
        }else if((request.getParameter("firstNum")==null && request.getParameter("secondNum")==null) || (request.getParameter("firstNum")=="" && request.getParameter("secondNum")=="")){
           request.setAttribute("messagea", "---");
        }else if(request.getParameter("firstNum")!=null || request.getParameter("secondNum")!=null){
            request.setAttribute("messagea", "Invalid");
        }else{
             request.setAttribute("messagea", "---");  
        }
        
        request.setAttribute("firstNumber", firstNumString);
        request.setAttribute("secondNumber", secondNumString);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

}
