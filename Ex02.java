/*
Ex02- Faça um algoritmo que receba a idade
do usuário e verifique se ele tem 18 anos ou mais. Se a resposta for positiva
escrever “maior de idade”, senão “menor de idade”.
*/
import java.util.Scanner; //Ler as entradas do teclado
public class Ex02
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int idade;
	    
	    //Entrada de dados
		System.out.println("Informe a idade");
		idade=ler.nextInt();
		
		//Processamento
		if (idade>=18)
		System.out.println("A pessoa é maior de idade" + idade);
		else
		System.out.println("A pessoa é menor de idade" + idade);
	}
}
