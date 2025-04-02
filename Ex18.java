/*
Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e quantas pessoas são maiores de idade.
*/
import java.util.Scanner;
public class Ex18
{
    public static void main (String []args){
        Scanner ler = new Scanner (System.in);
        int idade, media, soma=0, maiores=0;
        
       for (int i = 1; i<=20; i++){
           System.out.println("Leia idade de 20 pessoas");
            idade= ler.nextInt();
            soma = soma + idade;
            if(idade>18)
               maiores++;
                

        }
            System.out.println ("A soma das idades será:" + soma);
             media = soma / 20;
            System.out.println ("A média será = " + media);
             System.out.println ("Quantidade de maiores de idade: " + maiores);
}
}
           