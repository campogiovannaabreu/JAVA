/*
Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.
*/

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Qual o preço do litro da gasolina? R$");
        double precodolitro = ler.nextDouble();
        
        System.out.print("Quanto você pagou pela gasolina? R$");
        double pago = ler.nextDouble();
        
        double litros = pago / precodolitro;
        
        System.out.printf("Você conseguiu colocar %.2f litros no tanque.%n", litros);
    }
}