/*
Ex01-Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.
*/
import java.util.Scanner; //Ler as entradas do teclado
public class Ex01
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    String nome;
	    int n1, n2, r;
	    
	    //Entrada de dados
		System.out.println("Informe a primeira nota:");
		n1=ler.nextInt();
		System.out.println("Informe a segunda nota:");
		n2=ler.nextInt();
		
		//Processamento
		System.out.println("Soma:" + (n1 + n2));
		r=(n1 + n2);
		System.out.println("Divisão Inteira:" + (r/2));
		
		if(r>=7)
		System.out.println("O aluno está aprovado e sua média foi" + r);
	    if (r<5)
	    System.out.println("O aluno está reprovado e sua média foi" + r);
	}
}
