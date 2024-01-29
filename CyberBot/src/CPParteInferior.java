/**
 *  @author: Christian Pisco
 *  @date: 28 - 01 - 2024
 *  @version: 1.0
 */

public class CPParteInferior {
    private String cpVelocidadMaxima;
    private String cpSaltoMaximo;
    private boolean cpConectada;
    
    public CPParteInferior() {
        this.cpVelocidadMaxima = "200 km/h"; // Valor predeterminado
        this.cpSaltoMaximo = "50 metros";    // Valor predeterminado
        this.cpConectada = true;
    }
    
    public String getCpVelocidadMaxima() {
        return cpVelocidadMaxima;
    }

    public String getCpSaltoMaximo() {
        return cpSaltoMaximo;
    }

    public boolean cpVerificarConexion() {
        return cpConectada;
    }

    public void cpSacrificar() {
        this.cpConectada = false;
    }
}