/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elearning03
 */
public class Flujo {
     public static void main(String[] args)
    {
        int nota = 8;
        int edad = 3;
        int nro = 3;
        boolean paso = true;
    if(edad > 5 && edad <= 11)
    {
            System.out.println("Es niño");
    }
    else if (edad > 11 && edad <= 18)
    {
        System.out.println("Es adolecente");
    }
    else if (edad > 18 && edad <= 60)
    {
        System.out.println("Es adulto");
    }
    else
    {
        System.out.println("Es niñito");
    }
    
     if(paso)
    {
            System.out.println("Contratado");
    }
     //validar numero par o impar
      if((nro % 2)==0)//si el resto es cero es par
    {
            System.out.println("Es par");
    }
      else //sino es impar
      {
          System.out.println("Es impar");
      }
      //nota de un alumno
   
      if(nota >= 7)
      {
          System.out.println("Paso de grado");
       }
      else
      {
          System.out.println("Reprobo");
          if(nota >= 6)
          {
              System.out.println("Puede ir a recuperatorio");
          }
      }
    }
}
