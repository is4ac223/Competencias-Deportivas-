import java.util.List;
import java.util.ArrayList;

public class Jornada {
    private List<Partido> enfrentamientos;

    public Jornada() {
        this.enfrentamientos = new ArrayList<>();
    }

    public void asignarFecha() {
        // Implementación para asignar fecha a los partidos de la jornada
    }

    public void agregarPartido(Partido partido) {
        enfrentamientos.add(partido);
    }

    public List<Partido> getPartidos() {
        return enfrentamientos;
    }
}