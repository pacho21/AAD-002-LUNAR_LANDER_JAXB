
import generated.Settings;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXB;

@WebServlet(urlPatterns = {"/CargarXML"})
public class CargarXML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = getServletContext();
        String fullPath = context.getRealPath("/settings.xml");
        File f = new File(fullPath);

        //parse xml to object (Personas, previusly created with JAXB)
        JAXBSettings jaxb = new JAXBSettings();
        Settings sts = jaxb.xmlToObject(f);  //En aquest punt podem modificar prs, es un objecte.

        //marshall object to string xml
        StringWriter sw = new StringWriter();
        JAXB.marshal(sts, sw);
        String xmlString = sw.toString();

        //return XML
        response.setContentType("text/xml");
        PrintWriter pw = response.getWriter();
        pw.println(xmlString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
