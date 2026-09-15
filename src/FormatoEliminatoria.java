// Estrategia 2: Eliminación Directa
package Torneo.eli;
public class FormatoEliminatoria implements Torneo.formato.FormatoTorneo {
    public void calcularPuntaje(String equipo, boolean victoria) {
        String estado = victoria ? "Avanza de ronda" : "Eliminado";
        System.out.println("Eliminatoria: " + equipo + " -> " + estado);
    }
}
