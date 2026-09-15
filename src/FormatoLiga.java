// Estrategia 1: Liga
package Torneo.liga;
public class FormatoLiga implements Torneo.formato.FormatoTorneo {
    public void calcularPuntaje(String equipo, boolean victoria) {
        int puntos = victoria ? 3 : 0;
        System.out.println("Liga: " + equipo + " recibe " + puntos + " puntos.");
    }
}
