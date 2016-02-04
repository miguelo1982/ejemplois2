
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elearning03
 */
public class ArraySimple {
    public static void main(String[] args)
    {
        //Otra manera de inicializar array - ejemplo de array de nros impares
        int[] impares = new int[5]; //La inicializacion simpre requiere el nro de posiciones en nuestro array, por eso inicilizamos con 5 
        //Ahora para cada uno de estas posiciones colocaremos un valor
        impares[0]=1;//array tipos primitivos
        impares[1]=3;
        impares[2]=5;
        impares[3]=7;
        impares[4]=9;//otra forma de inicializar
      
        
    String[] paises ={"Paraguay","Argentina","Brasil"};//array de objetos
    System.out.println(paises[0]);
    //modificar un valor en una posicion
    paises[0] = "PARAGUAY";
     System.out.println(paises[0]);
     //como saber cuantas posiciones tiene nuestro array
     System.out.println(paises.length);
     //Clase que se usa para manipular array -- java.util.Arrays
     System.out.println(Arrays.toString(paises));//el metodo to String recibe un parametroque en este caso sera el array que queremos representar
     //Busqueda dentro del array, por ejemplo si quiero saber si dentro de array existe el pais Paraguay
     int posicion = Arrays.binarySearch(paises,"Argentina");//le paso que elemento necesito buscar y en que array, le paso dos parametros
     System.out.println(posicion);
     //Ejemplo de Ordenación, nosotros podemos ordenar el array con el metodos sort
     Arrays.sort(paises, 0, paises.length);//le pasamos el nombre del array y desde que posición queremos que nos ordene, hasta que posicion, en este caso hasta la ultima posicion
    //Despues de ordenar el array lo tenemos que presentar nuevamente
     System.out.println(Arrays.toString(paises));
     //Objetos dentro de un array
     Double[] valores ={12.3,14.25,18.01};
     //Quiero tomar el primer valor y accesar un metodo del objeto
     System.out.println(valores[0].doubleValue());
    }
}
