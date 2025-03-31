/*
 Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
*/
import java.util.Scanner;
public class Ex17 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int soma;
	    soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            soma = soma + scanner.nextInt();
        }
        System.out.println("Soma dos números: " + soma);
	}
}