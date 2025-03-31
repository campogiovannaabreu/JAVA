/*
Ex 12 Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
*/
import java.util.Scanner;
public class Ex12

{
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int ano, anol, i, falta, passou;
        
        
        System.out.println("Infome o seu ano de nascimento: ");
        ano=ler.nextInt();
        
        anol=2025-ano;
        falta=anol-18;
        passou=18-anol;
        
       if (anol<18);
    System.out.println("Não é possível se alistar, falta " + passou + " anos");
    
   if  (anol>=18);
    System.out.println("Ja se passaram " + falta + " anos do alistamento");

        
     
      
      
     
     }
     
}
