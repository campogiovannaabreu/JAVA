/*
Faça um programa, utilizando while, que permita o usuario fazer contas de adicao enquanto quiser.
*/

import java.util.Scanner;
public class Ex28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int soma = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite um número para adicionar à soma: ");
            int numero = scanner.nextInt();
            soma += numero;

            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next();
        }

        System.out.println("A soma total é: " + soma);
    }
}
