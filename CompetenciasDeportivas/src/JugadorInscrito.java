public class JugadorInscrito extends Jugador {
    private EquipoInscrito equipo;

    public JugadorInscrito(String nombre, EquipoInscrito equipo) {
        super(nombre);
        this.equipo = equipo;
    }

    public JugadorInscrito(Jugador jugador, EquipoInscrito equipo) {
        super(jugador.getNombre());
        this.equipo = equipo;
    }

    public EquipoInscrito getEquipo() {
        return equipo;
    }
}