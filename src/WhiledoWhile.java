/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elearning03
 */
public class WhiledoWhile {
    public static void main(String[] args)
    {
        int i = 0;
        while (i<2)//si no se valida esta condicion el loop sera infinito
        {
            System.out.println(i);
            i++;
        }
        //esta expresion es igual a la siguiente expresion
        for (int i1=0; i1<2;i1++)
         {
             System.out.println(i1);
         }
        //otra forma es la siguiente estructura do while
        int ii = 3;
        
        do{
            System.out.println(ii);
            i++;
        } while(i<2);//por lo menos una vez se ejecutaria
    }
    
}
