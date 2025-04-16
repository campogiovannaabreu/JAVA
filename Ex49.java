/*
 Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.
*/
import java.util.Scanner;
public class Ex49
{
public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] v1 = new int[10];
		int[] v2 = new int[10];
		int[] somaV = new int[10];
		
		System.out.println("Digite 10 elementos inteiros para este vetor: ");
		for (int i = 0; i < 10; i++) {
		    System.out.println("Elemento " + (i+1) + ": ");
		    v1[i] = ler.nextInt();
		}
		System.out.println("Digite 10 elementos inteiros para este segundo vetor: ");
		for (int i = 0; i < 10; i++) {
		    System.out.println("Elemento " + (i+1) + ": ");
		    v2[i] = ler.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
            somaV[i] = v1[i] + v2[i];
		}
		System.out.println("A soma dos vetores é:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + somaV[i]);
        }
	}
}