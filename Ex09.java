/*
9. Construa um algoritmo para calcular o
valor a ser pago pelo período de estacionamento do automóvel (PAG). O usuário
entra com os seguintes dados: hora (HE) e minuto (ME) de entrada, hora (HS) e
minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou
seja, se passar um minuto ele cobra a hora inteira. O valor cobrado pelo
estacionamento é: •R$ 4,00 para 1 hora de estacionamento •R$ 6,00 para 2 horas
de estacionamento •R$ 1,00 por hora adicional (acima de 2 horas)
*/
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações de entrada e saída
        System.out.print("Hora de entrada (0-23): ");
        int horaEntrada = scanner.nextInt();

        System.out.print("Minuto de entrada (0-59): ");
        int minutoEntrada = scanner.nextInt();

        System.out.print("Hora de saída (0-23): ");
        int horaSaida = scanner.nextInt();

        System.out.print("Minuto de saída (0-59): ");
        int minutoSaida = scanner.nextInt();

        // Calcular total de tempo em minutos
        int minutosEntrada = horaEntrada * 60 + minutoEntrada;
        int minutosSaida = horaSaida * 60 + minutoSaida;
        int duracaoMinutos = minutosSaida - minutosEntrada;

        // Converter para horas considerando cobrança de hora cheia
        int duracaoHoras = (duracaoMinutos + 59) / 60; // Arredondar para hora cheia

        // Calcular valor a ser pago
        int valor = 0;
        if (duracaoHoras == 1) {
            valor = 4; // R$ 4,00 para 1 hora
        } else if (duracaoHoras == 2) {
            valor = 6; // R$ 6,00 para 2 horas
        } else if (duracaoHoras > 2) {
            valor = 6 + (duracaoHoras - 2); // R$ 6,00 + R$ 1,00 por hora adicional
        }

        // Exibir o valor total a ser pago
        System.out.println("Duração do estacionamento: " + duracaoHoras + " horas.");
        System.out.println("Valor a ser pago: R$" + valor);

        scanner.close();
    }
}