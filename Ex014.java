/*
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,
informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
*/

import java.util.Scanner;
public class Ex014 {
    
    
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Informe o seu atual salário: ");
         double salarioinicio = ler.nextDouble();
         double porcaumento;
         
         if (salarioinicio <= 280) {
             porcaumento = 20.0;
            } else if (salarioinicio <= 700) {
                 porcaumento = 15;
             } else if (salarioinicio <= 1500) {
                 porcaumento = 10;
             }  else {
                 porcaumento = 5;
             }
             
        double valoraumento = salarioinicio * (porcaumento / 100);
        double salariofim = salarioinicio + valoraumento;
        
        System.out.println("\nSalário antes do reajuste: " + salarioinicio);
        System.out.println("O percentual de aumento aplicado: " +porcaumento);
        System.out.println("Valor do aumento: " + valoraumento);
        System.out.println("O novo salário: " + salariofim);
         }
     }