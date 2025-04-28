/*
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize for
*/
import java.util.Scanner;
public class Ex56
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
         
         System.out.println("Digite números pares de 1 a 50: ");
         for (int i = 1; i <= 50; i++) {
             if (i % 2 == 0) {
             System.out.println(i);
             }
         }
         
         System.out.println("Digite números pares de 51 a 100: ");
         for (int i = 51; i <= 100; i++) {
             if (i % 2 != 0) {
             System.out.println(i);
             }
         }
	}
}
             
             
        
         
         