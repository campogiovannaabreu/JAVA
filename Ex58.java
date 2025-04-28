/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize for.
*/
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número para vermos sua tabuada: ");
        int numero = ler.nextInt();

        System.out.println("Tabuada do número" + numero + ":");
        for (int i = 1; i <= 10;) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
    }
}