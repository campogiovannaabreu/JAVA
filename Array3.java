/*
Desenvolver um programa para ler o nome e idade de 5 pessoas. Guardar esse dados em Array. Apresentar o nome e a idade das pessoas maiores de idade.
*/
import java.util.Scanner;
public class Array3
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    String []nome = new String[5];
	    int[] idade = new int [5];
	    
	    for (int i=0; i<idade.length; i++){
		System.out.println("Digite o nome da pessoa:" + (i+1)+":");
		nome [i] = ler.nextLine();
		
		System.out.println("Digite a idade da pessoa:" + (i+1)+":");
		idade [i] = ler.nextInt();
		ler.nextLine();
		
	}
	System.out.println("Pessoas maiores de idade:");
	 for (int i=0; i<5; i++){
	     if (idade[i] >=18)
	     System.out.println("Nome:" + nome[i] + ",Idade:" +idade [i]);
	 }
	}
}
