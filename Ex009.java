/*
Exercicio 009
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

*/
import java.util.Scanner;
public class Ex009{
    public static void main(String[]args){
        double metros, tinta, quantidade, valor;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o tamanho em metros quadrados da área que deseja pitar:");
        metros = ler.nextDouble();
        
        tinta = metros/3;
        quantidade = tinta/18;
        valor = quantidade*80;
        
        System.out.println("Você precisa de:" + quantidade + " latas de tinta e o valor a ser pago é de:" + valor);
        
    } 
    }