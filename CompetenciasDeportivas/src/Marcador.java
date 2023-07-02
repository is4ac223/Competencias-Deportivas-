public class Marcador {
    private int golesLocal;
    private int golesVisitante;

    public void agregarGolLocal() {
        golesLocal++;
    }

    public void agregarGolVisitante() {
        golesVisitante++;
    }

    public String obtenerResultadoFinal() {
        if (golesLocal > golesVisitante) {
            return "Gana el equipo local";
        } else if (golesLocal < golesVisitante) {
            return "Gana el equipo visitante";
        } else {
            return "Empate";
        }
    }
}