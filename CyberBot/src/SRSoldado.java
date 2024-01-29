import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *  @author: Sebastián Ramos
 *  @date: 29 - 01 - 2023
 *  @version: 1.0
 */
public class SRSoldado extends GZPersona {
    private IPExoBot exobot; 
    public SRSoldado(IPExoBot exoBot){
        this.exobot= exoBot;
    }
    public void srOperarExobot(){
        if(exobot.srVerificarConexion()){
            System.out.println("El ExoBot está listo para ser usado");
        }else{
            System.out.println("< Error! > [ No se puede operar el ExoBot ya que no está conectado correctamente ]");
        }
    }
    public void srDispararArmas(){
       Scanner scanner = new Scanner(System.in);
       while(true){
       try{
        System.out.println("Seleccione el brazo para disparar ('Derecho' o 'Izquierdo'): ");
        String seleccionBrazo = scanner.nextLine();

        if ("Derecho".equalsIgnoreCase(seleccionBrazo)) {
            exobot.srDispararArmaDerecho();
            break;
        } else if ("Izquierdo".equalsIgnoreCase(seleccionBrazo)) {
            exobot.srDispararArmaIzq();
            break;
        } else {
            System.out.println("< Error! > [ Selección de brazo no válida ]");
        }
    }catch(InputMismatchException e){
        System.out.println("< Error! > [ Debes ingresar una opción válida) ]");
        scanner.nextLine();
        }
    }
 }
    public void srRecargarReemplazarFuentePoder(){
        if (exobot != null && exobot.srGetFuenteDePoder() != null) {
            System.out.println("Recargando o reemplazando la fuente de poder del ExoBot");
        } else {
            System.out.println("< Error! > [ El ExoBot no tiene una fuente de poder incorporada ]");
        }
    }
}
