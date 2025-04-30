/*
Exercicio 002
Faça um Programa que peça dois números e imprima a soma.
*/
import java.util.Scanner;
public class Ex002
{
	public static void main(String[] args) {
	    int n1, n2, total;
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("Informe o primeiro número");
		n1 = ler.nextInt();
		
		System.out.println("Informe o segundo número");
		n2 = ler.nextInt();
		
		total = n1 + n2;
		
		System.out.println("Somando o primeiro número e o segundo número, teremos o total de: " + total);
	}
}
