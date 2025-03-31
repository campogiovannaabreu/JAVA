/*
15) Escreva um programa que calcule a soma dos números de 1 a 15.
*/
import java.util.Scanner;
public class Ex15
{
    public static void main(String[] args) {
        int soma = 0; // Variável para armazenar a soma

        // Estrutura de repetição para somar os números de 1 a 15
        for (int i = 1; i <= 15; i++) {
            soma += i; // Adiciona o valor de 'i' à soma
        }

        // Exibe o resultado
        System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }
}
