public class SSExpertoEspanol extends SSExperto {

    private final String ssNombreExpertoEspanol;

    // Constructor por defecto
    public SSExpertoEspanol() {
        this.ssNombreExpertoEspanol = "Sebastian";
    }

    public String getSsNombreExpertoEspanol() {
        return ssNombreExpertoEspanol;
    }

    public void ssEnsenarIdioma(SSIAlumnoEspanol ssAlumnoEspanol) {
        System.out.println(ssAlumnoEspanol.ssAprenderIdiomaEspanol() + " de el maestro " + getSsNombreExpertoEspanol());
    }

}
