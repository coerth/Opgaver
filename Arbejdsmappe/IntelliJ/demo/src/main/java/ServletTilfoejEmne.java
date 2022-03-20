import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "ServletTilfoejEmne", value = "/ServletTilfoejEmne")
public class ServletTilfoejEmne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession httpSession = request.getSession();
        ServletContext servletContext = getServletContext();

        String emne = request.getParameter("emne");

        Set<String> huskeListe = (Set<String>) httpSession.getAttribute("huskeListe");
        Set<String> fællesListe = (Set<String>) servletContext.getAttribute("fællesListe");

        if(fællesListe == null)
        {
            log("Fælleslisten er tom, det er første gang vi kommer her");
            fællesListe = new TreeSet<>();
        }

        if(huskeListe == null)
        {
            log("liste er tom, så det er først gang vi kommer her");
            huskeListe = new HashSet<>();
        }

        fællesListe.add(emne);
        huskeListe.add(emne);

        servletContext.setAttribute("fællesListe", fællesListe);
        httpSession.setAttribute("huskeListe", huskeListe);
        request.getRequestDispatcher("WEB-INF/tillykke.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
