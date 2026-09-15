import java.util.ArrayList;
import java.util.List;

public interface Observer {
        void actualizar(String mensaje);
    }

    // Pantalla / Espectador
    class PantallaEstadio implements Observer {
        public void actualizar(String mensaje) {
            System.out.println("[Pantalla Estadio] " + mensaje);
        }
    }

    // Sujeto (El Partido)
    class Partido {
        private List<Observer> observadores = new ArrayList<>();

        public void agregarObservador(Observer obs) { observadores.add(obs); }

        public void anotarGol(String equipo) {
            String evento = "¡GOL de " + equipo + "!";
            for (Observer obs : observadores) {
                obs.actualizar(evento);
            }
        }
    }
