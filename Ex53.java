/*
Faça um programa que leia 10 valores reais e os apresente na ordem:
       a) crescente
       b) decrescente
       c) inversa da entrada.
       * pesquisar para obter os valores em ordem crescente e decrescente.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] v = new double[10];

        
        System.out.println("Informe 10 valores reais:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            v[i] = ler.nextDouble();
        }

        
        double[] vlcrescentes = Arrays.copyOf(v, v.length);
        Arrays.sort(vlcrescentes);
        System.out.println("Valores em ordem crescente: " + Arrays.toString(vlcrescentes));

        
        double[] vldecrescentes = Arrays.copyOf(v, v.length);
        Arrays.sort(vldecrescentes);
        System.out.println("Valores em ordem decrescente: ");
        for (int i = vldecrescentes.length - 1; i >= 0; i--) {
            System.out.print(vldecrescentes[i] + " ");
        }
        System.out.println();

        System.out.println("Valores na ordem inversa da entrada:");
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
    }
}