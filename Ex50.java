/*
 Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma compra no final mostre o valor gasto e o imposto.
a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
b) Mostrar os valores finais com e sem imposto.
*/
import java.util.Scanner;
public class Ex50
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[] valor = new double[10];
		double s = 0;
		
		
		System.out.println("Informe os valores da sua compra: ");
		for (int i = 0; i < 10; i++) {
		    System.out.println("Elemento " + (i+1) + ": ");
		    valor[i] = ler.nextDouble();
		    s += valor[i];
		}
		System.out.println("O total gasto será de: " + s);
		
		double totalgasto;
		double imposto;
        if (s > 1200) {
            imposto = s * 0.025; 
            totalgasto = s + imposto;
            System.out.println("Com os impostos, o valor a ser pago será: " + totalgasto);
        } else {
            imposto = s * 0.008;
            totalgasto = s + imposto;
            System.out.println("Com os impostos, o valor a ser pago será: " + totalgasto);
        }
        
	}
}