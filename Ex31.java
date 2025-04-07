/*
Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.
*/
import java.util.Scanner;
public class Ex31
{
	public static void main(String[] args) {
	   int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++; 
        }
        System.out.println();
    }
}