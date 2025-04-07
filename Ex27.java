/*
Faça um programa, utilizando while, que permita o usuário escrever o nome de cinco pessoas e os mostre na tela.
*/
import java.util.Scanner;
public class Ex27
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        int contador = 0;
        
        while (contador < 5) {
        System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
        nomes[contador] = scanner.nextLine();
        contador++;
    }
       System.out.println("\nNomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}