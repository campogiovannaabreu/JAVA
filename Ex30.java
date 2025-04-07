/*

Escreva um programa que pergunta um número ao usuário, e
mostre sua tabuada completa desse número (de 1 até 10).

*/
import java.util.Scanner;
public class Ex30
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Selecione um número de 1 a 10: ");
	    int n = scanner.nextInt();
	    
	    System.out.println("Tabuada do " + n + ":");
        int contador = 1;
	    
	    while (contador <= 10) {
            int resultado = n * contador;
            System.out.println(n + " x " + contador + " = " + resultado);
            contador++;
	    }
	}
}