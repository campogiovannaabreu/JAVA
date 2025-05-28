/*
Desenvolva um programa que leia duas matrizes 5x2 e crie uma terceira matriz também 5x2
com o valor da soma dos elementos de mesmo índice.
*/
import java.util.Scanner;
public class Matriz05
{
  public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int [][] matriz1 = {
                {10, 20},
                {30, 40},
                {50, 60},
                {70, 80},
                {90, 100}
        };
                
         int [][] matriz2 = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };
        int soma [][] = new int [5][2];
        
        System.out.println();
        
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                soma [i][j] = matriz1 [i][j] + matriz2 [i][j];
                System.out.println("A soma do matriz é: " + soma[i][j]);
                }
        }
    }
}
    