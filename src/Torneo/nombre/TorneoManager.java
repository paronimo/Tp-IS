package Torneo.nombre;

public class TorneoManager {
    private static TorneoManager instancia;
    private String nombreTorneo;

    public static TorneoManager getInstancia() {
        if (instancia == null) {
            instancia = new TorneoManager();
        }
        return instancia;
    }
    private TorneoManager() {
        this.nombreTorneo = "Copa Java 2026";
    }
    public String getNombreTorneo() { return nombreTorneo; }
}
