/*
 mês. Calcule e mostrExercicio 005
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas noe o total do seu salário no referido mês.
*/
import java.util.Scanner;
public class Ex005{
    public static void main(String[]args) {
        int porhora, horatrabalhada, totalmes;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe quanto ganha por hora:");
        porhora = ler.nextInt();
        
        System.out.println("Informe quantas horas foram trabalhadas no mês:");
        horatrabalhada = ler.nextInt();
        totalmes = (porhora*horatrabalhada);
         
        System.out.println("O total do salário no mês será de:" +totalmes);
    }
}