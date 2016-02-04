/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elearning03
 */
public class FlujoCase {
     public static void main(String[] args)
    {
        char sexo ='M';
        switch (sexo)//valida este valor, este valor solo se pasa una vez, compara la variable con cada uno de los casos
        {
            case 'M':   //cada uno de estos case es equivalente a un if/else
            System.out.println("Masculino");
                break;//despues de validar tengo que salir, eso lo represento con el break
            case 'F':
                System.out.println("Femenino");
                break;//no necesitamos usar el brake en todos los case  
            default:       //el default representa un else comparado con el de if, este default tambien se puede eliminar
                System.out.println("Otro");
        }
    }
}
