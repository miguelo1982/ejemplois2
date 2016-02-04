
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * .
 */

/**
 *
 * @author elearning03
 */
public class WhileProductos {
    public static void main(String[] args)
    {
     ArrayList<String> productos = new ArrayList<String>();
     Scanner s = new Scanner(System.in);
     System.out.println("Liste los productos : para salir escriba FIN");
    String producto;
   // producto = s.nextLine();//aca solo puede ser leido una sola vez
    while( !"FIN".equals(producto =s.nextLine()))//dentro de producto comparo si es igual a FIN, luego agrego en el ciclo para que pueda ser leido varias veces
    {
        productos.add(producto);
    }
    System.out.println(productos.toString());
    }
}
