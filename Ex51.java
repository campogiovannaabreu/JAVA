/*
Desenvolva um algoritmo que preencha aleatoriamente um vetor de 10 posicões com números entre 0 a 100. Calcule e escreva o maior, menor e a média desses números.
Ex. import java.util.Random;
    Criar um gerador de números aleatórios
    Random random = new Random();
*/
import java.util.Random;

public class Ex51 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] n = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            n[i] = random.nextInt(101); 
            soma += n[i];
        }

        int maior = 0;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i < 10; i++) {
            if (n[i] > maior) {
                maior = n[i];
            }
            if (n[i] < menor) {
                menor = n[i];
            }
        }

        double media = soma / 10.0;

        System.out.println("Números gerados:");
        for (int i = 1; i < 10; i++) {
            System.out.print(n[i] + " ");
        }

        System.out.printf("\nO maior número é: " + maior);
        System.out.printf("\nO menor número é: " +  menor);
        System.out.printf("\nA média é: " +  media);
    }
}
