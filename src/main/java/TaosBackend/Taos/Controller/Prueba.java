package TaosBackend.Taos.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Prueba extends HttpServlet {
    public void doGet(HttpServletRequest pet, HttpServletResponse res) throws ServletException, IOException {
        String nombre = pet.getParameter("nombre");
        res.setContentType("text/plain");
        PrintWriter pw = res.getWriter();
        pw.println("Tu nombre: " + nombre);
        pw.close();
    }
}