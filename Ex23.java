/*
23)  Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas. Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos. 
*/
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma1a10 = 0, soma11a20 = 0, soma21a30 = 0, somam31 = 0;
        int count1a10 = 0, count11a20 = 0, count21a30 = 0, countm31 = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite a idade: ");
            int idade = ler.nextInt();
            System.out.print("Digite o peso: ");
            double peso = ler.nextDouble();

            if (idade >= 1 && idade <= 10) {
                soma1a10 += peso;
                count1a10++;
            } else if (idade >= 11 && idade <= 20) {
                soma11a20 += peso;
                count11a20++;
            } else if (idade >= 21 && idade <= 30) {
                soma21a30 += peso;
                count21a30++;
            } else if (idade > 31) {
                somam31 += peso;
                countm31++;
            }
        }

        if (count1a10 > 0) {
            System.out.println("Média dos pesos (1 a 10 anos): " + (soma1a10 / count1a10));
        }
        if (count11a20 > 0) {
            System.out.println("Média dos pesos (11 a 20 anos): " + (soma11a20 / count11a20));
        }
        if (count21a30 > 0) {
            System.out.println("Média dos pesos (21 a 30 anos): " + (soma21a30 / count21a30));
        }
        if (countm31 > 0) {
            System.out.println("Média dos pesos (acima de 31 anos): " + (somam31 / countm31));
        }
    }
}