
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel R
 */
public class barajar {
    public static void main(String[] args)
    {
        //las fases de nuestras cartas
        String[] faces= {"A","2","3","4","5","6","7","8","9","Velet","Dama","Rey"};
          //Naipes de las cartas
        String[] naipes = {"Espadas","Palos", "Copas", "Oros"};
        //Como podemos seleccionar una carta, ahora queremos elegir aleatorimente una fase y una carta
          // String carta = faces[0] +" " +naipes[0];//el problema es que nosotros apuntamos directamente al indice de array y no es eso lo que queremos, lo que queremos es que el programa escoja una carta al azar, un naipe, una fase y luego juntar esos dos
           //para eso tenemos un utilitario que permite elegir de forma aleatoria llamada Random pero esta clase no esta dentro dentro de paquete
           Random r = new Random();
           int indiceFase = r.nextInt(faces.length);
            String face = faces[indiceFase];
           
            int indiceNaipes = r.nextInt(naipes.length);
            String naipe = naipes[indiceNaipes];
            String carta = "\n"+face +" de "+naipe;
           
           //System.out.println( r.nextInt(10));//podemos pasarle como parametro el nro maximo y con este recurso nosotros podemos pasarle aleatoriamente una fase y un naipe
       System.out.println(carta);
    }
}
