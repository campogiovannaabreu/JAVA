/*
1. Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.
*/
import java.util.Scanner;
public class Matriz01
{
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    int [][] matriz = new int [5][5];
    int numpar = 0;
    
    System.out.println("Matriz 5x5:");
    for (int i = 0; i < matriz.length; i++) { 
         for (int j = 0; j < matriz[i].length; j++) { 
             System.out.print ("Entre com a posição [" + i + "][" + j + "] "); 
             matriz[i][j] = ler.nextInt();
           
            if (matriz[i][j] % 2 == 0 ) {
                numpar++;
          }
         } 
         }
          System.out.println("Matriz 3x4:");
    for (int i = 0; i < matriz.length; i++) { 
         for (int j = 0; j < matriz[i].length; j++) { 
             System.out.print (matriz [i][j] + " "); 
             
         }
          System.out.println();
    }
     System.out.println("A quantidade de números pares na matriz é:" +numpar);
    }
}
    
       
      