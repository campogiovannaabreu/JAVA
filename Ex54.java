/*
Faça um programa para ler N valores inteiros e armazená-los em um Array. O
programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares.
*/
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        
        System.out.print("Informe a quantidade de valores inteiros (N): ");
        int n = ler.nextInt();

        int[] vlr = new int[n]; 
        int pares = 0; 
        int impares = 1;
        boolean impar = false;

        
        System.out.println("Informe " + n + " valores inteiros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vlr[i] = ler.nextInt();

           
            if (vlr[i] % 2 == 0) {
                pares++;
            } else {
                impares *= vlr[i]; 
                impar = true; 
            }
        }

        
        System.out.println("Quantidade de valores pares: " + pares);
        if (impar) {
            System.out.println("Produto dos valores ímpares: " + impares);
        } else {
            System.out.println("Não há valores ímpares para multiplicar.");
        }
    }
}