/*
Exercicio 007
Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
*/
import java.util.Scanner;
public class Ex007{
 
    static public void main (String[]args){
    double altura, pesoideal;
    Scanner ler = new Scanner (System.in);
    
    System.out.println("Informe sua altura:");
    altura = ler.nextDouble();
    pesoideal = (72.7*altura)-58;
    
    System.out.println("Informe o peso ideial para a pessoa:" + pesoideal);
    
    }
    }
    