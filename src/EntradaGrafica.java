
import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class EntradaGrafica {
    public static void main(String[] args)
    {
    String nombre = JOptionPane.showInputDialog("Cual es su nombre");
   // System.out.println("nombre");
    JOptionPane.showMessageDialog(null, nombre);
    }
}
