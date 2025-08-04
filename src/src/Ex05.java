package src;

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nomes[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + i + "° Nome:");
            nomes[i] = ler.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Os nomes são " + nomes[i]);
        }
    }
}