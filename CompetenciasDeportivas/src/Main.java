public class Main {
    public static void main(String[] args) {
        // Crear equipos
        EquipoInscrito equipo1 = new EquipoInscrito("Equipo 1");
        EquipoInscrito equipo2 = new EquipoInscrito("Equipo 2");

        // Crear jugadores
        Jugador jugador1 = new Jugador("Messi");
        Jugador jugador2 = new Jugador("Cristiano Ronaldo");

        // Crear jugadores inscritos
        JugadorInscrito jugadorInscrito1 = new JugadorInscrito(jugador1, equipo1);
        JugadorInscrito jugadorInscrito2 = new JugadorInscrito(jugador2, equipo2);

        // Agregar jugadores al equipo
        equipo1.agregarJugador(jugadorInscrito1);
        equipo2.agregarJugador(jugadorInscrito2);

        // Crear partido
        Partido partido = new Partido(equipo1, equipo2);

        // Agregar goles al marcador
        partido.getMarcador().agregarGolLocal();
        partido.getMarcador().agregarGolVisitante();

        // Obtener los equipos del partido
        Equipo equipoLocal = partido.getEquipoLocal();
        Equipo equipoVisitante = partido.getEquipoVisitante();

        // Imprimir los nombres de los equipos
        System.out.println("Equipo local: " + equipoLocal.getNombre());
        System.out.println("Equipo visitante: " + equipoVisitante.getNombre());

        // Imprimir el resultado del partido
        System.out.println("Resultado: " + partido.getMarcador().obtenerResultadoFinal());

        //Impresion de los jugadores de cada equipo
        System.out.println("Jugadores del equipo local: ");
        for (JugadorInscrito jugador : equipoLocal.getJugadores()) {
            System.out.println(jugador.getNombre());
        }
        System.out.println("Jugadores del equipo visitante: ");
        for (JugadorInscrito jugador : equipoVisitante.getJugadores()) {
            System.out.println(jugador.getNombre());
        }
    }
}