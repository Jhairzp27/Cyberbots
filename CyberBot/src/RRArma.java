/**
 * Copyright (C) 2024
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * @author: Ruth Rueda
 * @date: 29/01/2024
 * @version: 1.0
 */

public abstract class RRArma {
    private boolean rrEncendida;
    private boolean rrConMuniciones;

    public RRArma () {
        this.rrEncendida = false;
        this.rrConMuniciones = false;
    }

    // Métodos abstractos a ser implementados por las clases hijas
    public abstract void rrDisparar();

    // Métodos comunes para todas las armas
    public void rrEncender() {
        rrEncendida = true;
        System.out.println("El arma está encendida.");
    }

    public void rrApagar() {
        rrEncendida = false;
        System.out.println("El arma está apagada.");
    }

    public void rrCargar() {
        rrConMuniciones = true;
        System.out.println("El arma está cargada con municiones.");
    }

    public void rrDescargar() {
        rrConMuniciones = false;
        System.out.println("El arma no tiene municiones.");
    }

}
