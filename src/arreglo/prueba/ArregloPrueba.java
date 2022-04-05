/*
 *Realice un programa en java donde se cree 3 arreglo, el primero sera un  arreglo de 15 numero llenado con numero aleatorios enteros, el segundo arreglo es de "n "
de dimension que sera ingresado por el usario con numero aleatorio tambien entero, que sera ordenado de menor a mayor , el tercer arreglo es de 50 numero qe sera llenado 
con la conbinacion de 15 numero del primero arreglo , se copiara el segundo arreglo a 
continuacion de la copia del primero arreglo y si sobra espacio en el tercer arreglo se rellenara con el valor 55,
NOTA: forma de llenar el aleatorio con numero entero por ejemplo:  (int)(Math.random()*100+1).
 */
package arreglo.prueba;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class ArregloPrueba {

   
  public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int n,m=15,p=50;
        
        
      int[] arreglo1 = new int[m];
      int[] arreglo3 = new int[p];
      
      
      for (int i = 0; i <arreglo1.length; i++) {
          arreglo1[i]= (int)(Math.random()*100+1);  
      }
  
      System.out.println(Arrays.toString(arreglo1));
    
      System.out.println("ingrese la dimension de segundo arreglo ");
         n = leer.nextInt();
         
      int [] arreglo2 = new int[n];
      
      for (int i = 0; i <arreglo2.length; i++) {
          arreglo2[i]= (int)(Math.random()*100+1); 
      }
      Arrays.sort(arreglo2);
     
      System.arraycopy(arreglo1, 0, arreglo3, 0, arreglo1.length);
      System.arraycopy(arreglo2, 0, arreglo3, 15, arreglo2.length);
      
      
     if(p ==(n+m)){
         System.out.println(Arrays.toString(arreglo3));
     } else {
         Arrays.fill(arreglo3,n+m, arreglo3.length,55);
         
         System.out.println(Arrays.toString(arreglo3));

     }  
    }
    
}
