package TaosBackend.Taos.Utils;

import TaosBackend.Taos.Modelo.Vehiculo;
import lombok.Getter;
import lombok.Setter;
import java.text.SimpleDateFormat;
import java.util.*;



public class Cobro {
    @Getter
    @Setter
    private List<String> valoresDES = List.of("188.188", "389.912", "523.110", "589.944", "589.944", "589.944", "614.290", "738.464", "733.576", "868.842", "860.288", "987.188", "688.456", "994.050", "1.256.780", "774.560", "976.284", "1.170.488", "346.672", "459.566", "421.966", "524.990", "492.842", "584.586", "617.956", "788.566", "827.012", "993.016", "429.204", "536.270", "533.544", "659.410", "688.456", "807.554", "1.027.514", "1.016.234", "1.474.390");


    @Getter
    @Setter
    private Vehiculo vehiculo;

    public Cobro(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String calcularCobro() {
        String setCobro = "";
        int resul = yearActual() - getVehiculo().getModelo();
        switch (getVehiculo().getIdClase()) {
            case 1:
                if (getVehiculo().getClase() == ("Ciclomotor")) {
                    setCobro = valoresDES.get(0);
                } else if ((getVehiculo().getCilindraje()) < 100) {
                    setCobro = valoresDES.get(1);
                } else if ((getVehiculo().getCilindraje()) >= 100 && (getVehiculo().getCilindraje()) < 200) {
                    setCobro = valoresDES.get(2);
                } else if ((getVehiculo().getCilindraje()) >= 200) {
                    setCobro = valoresDES.get(3);
                } else if ((getVehiculo().getClase()) == "Motocarro, tricimoto, Cuatriciclo") {
                    setCobro = valoresDES.get(4);
                } else {
                    setCobro = valoresDES.get(5);
                }
                break;

            case 2:
                if ((getVehiculo().getCilindraje()) < 1500 && (resul < 10)) {
                    setCobro = valoresDES.get(6);
                } else if ((getVehiculo().getCilindraje()) < 1500 && (resul >= 10)) {
                    setCobro = valoresDES.get(7);
                } else if ((getVehiculo().getCilindraje()) >= 1500 && getVehiculo().getCilindraje() <= 2500 && (resul < 10)) {
                    setCobro = valoresDES.get(8);
                } else if ((getVehiculo().getCilindraje()) >= 1500 && getVehiculo().getCilindraje() <= 2500 && (resul >= 10)) {
                    setCobro = valoresDES.get(9);
                } else if ((getVehiculo().getCilindraje()) > 2500 && (resul < 10)) {
                    setCobro = valoresDES.get(10);
                } else if ((getVehiculo().getCilindraje()) > 2500 && (resul >= 10)) {
                    setCobro = valoresDES.get(11);
                }
                break;
            case 3:
                if (getVehiculo().getToneladas() < 5) {
                    setCobro = valoresDES.get(12);
                } else if (getVehiculo().getToneladas() >= 5 && getVehiculo().getToneladas() <= 15) {
                    setCobro = valoresDES.get(13);
                } else if (getVehiculo().getToneladas() > 15) {
                    setCobro = valoresDES.get(14);
                }

                break;
            case 4:

                if (getVehiculo().getCilindraje() < 1500) {
                    setCobro = valoresDES.get(15);
                } else if (getVehiculo().getCilindraje() >= 1500 && getVehiculo().getToneladas() <= 2500) {
                    setCobro = valoresDES.get(16);
                } else if (getVehiculo().getCilindraje() > 2500) {
                    setCobro = valoresDES.get(17);
                }

                break;
            case 5:

                if (getVehiculo().getCilindraje() < 1500 && (resul < 10)) {
                    setCobro = valoresDES.get(18);
                } else if (getVehiculo().getCilindraje() < 1500 && (resul >= 10)) {
                    setCobro = valoresDES.get(19);
                } else if (getVehiculo().getCilindraje() >= 1500 && getVehiculo().getCilindraje() <= 2500 && (resul < 10)) {
                    setCobro = valoresDES.get(20);
                } else if (getVehiculo().getCilindraje() >= 1500 && getVehiculo().getCilindraje() <= 2500 && (resul >= 10)) {
                    setCobro = valoresDES.get(21);
                } else if (getVehiculo().getCilindraje() > 2500 && (resul < 10)) {
                    setCobro = valoresDES.get(22);
                } else if (getVehiculo().getCilindraje() > 2500 && (resul >= 10)) {
                    setCobro = valoresDES.get(23);
                }
                break;
            case 6:
                if (getVehiculo().getCilindraje() < 2500 && (resul < 10)) {
                    setCobro = valoresDES.get(24);
                } else if (getVehiculo().getCilindraje() < 2500 && (resul >= 10)) {
                    setCobro = valoresDES.get(25);
                } else if (getVehiculo().getCilindraje() >= 2500 && (resul < 10)) {
                    setCobro = valoresDES.get(26);
                } else if (getVehiculo().getCilindraje() >= 2500 && (resul >= 10)) {
                    setCobro = valoresDES.get(27);
                }
                break;
            case 7:
                if (getVehiculo().getCilindraje() < 1500 && (resul < 10)) {
                    setCobro = valoresDES.get(28);
                } else if (getVehiculo().getCilindraje() < 1500 && (resul >= 10)) {
                    setCobro = valoresDES.get(29);
                } else if (getVehiculo().getCilindraje() >= 1500 && getVehiculo().getCilindraje() <= 2500 && (resul < 10)) {
                    setCobro = valoresDES.get(30);
                } else if (getVehiculo().getCilindraje() >= 1500 && getVehiculo().getCilindraje() <= 2500 && (resul >= 10)) {
                    setCobro = valoresDES.get(31);
                } else if (getVehiculo().getCilindraje() > 2500 && (resul < 10)) {
                    setCobro = valoresDES.get(32);
                } else if (getVehiculo().getCilindraje() > 2500 && (resul >= 10)) {
                    setCobro = valoresDES.get(33);
                }
                break;
            case 8:
                setCobro = valoresDES.get(34);
                break;
            case 9:
                if (getVehiculo().getOcupantes() < 10) {
                    setCobro = valoresDES.get(35);
                } else if (getVehiculo().getOcupantes() >= 10) {
                    setCobro = valoresDES.get(36);
                }

                break;

        }



        return "$ " + setCobro;
    }

    public static int yearActual() {
        Date date = new Date();
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(date);
        return Integer.parseInt(currentYear);
    }
}
