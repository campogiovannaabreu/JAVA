/*
8. Construa um algoritmo que, tendo como
dados de entrada a altura (H) e o sexo (S) de uma pessoa calcule e apresente
seu peso ideal utilizando as seguintes fórmulas: Para homens: Peso ideal (P) =
(72,7 * H) – 58 Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7
*/
import java.util.Scanner;
public class Ex08

{
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int hm, ml, sexo; 
        Double ph, pm, h;
        
        System.out.println("Infome o sexo da pessoa, 1 para homem e 2 para mulher: ");
        sexo=ler.nextInt();
        
        System.out.println("Infome a altura em metros: ");
        h=ler.nextDouble(); 
       
      ph= (71.7 * h)-58;
      pm= (62.1 * h)-44.7;
       
       if (sexo==1)
        System.out.println("O peso ideal é: " + ph);
      if (sexo==2);
      System.out.println("O peso ideal é: " + pm);
     
     }
     
}