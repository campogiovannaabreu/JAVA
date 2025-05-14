/*
Exercicio 013
Faça um Programa que leia três números e mostre o maior deles.
*/
import java.util.Scanner;
public class Ex013
{
	 public static void main (String [] args) {
    Scanner ler = new Scanner (System.in);
    
    int n1, n2, n3;
    
    System.out.println("Informe o primeiro número: ");
    n1=ler.nextInt();
    
    System.out.println("Informe o segundo número: ");
    n2=ler.nextInt();
    
    System.out.println("Informe o terceiro número: ");
    n3=ler.nextInt();
    

    
    if ( n1 > n2 && n1 > n3 ) {
    System.out.println ("O primeiro número é maior");
   } else if (n2 > n1 && n2 > n3) {
    System.out.println ("O segundo número é maior");
  }  else {
     System.out.println ("O terceiro número é maior");
  }
    }
}