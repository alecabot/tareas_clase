package C6.Ejercicio1;

import java.time.LocalDate;

public class Reserva {
    private String nombreUsuario;
    private LocalDate fechaVuelo;
    private Integer asientosDeseados;

    public Reserva(String nombreUsuario, LocalDate fechaVuelo, Integer asientosDeseados) {
        this.nombreUsuario = nombreUsuario;
        this.fechaVuelo = fechaVuelo;
        this.asientosDeseados = asientosDeseados;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public LocalDate getFechaVuelo() {
        return fechaVuelo;
    }

    public Integer getAsientosDeseados() {
        return asientosDeseados;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", fechaVuelo=" + fechaVuelo +
                ", asientosDeseados=" + asientosDeseados +
                '}';
    }
}
