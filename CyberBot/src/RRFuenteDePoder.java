/**
 * Copyright (C) 2024
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * @author: Ruth Rueda
 * @date: 29/01/2024
 * @version: 1.0
 */

public class RRFuenteDePoder {
    private boolean rrActiva;
    private int rrNivelEnergia;

    // Constructor
    public RRFuenteDePoder() {
        this.rrActiva = false;
        this.rrNivelEnergia = 0;
    }

    // Método para activar la fuente de poder
    public void rrActivar() {
        rrActiva = true;
        System.out.println("Fuente de poder activada.");
    }

    // Método para desactivar la fuente de poder
    public void rrDesactivar() {
        rrActiva = false;
        System.out.println("Fuente de poder desactivada.");
    }

    // Método para obtener el nivel de energía actual
    public int rrObtenerNivelEnergia() {
        return rrNivelEnergia;
    }

    // Método para cargar energía en la fuente de poder
    public void rrCargarEnergia(int rrCantidad) {
        if (rrActiva) {
            rrNivelEnergia += rrCantidad;
            System.out.println("Energía cargada. Nivel actual: " + rrNivelEnergia);
        } else {
            System.out.println("No se puede cargar energía. La fuente de poder está desactivada.");
        }
    }

    // Método para consumir energía (por ejemplo, para un robot que la utiliza)
    public void consumirEnergia(int rrCantidad) {
        if (rrActiva && rrNivelEnergia >= rrCantidad) {
            rrNivelEnergia -= rrCantidad;
            System.out.println("Energía consumida. Nivel actual: " + rrNivelEnergia);
        } else {
            System.out.println("No hay suficiente energía o la fuente de poder está desactivada.");
        }
    }

}
