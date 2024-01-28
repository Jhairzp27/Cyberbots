/**
 *  @author: Christian Pisco
 *  @date: 28 - 01 - 2024
 *  @version: 1.0
 */

public class CPPierna {
    private String cpLado;
    private String cpVelocidadMaxima;
    private String cpSaltoMaximo;
    private boolean cpConectada;
    
    public CPPierna(String cpLado) {
        this.cpLado = cpLado;
        this.cpVelocidadMaxima = "200 km/h"; // Valor predeterminado
        this.cpSaltoMaximo = "50 m";         // Valor predeterminado
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
        System.out.println("Pierna  " + cpLado + " ha sido sacrificada");
        cpConectada = false;
    }
}