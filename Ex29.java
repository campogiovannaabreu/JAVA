/*
Escreva um programa que pergunte ao usuário quantos alunos ele
tem em sua academia. Em seguida, através de um laço while, o usuário
digita o peso de todos os alunos, um por vez, e por fim, o programa deve
mostrar a média de peso dos clientes.
*/
import java.util.Scanner;
public class Ex29
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Quantos alunos você tem na academia? ");
        int alunos = scanner.nextInt();
        
        double sp = 0;
        int contador = 0;
        
        while (contador < alunos) {
            System.out.print("Digite o peso do aluno " + (contador + 1) + ": ");
            double peso = scanner.nextDouble();
            sp += peso;
            contador++;
        }
             double mediaPeso = sp / alunos;
              System.out.println("A média de peso dos alunos é: " + mediaPeso);
	}
}