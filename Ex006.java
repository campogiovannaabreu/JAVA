/*
Exercicio 006
Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
*/
import java.util.Scanner;
public class Ex006{
    public static void main(String[]args){
        double far, cel;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe a temperatura convertida em graus Farenheit:");
        far = ler.nextDouble();
        
        cel = (5 * (far-32) / 9);
        
        System.out.println("A temperatura convertida em graus Celsius será:" + cel);
    }
}