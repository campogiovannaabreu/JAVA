import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Leia os números desejados:");
        ArrayList<Integer> numeros = new ArrayList<>();
        int n;

        while ((n = sc.nextInt()) != -1) numeros.add(n);
        System.out.println("Maior: " + Collections.max(numeros));
        System.out.println("Menor: " + Collections.min(numeros));
    }
}