public class Witherun {

    IPColors color = new IPColors();
    private String ipUbicacion = """
            La ciudad de Witherun es un lugar escondido entre montañas y bosques,
            con una historia arraigada en la explotación de valiosos depósitos minerales.
            En medio de una guerra global contra Ucrania, esta metrópolis se transforma
            en un punto clave para la creación de ExoBots, las avanzadas máquinas de combate.
            Conocida por sus talentosos ingenieros y soldados experimentados en metalurgia y combate,
            los cuales desempeñan un papel crucial en la creación y mejora constante de este nuevo tipo de máquinas.

            """;

    public void ipCrear() {

        System.out.println(color.RED + "\n\n\t\t\t ------- WITHERUN --------- \n\n" + color.RESET + color.GREEN
                + ipUbicacion + color.RESET);

        // Instancias
        GZMecatronico mecatronico = new GZMecatronico();
        IPExoBot oExoBot = new IPExoBot();
        SSExpertoEspanol oSsExpertoEspanol = new SSExpertoEspanol();
        SSExpertoIngles oSsExpertoIngles = new SSExpertoIngles();
        IPExoBot exoBot = new IPExoBot();

        // Creacion de exobot mediante el codigo de activacion
        mecatronico.crearExobot(oExoBot);
        mecatronico.personalizarExobot();
        exoBot.cpActivarFuentePoder();
        // SSExpertoEspanol ssExpertoEspanol= new SSExpertoEspanol();
        // SSExpertoIngles ssExpertoIngles= new SSExpertoIngles();
        System.out.println(
                "\u001B[34m"
                        + "Para un mejor desenvolvimiento en la batalla, el IAbot del exobot aprenderá los idiomas básicos");
        oSsExpertoEspanol.ssEnsenarIdioma(oExoBot);
        oSsExpertoIngles.ssEnsenarIdioma(oExoBot);
        oExoBot.ssAprenderIdiomaEspanol();
        oExoBot.ssAprenderIdiomaIngles();
        oExoBot.ssAprenderIdiomaIngles();
        oExoBot.ssMostrarIdiomasAprendidos();
        System.out.println("\u001B[0m");

        // Metodos de ExoBot - Isaac Proaño
        exoBot.IPConectarPiernas(new CPPiernaIzquierda(), new CPPiernaDerecha());
        exoBot.IPCorrer();
        exoBot.IPSaltar();
        exoBot.IPSacrificarPiernaIzquierda();
        exoBot.IPSacrificarPiernaDerecha();

        // Metodos de brazos - armas
        exoBot.pjAsignarArma();
        exoBot.srDispararArmaDerecho();

        // Metodos de fuente de poder
        exoBot.cpCargarEnergia(100);
        exoBot.cpConsumirEnergia(50);
        exoBot.cpDesactivarFuentePoder();
    }

}
