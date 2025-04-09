/*
 Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.

*/
import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite a quantidade de cavalos: ");
        int numerocavalos = ler.nextInt();
        
        
        int quantferradurascavalo = 4;
        int totalferraduras = numerocavalos * quantferradurascavalo;
        
        
        System.out.println("Total de ferraduras necessárias: " + totalferraduras);
        
       
    }
}