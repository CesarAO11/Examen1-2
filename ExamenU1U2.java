/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu1u2;
import java.util.Scanner;

public class ExamenU1U2 {

    public static void main(String[]args) {
        
   Scanner scanner = new Scanner(System.in);

      System.out.println( "Ingrese el nombre del primer producto: ");
       String nombre1 = scanner.nextInt();
    
       System.out.println( "Ingrese el precio: ");
     double precio1 = scanner.nextDouble();
     scanner.nextLine;
     
     System.out.println( "Ingrese el nombre del segundo producto: ");
     String nombre2 = scanner.nextLine();
     
     System.out.println( "Ingrese el precio: ");
     double precio2 = scanner.nextDouble();
     scanner.nextLine;
     
     System.out.println( "Ingrese el nombre del tercer producto producto: ");
     String nombre3 = scanner.nextLine();
     
     System.out.println( "Ingrese el precio: ");
     double precio3 = scanner.nextDouble();
      scanner.nexLine();
   
    double (costo1*30)/100;
    double (costo2*65)/100;
    double (costo3*15)/100;
    
    System.out.println("el precio es de" + nombre1 + " es: " costo1);
    System.out.println("el precio es de" + nombre2 + " es: " costo2);
    System.out.println("el precio es de" + nombre3 + " es: " costo3);
    }
    
}
