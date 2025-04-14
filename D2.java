/*
Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade (fácil: 1 a 10, médio: 1 a 50, difícil: 1 a 100). O programa gera um número aleatório(pesquisar) e o jogador tem 5 tentativas para acertar. A cada erro, o programa dá dicas: "maior" ou "menor".
*/
import java.util.Random;
import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Escolha a dificuldade:");
        System.out.println("1. Fácil (1 a 10)");
        System.out.println("2. Médio (1 a 50)");
        System.out.println("3. Difícil (1 a 100)");
        
        int dificuldade = ler.nextInt();
        int limite = 0;

        switch (dificuldade) {
            case 1:
                limite = 10;
                break;
            case 2:
                limite = 50;
                break;
            case 3:
                limite = 100;
                break;
            default:
                System.out.println("Dificuldade inválida.");
                return;
        }

        int numerosecreto = random.nextInt(limite) + 1;
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("Você tem " + tentativas + " tentativas para adivinhar o número entre 1 e " + limite + ".");

        while (tentativas > 0 && !acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = ler.nextInt();

            if (palpite < 1 || palpite > limite) {
                System.out.println("Por favor, escolha um número entre 1 e " + limite + ".");
                continue;
            }

            if (palpite == numerosecreto) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número: " + numerosecreto);
            } else {
                tentativas--;
                if (palpite < numerosecreto) {
                    System.out.println("Maior! Você ainda tem " + tentativas + " tentativas.");
                } else {
                    System.out.println("Menor! Você ainda tem " + tentativas + " tentativas.");
                }
            }
        }

        if (!acertou) {
            System.out.println("Você perdeu! O número era: " + numerosecreto);
        }
    }
}