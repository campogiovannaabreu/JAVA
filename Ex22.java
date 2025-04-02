/*
22)Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 
*/
import java.util.Scanner;

public class Ex22{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int somaih = 0, somaim = 0, totalh = 0, totalm = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a idade: ");
            int idade = ler.nextInt();
            System.out.print("Digite o sexo (M/F): ");
            char sexo = ler.next().toUpperCase().charAt(0);

            if (sexo == 'M') {
                somaih += idade;
                totalh++;
            } else if (sexo == 'F') {
                somaim += idade;
                totalm++;
            }
        }

        int somat = somaih + somaim;
        System.out.println("Idade média do grupo: " + (somat / 7.0));
        if (totalm > 0) {
            System.out.println("Idade média das mulheres: " + (somaim / (double) totalm));
        }
        if (totalh > 0) {
            System.out.println("Idade média dos homens: " + (somaih / (double) totalh));
        }
       
    }
}