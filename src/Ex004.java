import java.util.ArrayList;
import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double soma = 0;
        System.out.println("Insira a nota:");
        for (int i = 0; i < 5; i++) {
            double nota = sc.nextDouble();
            notas.add(nota);
            soma += nota;
        }
        double media = soma / notas.size();
        long acima = notas.stream().filter(n -> n > media).count();
        System.out.println("Média: " + media + ", Acima da média: " + acima);
    }
}

