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
       
        }
    }


