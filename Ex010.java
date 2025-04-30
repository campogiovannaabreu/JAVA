/*
Exercicio 010
Faça um Programa que peça dois números e imprima o maior deles.
*/
import java.util.Scanner;
public class Ex010{
    public static void main (String[]args){
    Scanner ler = new Scanner(System.in);
    int n1, n2;
    
    System.out.println ("Informe o primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println ("Informe o segundo número: ");
		n2 = ler.nextInt();
		
		if( n1 > n2 )
		System.out.println("O primeiro número é maior: " + n1);
        else
		System.out.println("O segundo número é maior: " + n2);
}
}