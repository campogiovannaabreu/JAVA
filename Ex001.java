/*
Exercicio 001
Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
*/
import java.util.Scanner;
public class Ex001
{
	public static void main(String[] args) {
	    int numero;
	    Scanner ler = new Scanner (System.in);
	    
		System.out.println("Informe um número:");
		numero = ler.nextInt();
		
		System.out.println("O número informado foi:" + numero);
	}
}
