package TaosBackend.Taos.Controller;

import TaosBackend.Taos.Modelo.Usuario;
import TaosBackend.Taos.Modelo.Vehiculo;
import TaosBackend.Taos.Utils.Cobro;
import TaosBackend.Taos.Utils.SOAT;
import TaosBackend.Taos.Utils.Token;
import TaosBackend.Taos.dao.UsuarioDao;
import TaosBackend.Taos.dao.VehiculoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@RestController
public class VehiculoController {
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private VehiculoDAO vehiculoDAO;

    @Autowired
    private Token token;

    @RequestMapping(value = "usuarios", method = RequestMethod.POST)
    public Vehiculo getUsuarios(@RequestBody Usuario comprador) {

        String sToken = token.obtenerToken();
        System.out.println(sToken);
        comprador.completarNombreUsuario(sToken);
        Vehiculo vehiculo = new Vehiculo();

        //  vehiculo.obtenerDatosVehiculoVerifik(sToken);
        Cobro cobro = new Cobro(vehiculo);
        vehiculo.setValnewsoat(cobro.calcularCobro());

        vehiculo.setYyycomsoat(String.valueOf(cobro.date(Calendar.YEAR)));
        vehiculo.setMmcomsoat(cobro.mes());
        vehiculo.setDdcomsoat(String.valueOf(cobro.date(Calendar.DATE)));
        vehiculo.setYyyvennusoat(String.valueOf((cobro.date(Calendar.YEAR) + 1)));
        vehiculo.setMmvennusoat(cobro.mes());
        vehiculo.setDdvennusoat(String.valueOf(cobro.date(Calendar.DATE)));
        vehiculo.setCompro("NO");

        //vehiculoDAO.registrar(vehiculo);

        return vehiculo;
    }

    @RequestMapping(value = "/document/{placa}", method = RequestMethod.GET)
    public void documet(HttpServletResponse response, @PathVariable String placa) {

        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<t1>login ok</t1>");
            out.println("</body>");
            out.println("</html>");

        } catch (IOException ex) {

        }
    }

    @RequestMapping(value = "https://soatcolpatria.herokuapp.com/api/enviar/{id}")
    public void enviarMSN(@PathVariable int id) {
        if (id == 1) {
            EnviarMensajeMSN mensajeMSN = new EnviarMensajeMSN("+573135331533");

            mensajeMSN.setNumeroWhatsApp("whatsapp:+573209972451");
            mensajeMSN.enviarWhatsApp();

            mensajeMSN.enviarWhatsApp("whatsapp:+573209972451");
            mensajeMSN.enviarMNS();


        }


    }
}
