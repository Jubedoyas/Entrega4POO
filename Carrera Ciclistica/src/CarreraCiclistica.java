public class CarreraCiclistica {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("UnalMedellin","Colombia");
        Velocista velocista = new Velocista(142354, "Juliana Andrea ", 350, 40);
        Escalador escalador = new Escalador(142355, "Josué Duque ", 25, 10);
        Contrarrelojista contrarrelojista = new Contrarrelojista(142356,"Diego Fernando ", 120);
        equipo.anadirCiclista(velocista);
        equipo.anadirCiclista(escalador);
        equipo.anadirCiclista(contrarrelojista);
        velocista.setTiempoAcumulado(320);
        escalador.setTiempoAcumulado(310);
        contrarrelojista.setTiempoAcumulado(360);
        equipo.totalTiempo();
        equipo.imprimir();
        equipo.equipo();
    }
}
