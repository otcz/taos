package TaosBackend.Taos.Modelo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@Entity
@Table(name = "vehiculo")
@ToString
@EqualsAndHashCode
public class Vehiculo {


    @Getter
    @Setter
    @Column(name = "identificacion")
    private Long identificacion;

    @Getter
    @Setter
    @Nullable
    @Column(name = "nombres")
    private String nombres;

    @Getter
    @Setter
    @Column(name = "telefono")
    private String telefono;

    @Id
    @Getter
    @Setter
    @Column(name = "placa")
    String placa; //EDT345

    @Getter
    @Setter
    @Column(name = "tipo")
    String tipo;//Particular

    @Getter
    @Setter
    @Column(name = "clase")
    String clase;//AUTOMOVIL

    @Getter
    @Setter
    @Column(name = "idclase")
    int idClase;//1-9

    @Getter
    @Setter
    @Column(name = "marca")
    String marca;//RENAULT


    @Getter
    @Setter
    @Column(name = "modelo")
    int modelo;//2007


    @Getter
    @Setter
    @Column(name = "linea")
    String linea;//R-CLIO II AUTHENTIQUE EO


    @Getter
    @Setter
    @Column(name = "cilindraje")
    int cilindraje;//1400


    @Getter
    @Setter
    @Column(name = "color")
    String color;//ROJO AMBAR

    @Getter
    @Setter
    @Column(name = "noserie")
    String noserie;

    @Getter
    @Setter
    @Column(name = "nomotor")
    String nomotor;

    @Getter
    @Setter
    @Column(name = "nochasis")
    String nochasis;

    //________________________________________________
    @Getter
    @Setter
    @Column(name = "nonewsoat")
    String nonewsoat;

    //________________________________________________
    @Getter
    @Setter
    @Column(name = "yyycomsoat")
    String yyycomsoat;

    @Getter
    @Setter
    @Column(name = "mmcomsoat")
    String mmcomsoat;

    @Getter
    @Setter
    @Column(name = "ddcomsoat")
    String ddcomsoat;

    @Getter
    @Setter
    @Column(name = "yyyvennusoat")
    String yyyvennusoat;

    @Getter
    @Setter
    @Column(name = "mmvennusoat")
    String mmvennusoat;

    @Getter
    @Setter
    @Column(name = "ddvennusoat")
    String ddvennusoat;

    @Getter
    @Setter
    @Column(name = "valnewsoat")
    String valnewsoat;
//________________________________________________

    @Getter
    @Setter
    @Column(name = "toneladas")
    double toneladas;

    @Getter
    @Setter
    @Column(name = "ocupantes")
    int ocupantes;

    @Getter
    @Setter
    @Column(name = "compro")
    String compro;

    public void obtenerDatosVehiculoVerifik(String token) {
        try {
            URL obj = new URL("https://api.verifik.co/v2/co/runt/consultarVehiculoCompleto?plate=" + getPlaca());
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("autenticacion", token);
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                ObjectMapper mapper = new ObjectMapper();
                JsonNode node = mapper.readTree(response.toString());
                System.out.println(response);
                setPlaca(node.get("data").get("plate").asText());
                setTipo(node.get("data").get("vehicle").get("tipoServicio").asText());
                setMarca(node.get("data").get("vehicle").get("marca").asText());
                setClase(node.get("data").get("vehicle").get("claseVehiculo").asText());
                setIdClase(Integer.parseInt(node.get("data").get("vehicle").get("codClaseSise").asText()));
                setModelo(Integer.parseInt(node.get("data").get("vehicle").get("modelo").asText()));
                setLinea(node.get("data").get("vehicle").get("linea").asText());
                setCilindraje(Integer.parseInt(node.get("data").get("vehicle").get("cilindraje").asText()));
                setColor(node.get("data").get("vehicle").get("color").asText());
                setNoserie(node.get("data").get("vehicle").get("noSerie").asText());
                setNomotor(node.get("data").get("vehicle").get("noMotor").asText());
                setNochasis(node.get("data").get("vehicle").get("noChasis").asText());
                setOcupantes(Integer.parseInt(node.get("data").get("vehicle").get("ocupantes").asText()));
                setToneladas(Double.parseDouble(node.get("data").get("vehicle").get("toneladas").asText()));

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
