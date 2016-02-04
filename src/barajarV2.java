
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel R
 */
public class barajarV2 {
    public static void main(String[] args)
    {
        //las fases de nuestras cartas
        String[] faces= {"A","2","3","4","5","6","7","8","9","Velet","Dama","Rey"};
          //Naipes de las cartas
        String[] naipes = {"Espadas","Palos", "Copas", "Oros"};
           Random r = new Random();
           String face = faces[r.nextInt(faces.length)];    
           String naipe = naipes[r.nextInt(naipes.length)];
           String carta = "\n"+face +" de "+naipe;
           System.out.println(carta);
    }
}
