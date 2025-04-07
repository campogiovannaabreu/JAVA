/*

Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N é o limite inserido pelo usuário.

*/
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        int numero = 0;
        int n; 
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o limite: ");
        n = scanner.nextInt();  
        
        while (numero <= n) {
            System.out.println(numero);
            numero++;
        }


    }
}

