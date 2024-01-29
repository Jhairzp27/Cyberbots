/**
 *  @author: Isaac Proaño
 *  @date: 27 - 01 - 2023
 *  @version: 1.0
 */
public class IPExoBot {
    
    private CPPiernaIzquierda cpPiernaIzquierda;
    private CPPiernaDerecha cpPiernaDerecha;

    public void cpConectarPiernas(CPPiernaIzquierda cpPiernaIzq, CPPiernaDerecha cpPiernaDer){
        cpPiernaIzquierda = cpPiernaIzq;
        cpPiernaDerecha = cpPiernaDer;
    }

    public void cpCorrer(){
        if(cpPiernaIzquierda.cpVerificarConexion() && cpPiernaDerecha.cpVerificarConexion())
            System.out.println("ExoBot corriendo a: " + cpPiernaIzquierda.getCpVelocidadMaxima());
        else
            System.out.println("< Error! > [ No se puede correr ya que una o ambas extremidades inferiores fueron desacopladas ]");
    }

    public void cpSaltar(){
        if(cpPiernaIzquierda.cpVerificarConexion() && cpPiernaDerecha.cpVerificarConexion())
            System.out.println("ExoBot saltando " + cpPiernaIzquierda.getCpSaltoMaximo());
        else
            System.out.println("< Error! > [ No se puede saltar ya que una o ambas extremidades inferiores fueron desacopladas ]");
    }
    
    public void cpSacrificarPiernaIzquierda(){
        cpPiernaIzquierda.cpSacrificar();
        System.out.println("La pierna " + cpPiernaIzquierda.getCpLado() + "Ha sido descoplada con exito");
    }

    public void cpSacrificarPiernaDerecha(){
        cpPiernaDerecha.cpSacrificar();
        System.out.println("La pierna " + cpPiernaDerecha.getCpLado() + "Ha sido desacoplada con exito!");
    }
    
}
