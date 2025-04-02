/*
20) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. 
*/
import java.util.Scanner;
 
 public class Ex20 {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         
         int entre0e100 = 0, entre101e200 = 0, maior200 = 0;
         
         for (int i = 1; i <= 20; i++) {
             System.out.print("Digite o " + i + "º número: ");
             int num = ler.nextInt();
             
             if (num >= 0 && num <= 100) {
                 entre0e100++;
             } else if (num >= 101 && num <= 200) {
                 entre101e200++;
             } else if (num > 200) {
                 maior200++;
             }
         }
         
         System.out.println("Quantidade de números entre 0 e 100: " + entre0e100);
         System.out.println("Quantidade de números entre 101 e 200: " + entre101e200);
         System.out.println("Quantidade de números maiores que 200: " + maior200);
     }
 }