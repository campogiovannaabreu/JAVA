/*
 Desenvolver um programa com menu para simular uma conta corrente:    
    a) Depósito bancário
    b) Saque
    c) Saldo
    d) Sair
  - A cada ação favor montar o menu novamente.
*/
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo = 0.0; 
        int opcao;
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Depósito Bancário");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = ler.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito de R$ " + deposito + " realizado com sucesso!");
                    } else {
                        System.out.println("Valor de depósito inválido!");
                    }
                    break;
                
                case 2:
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = ler.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque de R$ " + saque + " realizado com sucesso!");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente para o saque.");
                    } else {
                        System.out.println("Valor de saque inválido!");
                    }
                    break;
                
                case 3:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                
                case 4:
                    System.out.println("Saiu do sistema.");
                    ler.close();
                    return;
                
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
