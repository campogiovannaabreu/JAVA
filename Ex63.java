/*
9.   
Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores que 10.
*/
import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maiorque = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe o número: ");
            int numero = ler.nextInt(); 
            if (numero > 10) {
                maiorque++;
            }
        }
            System.out.println("Total de números maiores que 10: " + maiorque);
        }
    }
