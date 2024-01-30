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
        if (rrEstaEncendida() && rrTieneMuniciones()) {
            System.out.println("¡Ráfagas de la metralladora!");
        } else {
            System.out.println("No se puede disparar. Verifica que el arma esté encendida y con municiones.");
        }
    }
}
