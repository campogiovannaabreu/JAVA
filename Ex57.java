/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize while.
*/
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = ler.nextInt();

        int i = 1;
        System.out.println("Tabuada do " + numero + ":");
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
    }
}