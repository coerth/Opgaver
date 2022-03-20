package com.example.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {

        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HttpSession httpSession = request.getSession(); //her starter vi pibetøjet

        String id = httpSession.getId();

        String navn = request.getParameter("fname"); // her henter jeg min parameter og den er altid af typen string

        List<String> demoListe = new ArrayList<>();

        demoListe.add("Ølbong");
        demoListe.add("Gummi");
        demoListe.add("Regnslag");


        request.setAttribute("demoListe", demoListe);
        request.setAttribute("id", id);
        request.setAttribute("navn",navn); // her hægter jeg min attribut på mit request objekt. det er et map

        request.getRequestDispatcher("WEB-INF/tillykke.jsp").forward(request, response); //her sender jeg mig selv ud til min tilykke side

        /*response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Tillykke " + navn+ " du har ramt servletten"+ "</h1>");
        out.println("</body></html>");*/
    }

    public void destroy() {
    }
}