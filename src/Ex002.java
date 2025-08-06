import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Leia 5 nomes:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }

        Collections.reverse(nomes);

        System.out.println("\nNomes em ordem inversa:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}