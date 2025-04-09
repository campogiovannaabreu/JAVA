/*
Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa
com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
DIAS
*/

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Qual o seu nome? ");
        String nome = ler.nextLine();
        
        System.out.print("Quantos anos " + nome + " tem? ");
        int idade = ler.nextInt();
        
        int diasdoano = 365;
        int diasdavida = idade * diasdoano;
        
        System.out.println(nome + ", Na sua vida toda, você viveu:" + diasdavida + " dias");
    }
}