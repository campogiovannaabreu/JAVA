/*
Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
*/
import java.util.Scanner;
public class Ex13

{
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int largura, comprimento, a;
        
        
        System.out.println("Infome a largura: ");
        largura=ler.nextInt();
        
         System.out.println("Infome o comprimento: ");
        comprimento=ler.nextInt();
        
        a=largura*comprimento;
        
       if (a<100)
    System.out.println("O terreno é popular, e a area é de " +a+ " m2");
    
     else if (a>=100 && a<=500)
    System.out.println("O terreno é master, e a area é de " +a+ " m2");
    
     else  
    System.out.println("O terreno é vip, e a area é de " +a+ " m2");
     }
}



        
     
      
      
     
     