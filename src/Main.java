import Torneo.nombre.TorneoManager;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Singleton
    TorneoManager torneo = TorneoManager.getInstancia();
    System.out.println("Iniciando: " + torneo.getNombreTorneo());

    // Strategy
    Torneo.formato.FormatoTorneo formato = new Torneo.liga.FormatoLiga();
    formato.calcularPuntaje("Equipo A", true);

    // Observer
    Partido partido = new Partido();
    partido.agregarObservador(new PantallaEstadio());
    partido.anotarGol("Equipo A");
}
