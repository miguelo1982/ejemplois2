
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elearning03
 */
public class arrayList {
    public static void main(String[] args)
    {
        ArrayList<String> color = new ArrayList<>();
        color.add("Rojo");//esto seria equivalente a color[0] ="Rojo";
        color.add("Azul");
        color.add("Amarillo");
        //definir la posicion de un elemento
        color.add(0,"Marron");//asigno directamente en la primera posicion pero rojo pasa a la segunda posicion
        //ahora queremos saber cuantos elementos tiene el array
        System.out.println("El tamaño es "+color.size());
        //como podemos recuperar un elemento del array? Aqui tenemos otro metodos que es el get() al que le tenemos que pasar como parametro la posicion del indice
        System.out.println("Elemento indice 2 "+color.get(2));
        //como podemos hacer una busqueda para saber cual es el indice de un elemento?, eso lo conseguimos con el metodo indexOf
         System.out.println("El indice de Azul es "+color.indexOf("Azul"));
        System.out.println(color.toString());//toString retorna una representación en texto de los valores del arraylist
    //como podemos hacer eliminar un elemento del array, por ejemplo para eliminar el amarillo
        color.remove("Amarillo");
        //otra caracteristica interesante es que uno puede verificar si un elemento existe dentro de un arrayList
        //sera que dentro de color yo tengo Lila
        System.out.println("Tiene Lila "+color.contains("Lila"));//retorna un true o false
    }
    
}
