/**
 * Copyright (C) 2024
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * @author: Ruth Rueda
 * @date: 29/01/2024
 * @version: 1.0
 */


public class RRMetralladora extends RRArma {
    @Override
    public void rrDisparar() {
        if (rrEncendida && rrConMuniciones) {
            System.out.println("¡Ráfagas de la metralladora!");
        } else {
            System.out.println("No se puede disparar. Verifica que el arma esté encendida y con municiones.");
        }
    }

    // Otros métodos específicos de la metralladora si es necesario
    public void rrActivarModoAutomatico() {
        System.out.println("Modo automático activado.");
        rrEncender();
    }

    public void rrDesactivarModoAutomatico() {
        System.out.println("Modo automático desactivado.");
        rrApagar();
    }
}
