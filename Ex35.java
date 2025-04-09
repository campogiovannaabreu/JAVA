/*
Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor total da compra e após escolha a forma de pagamento:
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.
 2 - À Vista no cartão de crédito, recebe 3% de desconto.
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.
 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.
 - Montar um menu com os itens acima para o usuário escolher a forma de pagamento e mostrar a lista dos produtos comprados e o valor a ser pago.
*/
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] precos = new double[10];
        String[] nomes = new String[10];
        double totalcompra = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            nomes[i] = ler.nextLine();

            System.out.print("Digite o valor do produto " + (i + 1) + ": R$ ");
            precos[i] = ler.nextDouble();
            ler.nextLine(); 

            totalcompra += precos[i];
        }

        System.out.println("Produtos comprados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i] + " - R$ " + precos[i]);
        }
        System.out.println("Valor total da compra: R$ " + totalcompra);

        int oppagamento;
        double valortotal;

        while (true) {
            System.out.println("\nEscolha a forma de pagamento:");
            System.out.println("1 - À Vista em Dinheiro ou Pix (8% de desconto)");
            System.out.println("2 - À Vista no Cartão de Crédito (3% de desconto)");
            System.out.println("3 - Parcelado em 2 vezes (sem juros)");
            System.out.println("4 - Parcelado em 3 vezes ou mais (10% de juros)");
            System.out.print("Opção: ");
            oppagamento = ler.nextInt();

            if (oppagamento == 1) {
                valortotal = totalcompra * 0.92; 
                break;
            } else if (oppagamento == 2) {
                valortotal = totalcompra * 0.97; 
                break;
            } else if (oppagamento == 3) {
                valortotal = totalcompra; 
                break;
            } else if (oppagamento == 4) {
                valortotal = totalcompra * 1.10; 
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("Forma de pagamento escolhida: " + (oppagamento == 1 ? "À Vista em Dinheiro ou Pix" :
                oppagamento == 2 ? "À Vista no Cartão de Crédito" :
                oppagamento == 3 ? "Parcelado em 2 vezes" :
                "Parcelado em 3 vezes ou mais"));
        System.out.println("Valor a ser pago: R$ " + valortotal);

        ler.close();
    }
}
