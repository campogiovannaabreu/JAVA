package src;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Escolha um número entre 1 e 3:");
        int numero = ler.nextInt();
switch(numero) {
    case 1:
        System.out.print("O número escolhido foi:1");
        break;
    case 2:
        System.out.print("O número escolhido foi:2");
        break;
    case 3:
        System.out.print("O número escolhido foi:3");
        break;
    default:
        System.out.println("O número escolhido é invalido escolha um número de 1 a 3!");
}
}
}
