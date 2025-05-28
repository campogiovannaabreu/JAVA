/*
Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.
*/
import java.util.Scanner;
public class Matriz02
{
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    int [][] matriz = new int [3][3];
    int somaColuna1=0;
    int somaColuna2=0;
    int somaColuna3=0;  
    
   
   
       System.out.println("Matriz 3x3:");
    for (int i = 0; i < matriz.length; i++) { 
         for (int j = 0; j < matriz[i].length; j++) { 
             System.out.print ("Entre com a posição [" + i + "][" + j + "] "); 
             matriz[i][j] = ler.nextInt();
          


  
  
         }
         
         somaColuna1+=matriz[i][0];
         somaColuna2+=matriz[i][1];
         somaColuna3+=matriz[i][2];
         
    }
    
    System.out.println("A soma da primeira coluna é: "+ somaColuna1);
    System.out.println("A soma da segunda coluna é: "+ somaColuna2);
    System.out.println("A soma da terceira coluna é: "+ somaColuna3);
            
    }
}