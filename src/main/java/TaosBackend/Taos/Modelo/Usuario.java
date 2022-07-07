package TaosBackend.Taos.Modelo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.json.JSONObject;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.springframework.http.HttpHeaders.USER_AGENT;


@Entity
@Table(name = "usuario")
@ToString
@EqualsAndHashCode
public class Usuario {
    @Id
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

    @Getter
    @Setter
    @Column(name = "placa")
    private String placa;


    public void completarNombreUsuario(String token) {
        try {
            URL url = new URL("https://api.verifik.co/v2/co/runt/consultarConductor?documentType=CC&documentNumber=" + getIdentificacion());

            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("autenticacion", token);
            con.setDoOutput(true);
            try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                ObjectMapper mapper = new ObjectMapper();
                JsonNode node = mapper.readTree(response.toString());
                setNombres(node.get("fullName").asText());
                System.out.println(getNombres()+"OSCAR ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
