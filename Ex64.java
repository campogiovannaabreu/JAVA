/*
Faça um algoritmo que leia 10 números inteiros e, 
ao final, escreva quantos estão entre 0 e 100.
*/
import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int entre0e100 = 0;

      
        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o número " + i + ": ");
            int numero = ler.nextInt(); 
            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            }
        }
        System.out.println("Total de números entre 0 e 100: " + entre0e100);
    }
}