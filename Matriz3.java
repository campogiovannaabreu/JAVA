/*
Faça um programa que leia uma matriz 3x4 de inteiros, substitua seus elementos negativos por 0 e imprima a matriz original e a modificada.
*/
import java.util.Scanner;
public class Matriz3
{
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    int [][] matriz = new int [3][4];
    int[][] matrizOriginal = new int[3][4];
       
       System.out.println("Matriz 3x4:");
    for (int i = 0; i < matriz.length; i++) { 
         for (int j = 0; j < matriz[i].length; j++) { 
             System.out.print ("Entre com a posição [" + i + "][" + j + "] "); 
             matriz[i][j] = ler.nextInt();
            matrizOriginal[i][j] = matriz[i][j]; 
               
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
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
             
             System.out.println("\nMatriz Original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
    
             
             
         }    
        System.out.println(); 
    
    }
}
}