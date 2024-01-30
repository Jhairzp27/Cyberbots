/**
 * @author: Sebastián Ramos
 * @date: 29 - 01 - 2023
 * @version: 1.0
 */
public class SRSoldado extends GZPersona {
    private IPExoBot exobot;
    private String nombre = "Jhair Zambrano";
    private String edad = "25";
    private String estatura = "1.90m";
    private String habilidades = "MMA, Manejo de armas, Piloto, Guapo";

    
    public SRSoldado(IPExoBot exoBot, String nombre, String edad, String estatura, String habilidades) {
        this.exobot = exoBot;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.habilidades = habilidades;
    }
    
    public void srOperarExobot() {
        if (exobot.srVerificarConexion()) {
            System.out.println("El ExoBot está listo para ser usado");
        } else {
            System.out.println("< Error! > [ No se puede operar el ExoBot ya que no está conectado correctamente ]");
        }
    }
    
    public void srDispararArmas() {
        
    }
    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public String getHabilidades() {
        return habilidades;
    }
    
}
