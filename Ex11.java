/*
Ex 11 Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano. 
Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito.
de 0 a 200 - nenhum crédito
de 201 a 400 - 20% do valor do saldo médio
de 401 a 600 - 30% do valor do saldo médio
acima de 601 - 40% do valor do saldo médio
*/
import java.util.Scanner;
public class Ex11

{
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int ce1, ce2, ce3,s;
        
        
        System.out.println("Infome o saldo médio: ");
        s=ler.nextInt();
        
        ce1= s*20/100;
        ce2= s*30/100;
        ce3= s*40/100;
        
       if (s<=200);
    System.out.println("Não terá nenhum crédito: ");
        
      if (s>= 201 && s<= 400);
      System.out.println("O crédito será de: " + ce1);
      
       if (s>= 401 && s<= 600);
      System.out.println("O crédito será de: " + ce2);
      
       if (s>= 601);
      System.out.println("O crédito será de: " + ce3);
      
      
     
     }
     
}