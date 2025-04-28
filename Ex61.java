/*
Escreva um programa que calcule e exiba o valor da potência de um número informado pelo usuário elevado a um expoente também
informado pelo usuário, utilizando laços de repetição. Dica: Inicie a variável resultado com o valor 1.
Ex:
Base: 2
Expoente:7 
Resultado:128
*/
import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Base: ");
        int base = ler.nextInt();
        System.out.println("Expoente: ");
        int expo = ler.nextInt();
        
        int resultado = 1;
        
         for (int i = 0; i < expo; i++) {
            resultado *= base;   }
        System.out.println("Resultado: " + resultado);  }
    }