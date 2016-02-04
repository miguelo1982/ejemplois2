/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel R
 */
public class matriz {
    public static void main(String[] args)
    {
        String[][] dos= {
            {"Miguel","M","PY"},
            {"Alma","F","Ar"}};
        System.out.println(dos[1][0]);
        //cuantos elementos tenemos en la dimension del array
        System.out.println(dos.length);
        //Cuantos elementos tengo dentro del array interno
       System.out.println(dos[0].length);
       //como hacemos para modificar el valor de un array
       dos[1][0] = "Alma Maria";//el uno mendica la posicion dentro del array y el 0 la posición dentro del array interno
       System.out.println(dos[1][0]);
    }
}
