/*
Exercicio 003
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
*/
import java.util.Scanner;
public class Ex003
{
	public static void main(String[] args) {
	    int nota1, nota2, nota3, nota4, media;
	    Scanner ler = new Scanner (System.in);
	    
		System.out.println("Informe a primeira nota:");
		nota1 = ler.nextInt();
		
		System.out.println("Informe a segunda nota:");
		nota2 = ler.nextInt();
		
		System.out.println("Informe a terceira nota:");
		nota3 = ler.nextInt();
		
		System.out.println("Informe a quarta nota:");
		nota4 = ler.nextInt();
		
		System.out.println("Total das notas:" + (nota1 + nota2 + nota3 + nota4));
		media=(nota1 + nota2 + nota3 + nota4);
		System.out.println("A média total é de:" + (media/4));
		
	}
}
