package C6.Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private String destino;
    private LocalDate fechaVuelo;
    private Integer asientosDisponibles;
    private List<Reserva> reservas;

    public Vuelo(String destino, LocalDate fechaVuelo, Integer asientosDisponibles) {
        this.destino = destino;
        this.fechaVuelo = fechaVuelo;
        this.asientosDisponibles = asientosDisponibles;
        this.reservas = new ArrayList<>();
    }

    public void reservarVuelo(Reserva reserva) throws ReservaInvalidaException {
        if (reserva.getNombreUsuario() == null || reserva.getAsientosDeseados() == null || reserva.getFechaVuelo() == null){
            throw new ReservaInvalidaException("Faltan datos en la reserva");
        }
        if (reserva.getAsientosDeseados() > asientosDisponibles){
            throw new ReservaInvalidaException("no hay suficientes asientos para su reserva");
        }

        reservas.add(reserva);
        this.asientosDisponibles -= reserva.getAsientosDeseados();
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFechaVuelo() {
        return fechaVuelo;
    }

    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "destino='" + destino + '\'' +
                ", fechaVuelo=" + fechaVuelo +
                ", asientosDisponibles=" + asientosDisponibles +
                ", reservas=" + reservas +
                '}';
    }
}
