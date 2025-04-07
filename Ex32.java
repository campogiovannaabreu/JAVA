/*
Faça um programa que leia 5 números e informe o maior número.
*/
import java.util.Scanner;
public class Ex32
{
	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
       int maiornu = Integer.MIN_VALUE;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            if (numero > maiornu) {
                maiornu = numero; 
            }
        }
        System.out.println("O maior número é: " + maiornu);
	}
	
}