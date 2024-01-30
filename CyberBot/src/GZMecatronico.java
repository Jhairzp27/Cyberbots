
public class GZMecatronico extends GZPersona {

    void crearExobot(IPExoBot exoBot) {
        System.out.println("\t"+IPColors.ORANGE_BACKGROUND+"Creando exobot..." + IPColors.RESET);
        System.out.println(exoBot.getPjCodigoActivacion());
        System.out.println(exoBot.getPjSerieExoBot());
    }

    void personalizarExobot() {System.out.println("\t"+IPColors.ORANGE_BACKGROUND+"Personalizando exobot..."+IPColors.RESET);}
}