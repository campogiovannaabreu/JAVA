/*
Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.
*/
import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = ler.nextInt();
        }
        System.out.println("Você digitou:");

        for (int i = n.length - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }
    }
}






