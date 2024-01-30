import java.util.Scanner;

public class Witherun {
        
        IPExoBot exoBot = new IPExoBot();
        IPColors color = new IPColors();
        SRSoldado soldado = new SRSoldado(exoBot, "Jhair Zambrano", "25", "1.90m", "MMA, Manejo de armas, Piloto, Guapo");
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
                System.out.println( color.BLUE+"----- Datos del soldado seleccionado -------" + color.RESET);
                System.out.println(color.ORANGE + "Nombre: " + color.RESET + soldado.getNombre());
                System.out.println(color.ORANGE + "Edad: " + color.RESET + soldado.getEdad());
                System.out.println(color.ORANGE + "Estatura: " + color.RESET + soldado.getEstatura());
                System.out.println(color.ORANGE + "Habilidades: " + color.RESET + soldado.getHabilidades());

                gzEsperarTecla(Scanner);
                gzLimpiarConsola();

                IPmostrarLoading("Creando exoBot correspondiente para el soldado");
                System.out.println("");
                
                // Instancias
                GZMecatronico mecatronico = new GZMecatronico();
                IPExoBot oExoBot = new IPExoBot();
                SSExpertoEspanol oSsExpertoEspanol = new SSExpertoEspanol();
                SSExpertoIngles oSsExpertoIngles = new SSExpertoIngles();
                
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
                Scanner scanner = new Scanner(System.in);

                System.out.println("¿Quieres sacrificar ambas piernas para volar con el exobot? (si/no)");
                
                // Obtener respuesta
                String respuesta = scanner.nextLine().toLowerCase();
                
                // Validar la respuesta
                while (!respuesta.equals("si") && !respuesta.equals("no")) {
                        System.out.println("Respuesta no válida. Por favor, ingresa 'si' o 'no'.");
                        respuesta = scanner.nextLine().toLowerCase();
                }

                // Procesar la respuesta
                if (respuesta.equals("si")) {
                        System.out.println("Sacrificando ambas piernas para volar con el exobot...");
                        exoBot.IPSacrificarPiernaIzquierda();
                        exoBot.IPSacrificarPiernaDerecha();
                        System.out.println("ExoBot volando...");
                } else {
                        System.out.println("Decidiste no sacrificar ambas piernas. Continuando...");
                }
                gzEsperarTecla(Scanner);
                gzLimpiarConsola();
                
                // Metodos de brazos - armas
                IPpresentarLoading("Creando brazos");
                System.out.println("");
                exoBot.srVerificarConexion();
                soldado.srOperarExobot();
                System.out.println(" ");
                exoBot.pjAsignarArma();
                exoBot.dispararArma();
                gzEsperarTecla(Scanner);
                gzLimpiarConsola();

                // Metodos de fuente de poder
                exoBot.cpCargarEnergia(100);
                exoBot.cpConsumirEnergia(50);
                exoBot.cpDesactivarFuentePoder();
                IPpresentarLoading("Supervisando carga de la fuente");
                System.out.println("");
                System.out.println("ExoBot listo para la batalla");
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
