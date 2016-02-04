/** 
Presentar los conceptos de variables
@author  Miguel Recalde
*/

public class Variable {
    public static void main(String[] args)
{
	String nombre ="Miguel";//variable de tipo string
	int edad = 33;//variable de tipo numerico
	boolean casado = true;// variable de tipo logico
	System.out.println("Texto");
        //forma de represntar valores primitivos
        byte b = 127;//cie
        short s = 32767; //32 mil, si le agrego un noro mas dara error
        int i = 2000000000;//2 billones
        long l = 1000000000;
        double d = 1.797696565656548E+30;
        float f = 123F;
        
        byte bb = 0b01100110;//8 bits // 1 byte
        short ss = 0b0110011001100110;
        int ii = 0b01100110011001100110011001100110;
    System.out.println(bb);
    System.out.println(ss);
     i = s;//el valor shor lo pongo dentro de un entero, Cast implicito
     System.out.println(i);
     System.out.println(s);
     
    // i = l; // esto no se puede hacer da un error
     //la forma de hacer un cast explicito es anteponiendo cual es la conversion que se desea realizar
     i = (int)l;// esto no da un error pero uno sabe que esto puede traer problemas, aunque uno toma el riesgo
     //Cast explicito
     System.out.println(i);
     System.out.println(s);
     //Ejemplo de wrapper
     //Ahora este objeto es una referencia, que tiene algunas opciones de conversion
     Integer edadAnho = new Integer(33);//creamos un nuevo objeto con new
     Double precio = new Double("12.3");//aca estamos convirtiendo un String a Double, esto no se puede hacer con tipos primitivos
     double dd1 = precio.doubleValue();
     int ii1 = precio.intValue();
     byte bb1 = precio.byteValue();
             //realizar conversion sin crear objetos -- Conversion estatica
             double d1 = Double.parseDouble("12.36");//convierte un string a Double
             int i1 = Integer.parseInt("1223");//convierte un string a entero
             float f1 = Float.parseFloat("3.14F");//Sirve para convertir un string pasado por el usuario
             int i2 = Integer.valueOf("10101100", 2);//este metodo permite pasar un valor binario y cual es la base de conversion (binaria, octal, hexadecimal)
             System.out.println(i2);
}

}
