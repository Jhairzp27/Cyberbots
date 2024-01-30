public class SSExpertoIngles extends SSExperto {
    private final String ssNombreExpertoIngles;

    // Constructor por defecto
    public SSExpertoIngles() {
        this.ssNombreExpertoIngles = "Arthur";
    }

    public String getSsNombreExpertoIngles() {
        return ssNombreExpertoIngles;
    }

    public void ssEnsenarIdioma(IPExoBot ssAlumnoIngles) {
        System.out.println(ssAlumnoIngles.ssAprenderIdiomaIngles() + " de el maestro " + getSsNombreExpertoIngles());
    }
}
