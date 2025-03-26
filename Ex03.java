/*
Ex03- Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.
*/
import java.util.Scanner; //Ler as entradas do teclado
public class Ex03
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n1, n2, n3;
	    
	    //Entrada de dados
		System.out.println("Informe um primeiro número qualquer");
		n1=ler.nextInt();
		System.out.println("Informe um segundo número qualquer");
		n2=ler.nextInt();
		System.out.println("Informe um terceiro número qualquer");
		n3=ler.nextInt();
		
		//Processamento
		if (n1 > n2 && n1 > n3)
		System.out.println("O primeiro número é maior" +n1);
		if (n1 < n2 && n2>n3)
		System.out.println("O segundo número número é maior" +n2);
		if  (n1 < n3 && n2<n3)  
		System.out.println("O terceiro número é maior" +n3);
	}
}
