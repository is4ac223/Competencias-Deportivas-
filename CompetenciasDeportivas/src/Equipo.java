import java.util.List;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private List<JugadorInscrito> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(JugadorInscrito jugador) {
        jugadores.add(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public List<JugadorInscrito> getJugadores() {
        return jugadores;
    }
}