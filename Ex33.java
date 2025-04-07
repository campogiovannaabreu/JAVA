/*

Faça um programa que leia 10 números e informe a soma e a média dos números.

*/
import java.util.Scanner;
public class Ex33
{
	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        while (contador < 10) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            int n = scanner.nextInt();
            soma += n; 
            contador++; 
        }
        double media = soma / 10.0;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}