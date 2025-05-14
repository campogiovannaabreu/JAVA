/*
Desenvolver um sistema bancário básico que permita criar contas para múltiplos usuários, 
realizar depósitos, saques e consultar saldos, utilizando apenas arrays e 
estruturas de controle fundamentais do Java.
*/
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        double[] saldos = new double[5];
        int quantidadeclientes = 0;

        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();
            ler.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    if (quantidadeclientes < 5) {
                        System.out.print("Informe o nome do cliente: ");
                        String nome = ler.nextLine();
                        nomes[quantidadeclientes] = nome;
                        saldos[quantidadeclientes] = 0.0;
                        quantidadeclientes++;
                        System.out.println("Conta criada com sucesso!");
                    } else {
                        System.out.println("Limite de contas atingido.");
                    }
                    break;

                case 2:
                    System.out.print("Informe o nome do cliente: ");
                    String nomedodeposito = ler.nextLine();
                    boolean deposito = false;
                    for (int i = 0; i < quantidadeclientes; i++) {
                        if (nomes[i].equals(nomedodeposito)) {
                            System.out.print("Digite o valor a ser depositado: R$ ");
                            double valordeposito = ler.nextDouble();
                            saldos[i] += valordeposito;
                            System.out.println("Depósito realizado com sucesso!");
                            deposito = true;
                            break;
                        }
                    }
                    if (!deposito) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Informe o nome do cliente: ");
                    String nomesaque = ler.nextLine();
                    boolean saqueencontrado = false;
                    for (int i = 0; i < quantidadeclientes; i++) {
                        if (nomes[i].equals(nomesaque)) {
                            System.out.print("Digite o valor a ser sacado: R$ ");
                            double valorsaque = ler.nextDouble();
                            if (saldos[i] >= valorsaque) {
                                saldos[i] -= valorsaque;
                                System.out.println("Saque realizado com sucesso!");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            saqueencontrado = true;
                            break;
                        }
                    }
                    if (!saqueencontrado) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Informe o nome do cliente: ");
                    String nomeconsulta = ler.nextLine();
                    boolean consultaencontrada = false;
                    for (int i = 0; i < quantidadeclientes; i++) {
                        if (nomes[i].equals(nomeconsulta)) {
                            System.out.println("Saldo de " + nomes[i] + ": R$ " + saldos[i]);
                            consultaencontrada = true;
                            break;
                        }
                    }
                    if (!consultaencontrada) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    ler.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}