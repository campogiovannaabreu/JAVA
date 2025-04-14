/*
Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0. O programa deve validar se o voto é válido (1, 2, 3) e exibir ao final a quantidade de votos por candidato e o vencedor. Empates devem ser considerados.
*/
import java.util.Scanner;
public class D1
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int chaysuede = 0, alexandrenero = 0, pedronovaes = 0, opção = 0;
		do {
		    System.out.println("1 - Chay Suede");
		    System.out.println("2 - Alexandre Nero");
		    System.out.println("3 - Pedro Novaes");
		    System.out.println("0 - Sair");
		    System.out.println("Escolha um candidato: ");
		    opção = ler.nextInt();
		    
	     switch (opção) {
                case 1:
                    chaysuede++;
                    break;
                case 2:
                    alexandrenero++;
                    break;
                case 3:
                    pedronovaes++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Voto inválido! Você só pode votar vote em 1, 2 ou 3.");
	     }
		} while (opção != 0);
		
		System.out.println("Resultado da votação: ");
		System.out.println("O Chay Suede teve" + chaysuede + "votos: ");
	    System.out.println("O Alexandre Nero teve" + alexandrenero + "votos: ");
        System.out.println("O Pedro Novaes teve" + pedronovaes + "votos: ");
        
        if (chaysuede > alexandrenero && chaysuede > pedronovaes) {
           System.out.println("Chay Suede é o vencedor!"); }
           else if (alexandrenero > chaysuede && alexandrenero > pedronovaes){
           System.out.println("Alexandre Nero é o vencedor!"); }
           else if (pedronovaes > alexandrenero && pedronovaes > chaysuede) {
           System.out.println("Pedro Novaes é o vencedor!"); }
           else if (alexandrenero == chaysuede  && chaysuede == pedronovaes) {
           System.out.println("Vamos para o segundo turno"); }
           else {
            System.out.println("Houve um empate entre os candidatos."); }
	}
}
