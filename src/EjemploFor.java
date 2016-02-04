/*
 * Algoritmo que imprime el valor de la variable dentro del for
 * 
 */

/**
 *
 * @author elearning03
 */
public class EjemploFor {
     public static void main(String[] args)
    {
        String texto = "";
        String texto1 = "";
         String texto2 = "";
    for(int i=0; i<3; i++)//imprime hasta 2 porque al valer 3 salio del ciclo
    {
        texto +=i +",";//esta variable i solo puede ser utilizada dentro del bloque for
       // System.out.println(texto);
        System.out.println(i);
    }
     System.out.println(texto);
   //ejemplo decrementar
     for(int i=10; i>0; i--)//imprime hasta 2 porque al valer 3 salio del ciclo
    {
        texto1 +=i +",";//esta variable i solo puede ser utilizada dentro del bloque for
       // System.out.println(texto);
        System.out.println(i);
    }
     System.out.println(texto1);
     //verificar si que nro es par
     for(int i=0; i<=20; i++)//imprime hasta 2 porque al valer 3 salio del ciclo
    {
         if(i%2 ==0)
             texto2 +=i +",";//esta variable i solo puede ser utilizada dentro del bloque for
       // System.out.println(texto);
        System.out.println(i);
    }
       System.out.println(texto2);
    }
}

