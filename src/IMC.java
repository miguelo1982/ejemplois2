
import javax.swing.JOptionPane;

/*
 * Clase responsable de calcular el IMC
 * IMC = .Peso en Kg / Altura en metros * altura en metros
 */

/**
 *
 * @author elearning03
 */
public class IMC {
       public static void main(String[] args)
    {
        //double pesoKg = 95;
       // double altura = 1.76;
        
        //Utilización de interfaz grafica
        String peso = JOptionPane.showInputDialog("Cual es su peso en KG");
        double pesoKg = Double.parseDouble(peso);//convierte este String en un tipo primitivo Double
        String altura = JOptionPane.showInputDialog("Cual es su altura em Mts");
        double alturaM = Double.parseDouble(altura);//convierte este String en un tipo primitivo Double
        //presentar el mensaje utilizando JOptionPane
        double imc = pesoKg /(alturaM * alturaM);
        //System.out.println("IMC = "+ imc);
        //utilizar operador ternario, validacion? valor : valor, verificar si imc esta entre peso ideal
        String msg = (imc >= 20 && imc <= 25 )? "Peso ideal" : "Fuera de peso ideal";
        msg = "IMC = "+ imc + "\n"+ msg;
        JOptionPane.showMessageDialog(null, msg);
    }
}
