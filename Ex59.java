/*
Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição. Utilize while.
*/
import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        
        while (numero <= 100) {
            if (numero % 2 == 0) {
                soma += numero;
                System.out.println(numero);
            }
            numero++;
            }
            System.out.println("Ao somarmos os números pares de 1 a 100 o resultado será: " + soma);
        }
    }