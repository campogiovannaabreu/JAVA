/*
 14-Escreva um programa que exiba 10 vezes a mensagem “Eu gosto de estudar Algoritmos!”.
*/
import java.util.Scanner;
public class Ex14
{
    public static void main (String []args){
        Scanner ler = new Scanner (System.in);
        int al;
        System.out.println("Escreva eu gosto de estudar algoritmos");
        al = ler.nextInt();
        
        for (int i = 1; i<=10; i++){
            System.out.println ("Eu gosto de estudar algoritmos:" + i);
        }
    }
}
