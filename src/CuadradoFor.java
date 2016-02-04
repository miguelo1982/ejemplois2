/*
 * Algoritmo que construye un cuadrado con Asteriscos
 * Un cuadrado estara compuesto con 5 lineas
 */

/**
 *
 * @author elearning03
 */
public class CuadradoFor {
     public static void main(String[] args)
    {
        int tamanho = 8;
        for(int i=0; i<tamanho; i++)//imprime hasta 2 porque al valer 3 salio del ciclo
        {
            for(int x = 0; x < tamanho; x++)
            {
            System.out.print("* ");//imprime caracteres en la misma linea
        }
            System.out.println();//hacemos un quiebre de linea
        }
    }
}
