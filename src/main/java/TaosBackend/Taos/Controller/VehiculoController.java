package TaosBackend.Taos.Controller;

import TaosBackend.Taos.Modelo.Usuario;
import TaosBackend.Taos.Modelo.Vehiculo;
import TaosBackend.Taos.Utils.Cobro;
import TaosBackend.Taos.Utils.SOAT;
import TaosBackend.Taos.Utils.Token;
import TaosBackend.Taos.dao.UsuarioDao;
import TaosBackend.Taos.dao.VehiculoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehiculoController {
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private VehiculoDAO vehiculoDAO;

    @Autowired
    private Token token;


    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public Vehiculo getUsuarios(@RequestBody Usuario comprador) {
        // String sToken = token.token();
        // comprador.obetnerNombreUsuario(sToken);
        // usuarioDao.registrar(comprador);

        Vehiculo vehiculo = new Vehiculo();
       // Cobro cobro = new Cobro(vehiculo);
        // vehiculo.setPlaca(comprador.getPlaca());
        // vehiculo.registrarVehiculo(sToken);
        // vehiculo.setValnewsoat(cobro.calcularCobro());
        // vehiculoDAO.registrar(vehiculo);


        vehiculo.setPlaca("EBP395");
        vehiculo.setNombres("OSCAR TOMAS");
        vehiculo.setNochasis("354456356");
        vehiculo.setNomotor("3453453");
        vehiculo.setLinea("SPARK");
        vehiculo.setModelo(2018);
        vehiculo.setMarca("CHEVROLET");
        vehiculo.setOcupantes(5);
        vehiculo.setCilindraje(1250);
        vehiculo.setToneladas(0);
        vehiculo.setId(1L);
        vehiculo.setColor("NEGRO");
        vehiculo.setTipo("Particular");
        vehiculo.setClase("AUTOMOVIL");
        vehiculo.setNoserie("3565432");
        vehiculo.setIdClase(5);

        Cobro cobro = new Cobro(vehiculo);
        vehiculo.setValnewsoat(cobro.calcularCobro());
        SOAT soat = new SOAT(vehiculo);
        soat.doGet();
        return vehiculo;
    }

    @RequestMapping(value = "api/document", method = RequestMethod.POST)
    public Vehiculo documet(@RequestBody Vehiculo comprador) {


        return null;
    }

}
