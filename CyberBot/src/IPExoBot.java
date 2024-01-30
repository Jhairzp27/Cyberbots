import java.util.Hashtable;
import java.util.Scanner;

/**
 * @author: Isaac Proaño
 * @date: 27 - 01 - 2023
 * @version: 1.0
 */
public class IPExoBot extends pjIABot implements SSIAlumnoEspanol, SSIAlumnoIngles {

    private CPPiernaIzquierda cpPiernaIzquierda;
    private CPPiernaDerecha cpPiernaDerecha;
    private boolean srConectado;
    private APBrazoDer APBrazoDer;
    private APBrazoIzq APBrazoIzq;
    private SRFuenteDePoder fuenteDePoder;

    public void cpConectarPiernas(CPPiernaIzquierda cpPiernaIzq, CPPiernaDerecha cpPiernaDer) {
        cpPiernaIzquierda = cpPiernaIzq;
        cpPiernaDerecha = cpPiernaDer;
    }

    public void cpCorrer() {
        if (cpPiernaIzquierda.cpVerificarConexion() && cpPiernaDerecha.cpVerificarConexion())
            System.out.println("ExoBot corriendo a: " + cpPiernaIzquierda.getCpVelocidadMaxima());
        else
            System.out.println(
                    "< Error! > [ No se puede correr ya que una o ambas extremidades inferiores fueron desacopladas ]");
    }

    public void cpSaltar() {
        if (cpPiernaIzquierda.cpVerificarConexion() && cpPiernaDerecha.cpVerificarConexion())
            System.out.println("ExoBot saltando " + cpPiernaIzquierda.getCpSaltoMaximo());
        else
            System.out.println(
                    "< Error! > [ No se puede saltar ya que una o ambas extremidades inferiores fueron desacopladas ]");
    }

    public void cpSacrificarPiernaIzquierda() {
        cpPiernaIzquierda.cpSacrificar();
        System.out.println("La pierna " + cpPiernaIzquierda.getCpLado() + "Ha sido descoplada con exito");
    }

    public void cpSacrificarPiernaDerecha() {
        cpPiernaDerecha.cpSacrificar();
        System.out.println("La pierna " + cpPiernaDerecha.getCpLado() + "Ha sido desacoplada con exito!");
    }

    public boolean srVerificarConexion() {
        return srConectado = true;
    }

    public void srDispararArmaDerecho() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Seleccione el arma a disparar: ");
                String srArma = scanner.nextLine();
                APBrazoDer = new APBrazoDer("Derecho", srArma);
                APBrazoDer.APIncorporarArma();
                System.out.println("Disparando el arma " + srArma);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error! Seleccione un arma válido");
            } catch (Exception e) {
                System.out.println("Error general: " + e.getMessage());
            }
        }
    }

    public void srDispararArmaIzq() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Seleccione el arma a disparar: ");
                String srArma = scanner.nextLine();
                APBrazoIzq = new APBrazoIzq("Izquierdo", srArma);
                APBrazoIzq.APIncorporarArma();
                System.out.println("Disparando el arma " + srArma);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error! Seleccione un arma válida");
            } catch (Exception e) {
                System.out.println("Error general: " + e.getMessage());
            }
        }
    }

    public SRFuenteDePoder srGetFuenteDePoder() {
        return fuenteDePoder;
    }

    public void srIncorporarFuenteDePoder(SRFuenteDePoder fuenteDePoder) {
        this.fuenteDePoder = fuenteDePoder;
    }

    @Override
    public void pjAsignarArmaBrazoIzquierdo() {
        String pjArmaBrz = "";
        String pjBrazo = "Izquierdo";
        System.out.println("\n\t¿Qué arma desea utilizar en el brazo izquierdo?");
        System.out.println("\n1. Metralladora (MK61)");
        System.out.println("2. Bazuca antitanque\n");
        int pjOpcion = pjValidarEntradaNumerica(1, 2);
        switch (pjOpcion) {
            case 1:
                pjArmaBrz = "Metralladora";
                APBrazoIzq = new APBrazoIzq(pjBrazo, pjArmaBrz);    
                System.out.println();
                APBrazoIzq.APIncorporarArma();
                break;
            case 2:
                pjArmaBrz = "Bazuca";
                APBrazoIzq = new APBrazoIzq(pjBrazo, pjArmaBrz);
                System.out.println();
                APBrazoIzq.APIncorporarArma();
                break;
        }
    }

    @Override
    public void pjAsignarArmaBrazoDerecho() {
        String pjArmaBrz = "";
        String pjBrazo = "Derecho";
        System.out.println("\n\t¿Qué arma desea utilizar en el brazo derecho?");
        System.out.println("\n1. Arma Laser");
        System.out.println("2. Lanza Fuego\n");
        int pjOpcion = pjValidarEntradaNumerica(1, 2);
        switch (pjOpcion) {
            case 1:
                pjArmaBrz = "Arma laser";
                APBrazoDer = new APBrazoDer(pjBrazo, pjArmaBrz);
                System.out.println();
                APBrazoDer.APIncorporarArma();
                break;
            case 2:
                pjArmaBrz = "Lanza fuego";
                APBrazoDer = new APBrazoDer(pjBrazo, pjArmaBrz);
                System.out.println();
                APBrazoDer.APIncorporarArma();
                break;
        }
    }

    Hashtable<Integer, String> ssListaAprendizajes = new Hashtable<>();

    /*
     * Aprender ingles
     */
    @Override
    public String ssAprenderIdiomaIngles() {
        ssListaAprendizajes.put(1, " Ingles");
        return "Aprendiendo Ingles";
    }
    /*
     * Aprender espanol
     */

    @Override
    public String ssAprenderIdiomaEspanol() {
        ssListaAprendizajes.put(2, " Espanol");
        return "Aprendiendo Espanol";
    }
    /*
     * Mostrar los idiomas aprendidos
     */

    public void ssMostrarIdiomasAprendidos() {
        System.out.println("IAbot ha logrado aprender:");
        ssListaAprendizajes.forEach((k, v) -> {
            System.out.print(v + " , ");
        });
        System.out.println();
    }
}
