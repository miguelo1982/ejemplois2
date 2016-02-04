
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Entrada {
    public static void main(String[] args)
{
    //aqui la recuperación de los datos fue hecha mediante la recuperación de una llamada al programa
    //System.out.println(args[0]);// aqui nosotros podemos imprimir el valor que va a ser enviado por el usuario en el momento de la ejecución del programa
//Interactuando con el usuario
    Scanner s = new Scanner(System.in);
    System.out.println("Cual es su nombre");
    String nombre = s.nextLine();
    System.out.println("Bienvenido "+ nombre);

}
    
}
