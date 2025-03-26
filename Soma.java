/*
Segundo Programa Java 
Desenvolva um programa que calcule a soma de dois números 

*/

import java.util.Scanner; // o scanner le as entrdas do teclado 
public class Soma
{
    public static void main(String[] args) {
        double a,b, soma; //Declara variáveis
        Scanner ler = new Scanner(System.in);
        
        //Entrada de dados
        System.out.println("Informe o primeiro valor: ");
        a = ler.nextDouble();
        
        System.out.println("Informe o segundo valor: ");
        b = ler.nextDouble();
        
        //Processamento 
        soma = a +b;
        
        //Saída
        System.out.println("O resultado é: " + soma);
        
    }
}