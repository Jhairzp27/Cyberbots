public class APBrazo {

    private String apBrazo;
    private String apArma;
    public APBrazo(String apBrazo, String apArma) {
        this.apBrazo = apBrazo;
        // Verificar si el valor de apArma es válido antes de asignarlo
        if (apBrazo.equals("Izquierdo")) {
            if (apArma.equals("Metralladora") || apArma.equals("Bazuca")) {
                this.apArma = apArma;
            } else {
                throw new IllegalArgumentException("En el brazo izquierdo solo se puede equipar 'Metralladora' o 'Bazuca'");
            }
        }
        if (apBrazo.equals("Derecho")) {
            if (apArma.equals("Arma laser") || apArma.equals("Lanza fuego")) {
                this.apArma = apArma;
            } else {
                throw new IllegalArgumentException("En el brazo izquierdo solo se puede equipar 'Metralladora' o 'Bazuca'");
            }
        }
    }

    public void APIncorporarArma(){
        System.out.println("Incorporando" + apArma + "al brazo" + apBrazo);
    }
}
