
import generated.Settings;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

@WebServlet(urlPatterns = {"/GuardarXML"})
public class GuardarXML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //do Magic Here :-)
        try {
            String nombre = request.getParameter("nombre");
            byte d= (byte) Integer.parseInt(request.getParameter("dificultad"));
            byte n= (byte) Integer.parseInt(request.getParameter("modeloNave"));
            byte l= (byte) Integer.parseInt(request.getParameter("modeloLuna"));
            
            ServletContext context = getServletContext();
            String fullPath = context.getRealPath("/settings.xml");
            File f = new File(fullPath);


            JAXBSettings jaxb = new JAXBSettings();
            Settings sets = jaxb.xmlToObject(f);
            
            byte id = (byte)(sets.getOption().size()+1);
            
            Settings.Option op = new Settings.Option();
            
            //creando objeto
            op.setId(id);
            op.setNombre(nombre);
            op.setDificultad(d);
            op.setModeloNave(n);
            op.setModeloLuna(l);
            
            sets.getOption().add(op);
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Settings.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(sets, f);

            response.setContentType("application/json");
            PrintWriter pw = response.getWriter();
            pw.println("{\"mess\":\"Se ha guardado correctamente\",\"id\":\""+id+"\"}");

        } catch (Exception e) {

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
