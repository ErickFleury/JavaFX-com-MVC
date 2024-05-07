import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class BhaskaraController
{
    BhaskaraView bhaskaraView;
    Stage stage;
    Bhaskara bhaskara;
    public TextField textFieldA;
    public TextField textFieldB;
    public TextField textFieldC;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe IMCController
     */
    public BhaskaraController()
    {
        this.stage = new Stage();
        this.bhaskaraView = new BhaskaraView();
        this.bhaskaraView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.bhaskaraView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double A = Double.parseDouble(textFieldA.getText());
            double B = Double.parseDouble(textFieldB.getText());
            double C = Double.parseDouble(textFieldC.getText());
            Bhaskara bhaskara = new Bhaskara(A, B, C);
            this.labelResultado.setText(bhaskara.calcular());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldA.setText("");
        textFieldB.setText("");
        textFieldC.setText("");
        labelResultado.setText("");
    }    
}
