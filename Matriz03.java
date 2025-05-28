/*
Crie um algoritmo informe qual o maior e qual o menor elemento existente em uma matriz
6x3.
*/
import java.util.Scanner;
public class Matriz03
{
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    int [][] matriz = new int [6][3];
    int numeromaior=0, menor = Integer.MAX_VALUE; 
       
       System.out.println("Matriz 6x3:");
    for (int i = 0; i < matriz.length; i++) { 
         for (int j = 0; j < matriz[i].length; j++) { 
             System.out.print ("Entre com a posição [" + i + "][" + j + "] "); 
             matriz[i][j] = ler.nextInt();
            
             
          if (matriz[i][j] < menor){
         menor = matriz [i][j];
        }
        if (numeromaior < matriz [i][j]) {
         numeromaior = matriz [i][j];   
        }
        
        }
        
        
        }
        
    System.out.println("O elemento maior é : "+numeromaior );
    System.out.println("O elemento menor é: "+ menor);
    }
}