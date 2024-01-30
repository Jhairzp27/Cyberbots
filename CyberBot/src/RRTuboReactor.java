/**
 * Copyright (C) 2024
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * @author: Ruth Rueda
 * @date: 29/01/2024
 * @version: 1.0
 */

public class RRTuboReactor {
    private boolean rrEncendido;
    private int rrPotencia;

    // Constructor
    public RRTuboReactor() {
        this.rrEncendido = false;
        this.rrPotencia = 0;
    }

    // Método para encender el tubo reactor
    public void encender() {
        rrEncendido = true;
        System.out.println("Tubo reactor encendido.");
    }

    // Método para apagar el tubo reactor
    public void apagar() {
        rrEncendido = false;
        System.out.println("Tubo reactor apagado.");
    }

    // Método para ajustar la potencia del tubo reactor
    public void ajustarPotencia(int rrNuevaPotencia) {
        if (rrEncendido) {
            rrPotencia = Math.max(0, rrNuevaPotencia); // Asegurar que la potencia no sea negativa
            System.out.println("Potencia del tubo reactor ajustada a: " + rrPotencia);
        } else {
            System.out.println("No se puede ajustar la potencia. Enciende el tubo reactor primero.");
        }
    }

    // Método para volar utilizando el tubo reactor
    public void volar() {
        if (rrEncendido && rrPotencia > 0) {
            System.out.println("¡CyberBot está volando con una potencia de " + rrPotencia + "!");
        } else {
            System.out.println("No se puede volar. Asegúrate de que el tubo reactor esté encendido y la potencia sea mayor a cero.");
        }
    }
}
