/*
Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição. Utilize for.
*/
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        int soma = 0;
        
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
                System.out.println(i);
            }
            }
            System.out.println("Ao somarmos os números ímpares de 1 a 100 o resultado será: " + soma);
        }
    }