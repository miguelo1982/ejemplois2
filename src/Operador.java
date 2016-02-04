
import java.util.Scanner;


/**
 *
 * @author Miguel
 */
public class Operador {
     public static void main(String[] args)
    {
        //2+2 operador binario
        //-2 operador unario
        //true ? "si" : "no";operador ternario
        //Uso de operdores
        int x = 2+4;
        System.out.println(x);
        //podriamos usar el operador + para concatenar String
        String y = "4" +"5";
        System.out.println(y);
        double j = 7 - 2 + 3*5;
        System.out.println(j);
        double j1 = (7 - 2 + 3)*5;
        System.out.println(j1);
        //operador resto
        double x1 = 4 % 2;
        //operadores que declara que un nro sea positivo o negativo, son operadores unarios
          double x2 = -3;//indica la existencia de un nro negativo, si es + indica positivo
          double x3 = -(+3);//menos
          double x4 = -(-4);// mas
          //operador de incremento
          int x5 = 3;
          //int y2 = ++x5;// pre incremento
          int y2 = x5++;// post incremento, primero agrega el valor y despues efectua el incremento
          System.out.println(x5);
          System.out.println(y2);
          //decremento
          int z = 6;
          int zy = z--;//pre decremento
          int yz = ++z;//post decremento
          
  /*Operadoresde Comparacion*/
          int c = 6;
          //si uno intenta comparar un string con un int da un error
          System.out.println(c == 7);//vamos a imprimir este resultado para comparar
          System.out.println(c != 7);//Verifica si un valor es diferente de otro
          System.out.println(c > 7);
          System.out.println(c < 7);
          System.out.println(c >= 7);
          System.out.println(c <= 7);
          //Operador Instanceof
          Integer X = 6;
          System.out.println("cc" instanceof String);
          System.out.println(X instanceof Integer);
    /*Operadores de atribucion*/
            /* P = 7;
            P = P + 3;*/
//Ahora para simplificar eso podriamos
          int P = 7;
          P+= 3;
          P-= 2;//
          P*= 5;
          P /= 1;
          P %= 2;
 /*Operadores ternarios*/
    int edad = 5;// si edad es mayor o igual a 18 es mayor de edad, sino es menor, entonces podemos atribuir este resultado a una variable
    String e = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
    System.out.println(e);
    
   /*Operador de sepáración de expresiones*/
    String sex = "M" , pais = "Paraguay";
    //calculo de circunferencia y area de circulo
    //diametro = 2r
    Scanner s1 = new Scanner(System.in);
    System.out.println("Introduzca el valor del radio");
    double radio = s1.nextDouble();
   
    double diametro = 2 * radio;
    System.out.println("Diametro "+diametro);
    //circunferencia : 2Pi*r
    double pi = Math.PI;
    double cia = 2 * pi * radio;
    System.out.println("Circunferencia "+cia);
    //area del circulo : Pi*r2
    double area = pi*(radio*radio);
    System.out.println("Area "+area);
    }
    
}
