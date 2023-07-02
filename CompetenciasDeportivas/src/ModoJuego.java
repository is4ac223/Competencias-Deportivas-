import java.util.List;
import java.util.ArrayList;

public class ModoJuego {
    private List<Equipo> equipos;
    private List<Jornada> jornadas;
    private EnumModoJuego tipo;

    public ModoJuego(EnumModoJuego tipo) {
        this.equipos = new ArrayList<>();
        this.jornadas = new ArrayList<>();
        this.tipo = tipo;
    }

    public void generarEnfrentamientos() {
        // Implementación para generar los enfrentamientos según el tipo de modo de juego
    }

    public EnumModoJuego getTipo() {
        return tipo;
    }
}