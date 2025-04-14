/*
Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar. Calcule o valor final com juros compostos de 2% ao mês. Mostre o valor final e o valor de cada parcela. Permita simular vários empréstimos.
*/
import java.util.Scanner;

public class D5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double taxajuros = 0.02;

        while (true) {
            System.out.print("Informe o valor do empréstimo (ou digite -1 para sair): R$ ");
            double vemprestimo = ler.nextDouble();

            if (vemprestimo == -1) {
                break;
            }

            System.out.print("Informe o número de parcelas: ");
            int quantidadeparcelas = ler.nextInt();

            double valorfinal = vemprestimo * Math.pow(1 + taxajuros, quantidadeparcelas);
            double quantidadeparcela = valorfinal / quantidadeparcelas;

           
            System.out.printf("Valor final a ser pago: R$ %.2f%n", valorfinal);
            System.out.printf("Valor de cada parcela: R$ %.2f%n", quantidadeparcela);
            System.out.println(); 
        }

        System.out.println("Simulação encerrada.");
    }
}
