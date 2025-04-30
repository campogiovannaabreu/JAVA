/*
Exercicio 004
Faça um Programa que converta metros para centímetros.
*/
import java.util.Scanner;
public class Ex004
{
	public static void main(String[] args) {
	    double cm, metros;
	    Scanner ler = new Scanner (System.in);
	    
		System.out.println("Informe quantos metros:");
        metros = ler.nextDouble();
		cm = metros*100;
		
	    System.out.println("Informe a conversão de metros para centimetros:" + cm);	
		

	}
}
