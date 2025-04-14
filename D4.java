/**********************************************
4 - Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa 
o valor do saque, e o programa informa quantas 
cédulas de R$100, R$50, R$20, R$10 e R$5 serão entregues, 
com base nas cédulas disponíveis. Caso não seja possível 
realizar o saque com as cédulas, exiba uma mensagem de erro.

************************************************/
import java.util.Scanner;

public class D4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        
        int cedulas100 = 10;
        int cedulas50 = 10;
        int cedulas20 = 10;
        int cedulas10 = 10;  
        int cedulas5 = 10;

        System.out.print("Informe o valor do saque: R$ ");
        int valorSaque = ler.nextInt();

        
        if (valorSaque <= 0 || valorSaque % 5 != 0) {
            System.out.println("Valor inválido! O valor do saque deve ser positivo e múltiplo de R$5.");
        } else {
        
            int totalCedulas100 = 0;
            int totalCedulas50 = 0;
            int totalCedulas20 = 0;
            int totalCedulas10 = 0;
            int totalCedulas5 = 0;

        
            if (valorSaque >= 100) {
                totalCedulas100 = Math.min(valorSaque / 100, cedulas100);
                valorSaque -= totalCedulas100 * 100;
            }

            
            if (valorSaque >= 50) {
                totalCedulas50 = Math.min(valorSaque / 50, cedulas50);
                valorSaque -= totalCedulas50 * 50;
            }

            
            if (valorSaque >= 20) {
                totalCedulas20 = Math.min(valorSaque / 20, cedulas20);
                valorSaque -= totalCedulas20 * 20;
            }

            
            if (valorSaque >= 10) {
                totalCedulas10 = Math.min(valorSaque / 10, cedulas10);
                valorSaque -= totalCedulas10 * 10;
            }

          
            if (valorSaque >= 5) {
                totalCedulas5 = Math.min(valorSaque / 5, cedulas5);
                valorSaque -= totalCedulas5 * 5;
            }

           
            if (valorSaque > 0) {
                System.out.println("Desculpe, não é possível realizar o saque com as cédulas disponíveis.");
            } else {
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Cédulas entregues:");
                System.out.println("R$100: " + totalCedulas100);
                System.out.println("R$50: " + totalCedulas50);
                System.out.println("R$20: " + totalCedulas20);
                System.out.println("R$10: " + totalCedulas10);
                System.out.println("R$5: " + totalCedulas5);
            }
        }
    }
}
