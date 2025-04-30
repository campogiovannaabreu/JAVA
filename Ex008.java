/*
Exercicio 008
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

*/
import java.util.Scanner;
public class Ex008{
    public static void main (String[]args){
    double peso, multa, valorpeixe;
    Scanner ler = new Scanner (System.in);
    
    System.out.println("Informe o peso do peixe:");
    peso = ler.nextDouble();
    
    valorpeixe = peso - 50;
    multa = valorpeixe*4.0;
    
    if (peso > 50)
    System.out.println("O peso do peixe foi de:" + peso + " e a multa será de: " + multa);
    
    else
    System.out.println("O peso do peixe não foi maior que 50 então não haverá multa.");
    
    }
}