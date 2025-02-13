package Mundo;

public class EcuacionRecta {
    private double x1, y1, x2, y2;

    public EcuacionRecta(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Calcular pendiente (m = (y2 - y1) / (x2 - x1))
    public String calcularPendiente() {
        if (x2 == x1) {
            return "Indefinida"; 
        }
        return String.valueOf((y2 - y1) / (x2 - x1));
    }

    // Mostrar la ecuación de la recta en la forma y = mx + b
    public String mostrarEcuacion() {
        if (x2 == x1) {
            return "x = " + x1; 
        }
        double pendiente = (y2 - y1) / (x2 - x1);
        double b = y1 - pendiente * x1; // b = y1 - mx1
        return "y = " + pendiente + "x + " + b;
    }
}
