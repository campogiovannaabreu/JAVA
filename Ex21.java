/*
21)Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre: A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis; 
*/
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idadepesocount = 0, ruivasnaoazuis = 0, olhosazuiscount = 0;
        double somaidadebaixas = 0;
        int pessoasbaixas = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade: ");
            int idade = ler.nextInt();
            System.out.print("Digite o peso (kg): ");
            double peso = ler.nextDouble();
            System.out.print("Digite a altura (m): ");
            double altura = ler.nextDouble();
            System.out.print("Digite a cor dos olhos (A, P, V, C): ");
            char olhos = ler.next().toUpperCase().charAt(0);
            System.out.print("Digite a cor dos cabelos (P, C, L, R): ");
            char cabelo = ler.next().toUpperCase().charAt(0);

            if (idade > 50 && peso < 60) {
                idadepesocount++;
            }
            if (altura < 1.50) {
                somaidadebaixas += idade;
                pessoasbaixas++;
            }
            if (olhos == 'A') {
                olhosazuiscount++;
            }
            if (cabelo == 'R' && olhos != 'A') {
                ruivasnaoazuis++;
            }
        }

        System.out.println("Pessoas com idade > 50 anos e peso < 60kg: " + idadepesocount);
        if (pessoasbaixas > 0) {
            System.out.println("Média das idades das pessoas com altura < 1.50: " + (somaidadebaixas / pessoasbaixas));
        } else {
            System.out.println("Nenhuma pessoa com altura < 1.50.");
        }
        System.out.println("Porcentagem de pessoas com olhos azuis: " + (olhosazuiscount / 20.0) * 100 + "%");
        System.out.println("Pessoas ruivas sem olhos azuis: " + ruivasnaoazuis);
        
    }
}
