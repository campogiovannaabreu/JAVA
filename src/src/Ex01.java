package src;

import java.util.Scanner;
public class Ex01 {
    public static void main(String[]args){
        Scanner ler = new Scanner (System.in);
        int a, b;
        System.out.print("Informe o primeiro valor:");
        a = ler.nextInt();
        System.out.print("Informe o segundo valor:");
        b = ler.nextInt();

        System.out.println("Resultados:");
        System.out.println("Soma:"+ (a+b));
        System.out.println("Subtração:"+ (a-b));
        System.out.println("Multiplicação:"+ (a*b));
        System.out.println("Divisão inteira:"+ (a%b));
        System.out.println("Divisão Exata:"+ ((double)a/b));

    }
}
