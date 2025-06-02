/*
Desenvolver o jogo da velha seguindo as etapas:
a) Inserir o nome dos dois jogadores sendo: 
      X para o jogador 1;
      O para o jogador2 ;

b) Pedir para o jogador 1 começar o jogo, assim ele deverá inserir as posições dentro da matriz. Ex.
     Digite a posição(linha);
     Digite a posição(coluna);

c) Mostrar se já existe uma posição preenchida e retornar a jogada

d) Verificar e exibir o nome do vencedor
*/
import java.util.Scanner;
public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] jogoOG = new String[3][3];
        String jogada;
        String jogada2;
        String nomex = " ", nomeo = " ";
        int linhaJogador, colunaJogador;
        int contador = 0;
        boolean vitoria = false;


        System.out.println("Insira o nome do jogador X: ");
        nomex = scan.nextLine();
        System.out.println("Insira o nome do jogador O: ");
        nomeo = scan.nextLine();

        System.out.println("JOGO DA VELHA:");


        for(int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++ ){
                jogoOG[linha][coluna] = "( )";
            }
        }

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print((jogoOG[linha][coluna]));
            }
            System.out.println();
        }

        while(vitoria == false){
            System.out.println("Tabuleiro: ");

            System.out.println("Qual linha o jogador x deseja preencher?");

            linhaJogador = scan.nextInt();

            System.out.println("Qual coluna o jogador x deseja preencher?");

            colunaJogador = scan.nextInt();

            scan.nextLine();

            System.out.println("Digite x para confirmar a escolha:");

            jogada = scan.nextLine();


            if(jogoOG[linhaJogador][colunaJogador].equals("( )")) {
                contador++;
                jogoOG[linhaJogador][colunaJogador] = "(X)";
                for (int linha = 0; linha < 3; linha++) {
                    for (int coluna = 0; coluna < 3; coluna++) {
                        System.out.print((jogoOG[linha][coluna]));
                    }
                    System.out.println();
                }

            } else {

                System.out.println("Posição ocupada!");
            }

            for (int i = 0; i < 3; i++) {
                if ((jogoOG[i][0].equals("(X)") && jogoOG[i][1].equals("(X)") && jogoOG[i][2].equals("(X)")) ||
                        (jogoOG[0][i].equals("(X)") && jogoOG[1][i].equals("(X)") && jogoOG[2][i].equals("(X)"))) {
                    vitoria = true;
                    break;
                }
            }
            if ((jogoOG[0][0].equals("(X)") && jogoOG[1][1].equals("(X)") && jogoOG[2][2].equals("(X)")) ||
                    (jogoOG[0][2].equals("(X)") && jogoOG[1][1].equals("(X)") && jogoOG[2][0].equals("(X)"))) {
                vitoria = true;
            }

            if (vitoria) {
                System.out.println("Jogador X (" + nomex + ") venceu!");
                break;
            }

            if (contador == 9) {
                System.out.println("Empate! Não houve ganhador.");
                break;
            }


            System.out.println("Qual linha o jogador o deseja preencher?");

            linhaJogador = scan.nextInt();

            System.out.println("Qual coluna o jogador o deseja preencher?");

            colunaJogador = scan.nextInt();

            scan.nextLine();

            System.out.println("Digite o para confirmar a escolha:");

            jogada2 = scan.nextLine();



            if(jogoOG[linhaJogador][colunaJogador].equals("( )")) {
            contador++;
                jogoOG[linhaJogador][colunaJogador] = "(O)";

                for (int linha = 0; linha < 3; linha++) {
                    for (int coluna = 0; coluna < 3; coluna++) {
                        System.out.print((jogoOG[linha][coluna]));
                    }
                    System.out.println();
                }

            } else {

                System.out.println("Posição ocupada!");
            }

            for (int i = 0; i < 3; i++) {
                if ((jogoOG[i][0].equals("(O)") && jogoOG[i][1].equals("(O)") && jogoOG[i][2].equals("(O)")) ||
                        (jogoOG[0][i].equals("(O)") && jogoOG[1][i].equals("(O)") && jogoOG[2][i].equals("(O)"))) {
                    vitoria = true;
                    break;
                }
            }
            if ((jogoOG[0][0].equals("(O)") && jogoOG[1][1].equals("(O)") && jogoOG[2][2].equals("(O)")) ||
                    (jogoOG[0][2].equals("(O)") && jogoOG[1][1].equals("(O)") && jogoOG[2][0].equals("(O)"))) {
                vitoria = true;
            }

            if (vitoria) {
                System.out.println("Jogador O (" + nomeo + ") venceu!");
                break;
            }
            
            if (contador == 8 & !vitoria){
                System.out.println("EMPATE");
                break;
            }
        }
    }
}

