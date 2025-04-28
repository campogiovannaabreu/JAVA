/*
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize while.
*/
import java.util.Scanner;
public class Ex55
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
     int numero = 1;
	    System.out.println("Números pares de 1 a 50:");
	    while (numero <= 50) {
	        if (numero % 2 == 0) {
	            System.out.println(numero);
	        }
	        numero++;
	    }
	    numero = 51;
        System.out.println("Números ímpares de 51 a 100:");
        while (numero <= 100) {
            if (numero % 2 == 1) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}