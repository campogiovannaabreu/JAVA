/*
Desenvolva um algoritmo que leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.
*/
import java.util.Scanner;
public class Ex48 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] valores = new double[5];
        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = ler.nextDouble();
        }

        for (int i = 0; i < valores.length; i += 2) {
            soma += valores[i];
        }

        System.out.println("A soma dos valores nas posições ímpares é: " + soma);
    }
}

