
public class GZMecatronico extends GZPersona {

    void crearExobot(IPExoBot exoBot) {
        System.out.println("\t"+IPColors.CYAN_BACKGROUND +exoBot.getPjCodigoActivacion()+ IPColors.RESET);
        System.out.println("\t"+IPColors.CYAN_BACKGROUND +exoBot.getPjSerieExoBot() + IPColors.RESET + "\n");
        System.out.println("\t"+IPColors.ORANGE_BACKGROUND+"Creando exobot..." + IPColors.RESET);
    }

    void personalizarExobot() {System.out.println("\t"+IPColors.ORANGE_BACKGROUND+"Personalizando exobot..."+IPColors.RESET + "\n");}
}