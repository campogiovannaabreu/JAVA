/*
Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.
*/
import java.util.Scanner;
public class Ex06
{
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero, r;
        
        System.out.println("Infome um número: ");
         numero=ler.nextInt();
        
        r=numero%2;
        
       if (numero==0)
        System.out.println("O número é par");
        
       else
       System.out.println("O número é ímpar");
        
        
        
    }
}