/*
 * Ejemplo de variable de referencia, memoria y garbage colector.
 */

/**
 *
 * @author miguel Recalde
 */
public class variableReferencia {
       public static void main(String[] args)
{
    int x = 2;// Variable primitiva
    x = 5;// en este punto la VM cambia el 2 por 5
    //variable de referencia
    String y = "FPUNA";
    y = "pol.una.py";//el garbage colector se encarga de limpiar de memoria esa variable de referencia
    y = null;//
    //ejemplo de modificador final o constantes en java
    final double pi = 3.14;
    final char SEXO_MASCULINO = 'M';// la forma de nombrar una varible es diferente de una constante
    final char SEXO_FEMENINO = 'F';// las contantes la regla es escribir todo en mayúsculas, si es compuesto separar con _
    System.out.println(pi);
}
}
