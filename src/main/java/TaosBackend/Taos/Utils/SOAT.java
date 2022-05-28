package TaosBackend.Taos.Utils;

import TaosBackend.Taos.Modelo.Soat;
import TaosBackend.Taos.Modelo.Vehiculo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class SOAT {
    @Getter
    @Setter
    private Vehiculo vehiculo;

    public SOAT(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void exportarReporteSOAT() {
        try {

            File theFile = new File("src/main/java/TaosBackend/Taos/Utils/soat_prueba.jasper");
            JasperReport report = (JasperReport) JRLoader.loadObject(theFile);

            Map<String, Object> parameters = new HashMap();
            parameters.put("email", "OSCAR");
            JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
            JasperExportManager.exportReportToPdfFile(jasperPrint, "src/main/java/TaosBackend/Taos/Utils/soat_prueba.pdf");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exportarReporteEmpleados(Vehiculo vehiculo) {
        try {
            Empleado empleado= new Empleado("TOMAS");
            List<Empleado> reportesEmpleados = new ArrayList<>();

            reportesEmpleados.add(empleado);
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("src/main/java/TaosBackend/Taos/Utils/soat_prueba.jasper"); //Se carga el reporte de su localizacion
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(reportesEmpleados)); //Agregamos los parametros para llenar el reporte

            JasperExportManager.exportReportToPdfFile(jprint, "src/main/java/TaosBackend/Taos/Utils/soat_prueba.pdf");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
