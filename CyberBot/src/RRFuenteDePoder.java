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
    
    public int getRrNivelEnergia() {
        return rrNivelEnergia;
    }

    public void setRrNivelEnergia(int rrNivelEnergia) {
        this.rrNivelEnergia = rrNivelEnergia;
    }

    public boolean isRrActiva() {
        return rrActiva;
    }

    public void setRrActiva(boolean rrActiva) {
        this.rrActiva = rrActiva;
    }


    // Constructor
    public RRFuenteDePoder() {
        this.rrActiva = false;
        this.rrNivelEnergia = 0;
    }
    

}
