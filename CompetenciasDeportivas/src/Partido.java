public class Partido {
    private EquipoInscrito equipoLocal;
    private EquipoInscrito equipoVisitante;
    private Marcador marcador;

    public Partido(EquipoInscrito equipoLocal, EquipoInscrito equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.marcador = new Marcador();
    }

    public EquipoInscrito getEquipoLocal() {
        return equipoLocal;
    }

    public EquipoInscrito getEquipoVisitante() {
        return equipoVisitante;
    }

    public Marcador getMarcador() {
        return marcador;
    }
}
