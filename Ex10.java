/*
10. Construa um algoritmo que determine
quanto será gasto para encher o tanque de um carro (VG), sabendo-se que o preço
da gasolina é de R$ 1,80 e o preço do álcool é de R$ 1,00. O usuário fornecerá
os seguintes dados: Tipo de carro (TC) (G – gasolina ou A – álcool) e
Capacidade do tanque (CT), em litros
*/
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços dos combustíveis
        final double precog = 1.80;
        final double precoa = 1.00;

        // Solicitar o tipo de carro e a capacidade do tanque
        System.out.print("Informe o tipo de carro (G para gasolina, A para álcool): ");
        char tipoCarro = scanner.next().charAt(0);

        System.out.print("Informe a capacidade do tanque em litros: ");
        double capacidadet = scanner.nextDouble();

        double Gasto = 0;

        // Calcular o valor gasto com base no tipo de combustível
        if (tipoCarro == 'G' || tipoCarro == 'g') {
            Gasto = capacidadet * precog;
            System.out.printf("O custo para encher o tanque com gasolina é: R$ %.2f%n", Gasto);
        } else if (tipoCarro == 'A' || tipoCarro == 'a') {
            Gasto = capacidadet * precoa;
            System.out.printf("O custo para encher o tanque com álcool é: R$ %.2f%n", Gasto);
        } else {
            System.out.println("Tipo de carro inválido. Use 'G' para gasolina ou 'A' para álcool.");
        }

        scanner.close();
    }
}