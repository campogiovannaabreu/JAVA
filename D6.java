/*
Faça um programa em Java para resolver a equação de 2º grau.        
    Pedir para o usuário entrar com as variáveis A, B e C .
    Mostrar o valor de x1, x2 e delta.
       
      Usar a biblioteca:
      import java.lang.Math;
      Usar o "Math.sqrt" para encontrar a raiz quadrada. Ex.: raiz = Math.sqrt(9); // = 3
      Usar o "Math.pow" para fazer a potenciação Ex.: potencia= Math.pow(5,2); // = 25
      Usar double se resultar em números decimais
*/
import java.util.Scanner;

public class D6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o coeficiente A: ");
        double A = ler.nextDouble();
        System.out.print("Digite o coeficiente B: ");
        double B = ler.nextDouble();
        System.out.print("Digite o coeficiente C: ");
        double C = ler.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;

        System.out.printf("Delta (Δ) = %.2f%n", delta);

       
        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
           
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("x1 = %.2f%n", x1);
            System.out.printf("x2 = %.2f%n", x2);
        };
    }
}
