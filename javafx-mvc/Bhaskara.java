
/**
 * Modela o cálculo de IMC
 * 
 * @author marceloakira 
 * @version 0.01
 */
public class Bhaskara
{
    double A;
    double B;
    double C;
    
    public Bhaskara() {
        this.A = 0;
        this.B = 0;
        this.C = 0;
    }
    
    /**
     * Construtor para objetos da classe
     */
    public Bhaskara(double A, double B, double C)
    {
        this.A = A;  
        this.B = B;
        this.C = C;
    }

    /**
     * Calcula Bhaskara
     * 
     * @return     o valor calculado pro Bhaskara, dado por: (-B +- sqrt(B*B-4*A*C)/)2*A
     */
    public String calcular()
    {
        double delta = B*B - 4*A*C;
        if (delta < 0) {
            return "Não existem raízes reais";
        } else{
            double x1 = (-B + Math.sqrt(delta)) / (2*A);
            double x2 = (-B - Math.sqrt(delta)) / (2*A);
            return Double.toString(x1) + " e " + Double.toString(x2);
        }
    }
}
