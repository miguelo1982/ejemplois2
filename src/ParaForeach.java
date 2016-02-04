
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elearning03
 */
public class ParaForeach {
     public static void main(String[] args)
    {
        int [] pares ={2,4,6,8,10};
        for(int i =0; i< pares.length;i++)
        {
            int par = pares[i];
            System.out.println(par);
        }
        //misma instruccion que la anterior solo que mas corta
        for(int par:pares)
        {
         System.out.println(par);
        }
        //otro ejemplo de utilizacion
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<15;i++)
        {
            list.add(i);//agregamos los nuemoros dentro del array
        }
        //ahora para representar esos numeros nosotros podemos usar un foreach
        for(Integer nro:list)
        {
            System.out.println(nro);
        }
    }
}
