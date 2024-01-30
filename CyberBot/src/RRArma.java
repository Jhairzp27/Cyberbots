/**
 * Copyright (C) 2024
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * @author: Ruth Rueda
 * @date: 29/01/2024
 * @version: 1.0
 */

 import java.util.ArrayList;

public abstract class RRArma {
    private ArrayList<String> rrListaArmas;

    // Constructor que inicializa la lista de armas
    public RRArma() {
        rrListaArmas = new ArrayList<>();
        rrAsignarArmas();
    }

    // Método para asignar un conjunto predeterminado de armas
    public void rrAsignarArmas() {
        rrListaArmas.add("Metralladora");
        rrListaArmas.add("Bazuca");
        rrListaArmas.add("Arma laser");
        rrListaArmas.add("Lanza fuego");
    }

    // Método para agregar armas directamente desde la clase
    public void rrAgregarArma(String arma) {
        rrListaArmas.add(arma);
    }

    // Método para obtener la lista de armas
    public ArrayList<String> rrGetListaArmas() {
        return rrListaArmas;
    }
}
