import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

package com.esteban.HolaMundo;
//Necesitmaos una llave
@WebServlet("/holaServlet")
public class HolaServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req,  HttpServletResponse resp) throws ServletException, IOException{
    super.doGet(req, resp);
    }

}
