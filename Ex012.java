/*
Exercicio 012
Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar: A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; A mensagem "Reprovado", se a média for menor do que sete; A mensagem "Aprovado com Distinção", se a média for igual a dez.
*/
import java.util.Scanner;
public class Ex012
{
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);
        int n1, n2, media, soma;
	    
	  
		System.out.println("Informe a primeira nota:");
		n1=ler.nextInt();
		System.out.println("Informe a segunda nota:");
		n2=ler.nextInt();
		
	    soma = n1 + n2;
	    media = soma/2;
		
		if (media == 10)
	    System.out.println("O aluno está aprovado com Distinção e sua média foi: " + media);
		if(media>=7)
		System.out.println("O aluno está aprovado e sua média foi: " + media);
	    else 
	    System.out.println("O aluno está reprovado e sua média foi: " + media);
	}
}