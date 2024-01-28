import java.util.Hashtable;

public class CodigoParaIABOT implements SSIAlumnoEspanol, SSIAlumnoIngles {
    Hashtable<Integer, String> ssListaAprendizajes = new Hashtable<>();

    @Override
    public String ssAprenderIdiomaIngles() {
        ssListaAprendizajes.put(1, "Idioma Ingles");
        return "Aprendiendo Ingles";
    }

    @Override
    public String ssAprenderIdiomaEspanol() {
        ssListaAprendizajes.put(2, "Idioma Espanol");
        return "Aprendiendo Espanol";
    }
}
