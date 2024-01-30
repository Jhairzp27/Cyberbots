import java.util.Hashtable;
import java.util.Scanner;
/**
 * @author: Isaac Proaño
 * @date: 27 - 01 - 2023
 * @version: 2.0
 */
public class IPExoBot extends PJIABot {
    private boolean srConectado;
    private APBrazoDer APBrazoDer;
    private APBrazoIzq APBrazoIzq;
    private CPPiernaIzquierda cpPiernaIzquierda;
    private CPPiernaDerecha cpPiernaDerecha;
    private RRFuenteDePoder cpFuenteDePoder;
    
    public IPExoBot() {
        cpFuenteDePoder = new RRFuenteDePoder();
    }

    public void cpActivarFuentePoder() {
        cpFuenteDePoder.setRrActiva(true);
        System.out.println(IPColors.ORANGE_BACKGROUND + IPColors.BLACK+ "\t"+ "Fuente de poder activada." + IPColors.RESET);
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


    public void cpDesactivarFuentePoder() {
        cpFuenteDePoder.setRrActiva(false);
        System.out.println("Fuente de poder desactivada.");
    }

    public void cpCargarEnergia(int rrCantidad) {
        if (cpFuenteDePoder.isRrActiva()) {
            cpFuenteDePoder.setRrNivelEnergia(rrCantidad);
            System.out.println("Energía cargada. Nivel actual: " + cpFuenteDePoder.getRrNivelEnergia());
        } else {
            System.out.println("No se puede cargar energía. La fuente de poder está desactivada.");
        }
    }

    public void cpConsumirEnergia(int rrCantidad) {
        if (cpFuenteDePoder.isRrActiva() && cpFuenteDePoder.getRrNivelEnergia() >= rrCantidad) {
            cpFuenteDePoder.setRrNivelEnergia(rrCantidad);
            System.out.println("Energía consumida. Nivel actual: " + cpFuenteDePoder.getRrNivelEnergia());
        } else {
            System.out.println("No hay suficiente energía o la fuente de poder está desactivada.");
        }
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
    
    public void IPConectarPiernas(CPPiernaIzquierda cpPiernaIzq, CPPiernaDerecha cpPiernaDer) {
        cpPiernaIzquierda = cpPiernaIzq;
        cpPiernaDerecha = cpPiernaDer;
    }

    public void IPCorrer() {
        if (cpPiernaIzquierda.cpVerificarConexion() && cpPiernaDerecha.cpVerificarConexion())
            System.out.println("ExoBot corriendo a: " + cpPiernaIzquierda.getCpVelocidadMaxima());
        else
            System.out.println("< Error! > [ No se puede correr ya que una o ambas extremidades inferiores fueron desacopladas ]");
    }

    public void IPSaltar() {
        if (cpPiernaIzquierda.cpVerificarConexion() && cpPiernaDerecha.cpVerificarConexion())
            System.out.println("ExoBot saltando " + cpPiernaIzquierda.getCpSaltoMaximo());
        else
            System.out.println("< Error! > [ No se puede saltar ya que una o ambas extremidades inferiores fueron desacopladas ]");
    }

    public void IPSacrificarPiernaIzquierda() {
        cpPiernaIzquierda.cpSacrificar();
        System.out.println("La pierna " + cpPiernaIzquierda.getCpLado() + " ha sido descoplada con exito");
    }

    public void IPSacrificarPiernaDerecha() {
        cpPiernaDerecha.cpSacrificar();
        System.out.println("La pierna " + cpPiernaDerecha.getCpLado() + " ha sido desacoplada con exito!");
    }

    Hashtable<Integer, String> ssListaAprendizajes = new Hashtable<>();

    /*
     * Aprender ingles
     */
    public String ssAprenderIdiomaIngles() {
        ssListaAprendizajes.put(1, " Ingles");
        return "Aprendiendo Ingles";
    }
    /*
    * Aprender espanol
     */
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

    public void pjAsignarArma() {
        super.pjAsignarArma();
    }
}
