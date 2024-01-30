import java.util.Scanner;

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

        private void IPpresentarLoading(String mensaje) {
                IPmostrarLoading(mensaje);
                // Esperar a que el usuario presione Enter para continuar
        }

        private void IPmostrarLoading(String texto) {
                String carga[] = { "0oo", "o0o", "oo0", "o0o" };
                for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
                        String c = carga[porcentaje % 4];
                        System.out.print("\r" + texto + "... " + porcentaje + "% " + c);

                        try {
                                Thread.sleep(30);
                        } catch (InterruptedException ie) {
                        }
                }
        }

        public void ipCrear() throws Exception {
                Scanner Scanner = new Scanner(System.in);

                System.out.println(color.RED + "\n\n\t\t\t ------- WITHERUN --------- \n\n" + color.RESET + color.GREEN
                                + ipUbicacion + color.RESET);
                gzEsperarTecla(Scanner);
                gzLimpiarConsola();

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
                gzEsperarTecla(Scanner);
                gzLimpiarConsola();
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
                gzEsperarTecla(Scanner);
                gzLimpiarConsola();

                // Metodos de ExoBot - Isaac Proaño
                IPpresentarLoading("Creando piernas");
                System.out.println(" ");
                exoBot.IPConectarPiernas(new CPPiernaIzquierda(), new CPPiernaDerecha());
                exoBot.IPCorrer();
                exoBot.IPSaltar();
                exoBot.IPSacrificarPiernaIzquierda();
                exoBot.IPSacrificarPiernaDerecha();
                gzEsperarTecla(Scanner);
                gzLimpiarConsola();

                // Metodos de brazos - armas
                IPpresentarLoading("Creando brazos");
                System.out.println(" ");
                exoBot.pjAsignarArma();
                exoBot.srDispararArmaDerecho();
                gzEsperarTecla(Scanner);
                gzLimpiarConsola();

                // Metodos de fuente de poder
                exoBot.cpCargarEnergia(100);
                exoBot.cpConsumirEnergia(50);
                exoBot.cpDesactivarFuentePoder();
        }

        /**
         * Este metodo limpia la consola luego de utilizar el scanner
         * @author Jhair Zambrano
         * @throws Exception
         */
        private static void gzLimpiarConsola() throws Exception {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        
        /**
         * Este metodo espera a que escribas para luego darle instrucciones
         * @author Jhair Zambrano
         * @param sc
         */
        private static void gzEsperarTecla(Scanner sc) {
                System.out.print(IPColors.CYAN+"\nPresione cualquier tecla para continuar..." + IPColors.RESET);
                sc.nextLine();
        }

}
