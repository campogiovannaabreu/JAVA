/*
 Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.
*/

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Quantas camisetas pequenas foram vendidas? ");
        int camisetasP = ler.nextInt();
        
        System.out.print("Quantas camisetas médias foram vendidas? ");
        int camisetasM = ler.nextInt();
        
        System.out.print("Quantas camisetas grandes foram vendidas? ");
        int camisetasG = ler.nextInt();
        
        int precoP = 10;
        int precoM = 12;
        int precoG = 15;
        
        int valorarrecadado = (camisetasP * precoP) + (camisetasM * precoM) + (camisetasG * precoG);
        
        System.out.printf("Valor arrecadado é:" + valorarrecadado);
    }
}
