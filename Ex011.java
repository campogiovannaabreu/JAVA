/*
Exercicio 011
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
*/
import java.util.Scanner;
public class Ex011
{
	public static void main(String[] args) {
	    double valor;
	    Scanner ler = new Scanner (System.in);
	    
		System.out.println("Informe o valor");
		valor = ler.nextDouble();
		
		if(valor > 0)
		System.out.println("O valor é positivo");
		else
		System.out.println("Informe o valor negativo");
		
	}
}
