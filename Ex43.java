/*
Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.
*/

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salariofinal;
        
        System.out.println("Informe o salário do funcionário R$: ");
        double primeirosalario = ler.nextDouble();
        double aumento = primeirosalario * 0.15;
      
      System.out.print("Com o aumento de 10%  seu salário será R$:" +aumento);
      salariofinal = aumento + primeirosalario;
      System.out.print("No final seu salário será de R$:" + salariofinal);
      double imposto = salariofinal * 0.08;
      System.out.print("No final seu imposto será de:" +imposto);
      salariofinal = aumento - imposto;
      System.out.print("No final seu salário será de R$:" +salariofinal);
    }
}
