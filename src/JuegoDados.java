
import java.util.Random;
import java.util.Scanner;

/*
 * Juego de dados: 
 */

/**
 *
 * @author elearning03
 */
public class JuegoDados {
     public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //el palpite en nuestro caso sera un entero
        System.out.println("Cual es su palpite");
       int palpite = s.nextInt();//con el palite en mano nosotros podemos lanzar nuestro dado
    //para descubrir un nro aleantorio vamos a usar la clase randon
       Random n = new Random();
       //vamos a descubrir cual es el valor del dado
       int dado = n.nextInt(6)+1;//sumamos el 1 porque solo va hasta 5 o sea de 0 a 5, como cero no tiene el dado dara 1
         System.out.println("Su Palpite "+ palpite);
         System.out.println("Dado lanzado " + dado);
       if(palpite == dado)
    {
        System.out.println("Acerto");
    }
    else
    {
        System.out.println("No acerto");
    }
    }
     
    }
