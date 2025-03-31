/*
16) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
*/
import java.util.Scanner;
public class Ex16
{
	public static void main (String []args){
        Scanner ler = new Scanner (System.in);
        String nome;
        System.out.println("Leia o nome do usuario");
        nome = ler.nextLine();
        
        for (int i = 1; i<=10; i++){
            System.out.println ("Escreva o nome do usuario:" + nome);
        }
    }
}
