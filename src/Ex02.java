import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double v1 = 0, v2 = 0, v3 = 0;
        System.out.print("Receba o primeiro valor:");
        v1 = ler.nextDouble();
        System.out.print("Receba o segundo valor:");
        v2 = ler.nextDouble();
        System.out.print("Receba o terceiro valor:");
        v3 = ler.nextDouble();

        if (v1 == v2 && v1 == v3)
            System.out.print("Todos iguais");
        else if (v1 > v2 && v1 > v3)
            System.out.print("O primeiro valor é maior!");
        else if (v2 > v3)
            System.out.print("O segundo valor é maior!");
        else
            System.out.print("O terceiro valor é maior!");
    }
}
