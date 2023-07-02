import java.util.List;
import java.util.ArrayList;

public class CompetenciaDeportiva {
    private List<Equipo> equipos;
    private EnumDeporteIndividual deporteIndividual;
    private EnumDeporteGrupal deporteGrupal;
    private ModoJuego modoJuego;

    public CompetenciaDeportiva(EnumDeporteIndividual deporteIndividual, EnumDeporteGrupal deporteGrupal, ModoJuego modoJuego) {
        this.equipos = new ArrayList<>();
        this.deporteIndividual = deporteIndividual;
        this.deporteGrupal = deporteGrupal;
        this.modoJuego = modoJuego;
    }

    public void inscribirEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public EnumDeporteIndividual getDeporteIndividual() {
        return deporteIndividual;
    }

    public EnumDeporteGrupal getDeporteGrupal() {
        return deporteGrupal;
    }

    public ModoJuego getModoJuego() {
        return modoJuego;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }
}