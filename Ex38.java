/*
 A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.
*/
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numeropaes, numerobroas, total;
        double paes = 0.12;
        double broa = 1.50;
        
        System.out.println("Quantos pães foram vendidos hoje?: ");
        numeropaes = ler.nextDouble();
        System.out.println("Quantas broas foram vendidas hoje?: ");
        numerobroas = ler.nextDouble();
        total = (numeropaes * 0.12) + (numerobroas * 1.50);
        System.out.println("Foram vendidos no total: " + total);
        
     
    }
}
        
