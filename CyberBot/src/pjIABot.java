import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public abstract class pjIABot {
    static Scanner sc = new Scanner(System.in);
    String pjCodigoActivacion;
    String pjSerieExoBot;

    /* Constructor de la clase */
    public pjIABot() {
        this.pjCodigoActivacion = pjGenerarCodigoActivacion();
        this.pjSerieExoBot = pjAsignarSerie();
    }

    /*
     * Validar entrada de valores para evitar errores
     */
    public static int pjValidarEntradaNumerica(int rangoMinimo, int rangoMaximo) {
        int entrada = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(">> ");
                entrada = sc.nextInt();

                if (entrada >= rangoMinimo && entrada <= rangoMaximo) {
                    entradaValida = true;
                    sc.nextLine();
                } else {
                    System.out.println("No existe esa opción. Por favor, ingresa un número válido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada incorrecta. Por favor, ingresa un número válido.");
                sc.nextLine();
            }
        } while (!entradaValida);

        return entrada;
    }

    /*
     * Asignar arma al ExoBot
     */
    public void pjAsignarArma() {
        System.out.println("Seleccione el brazo para el que desea asignar un arma:");
        System.out.println("1. Brazo Izquierdo");
        System.out.println("2. Brazo Derecho");
        System.out.println("3. Ambos Brazos");
        int pjOpcionBrazo = pjValidarEntradaNumerica(1, 3);
        if (pjOpcionBrazo == 1) {
            pjAsignarArmaBrazoIzquierdo();
        } else if (pjOpcionBrazo == 2) {
            pjAsignarArmaBrazoDerecho();
        } else {
            pjAsignarArmaBrazoIzquierdo();
            pjAsignarArmaBrazoDerecho();
        }
    }

    public abstract void pjAsignarArmaBrazoIzquierdo();

    public abstract void pjAsignarArmaBrazoDerecho();

    /*
     * Generar código de activación aleatorio
     */
    public String pjGenerarCodigoActivacion() {
        Random random = new Random();
        int pjCodigoGenerado = 1000 + random.nextInt(9000); // Genera números aleatorios entre 1000 a 9999
        return "Código de Activación: " + pjCodigoGenerado;
    }
    /*
     * Obtener código de Activación del ExoBot
     */
    public String getPjCodigoActivacion() {
        return pjCodigoActivacion;
    }

    /*
     * Asignar serie al ExoBot
     */
    public String pjAsignarSerie() {
        Random random = new Random();
        int pjSerieGenerada = 1000 + random.nextInt(9000); // Genera números aleatorios entre 1000 a 9999
        return "Serie del ExoBot: " + pjSerieGenerada;
    }

    /* Obtener la serie del ExoBot */
    public String getPjSerieExoBot() {
        return pjSerieExoBot;
    }

    /*
     * Supervisar la recarga del ExoBot
     */
    public void pjSupervisarRecarga() {
        System.out.println("Supervisando recarga del ExoBot");
    }
}
