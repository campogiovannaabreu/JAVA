/*
Desenvolver um programa com  Ao iniciar o programa, exiba o seguinte menu de opções:
--- Calculadora de Áreas --- 
1. Calcular Área do Retângulo 
2. Calcular Área do Triângulo 
3. Calcular Área do Círculo 
0. Sair 
-- Escolha uma opção:
*/

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("--- Calculadora de Áreas ---");
            System.out.println("1. Calcular Área do Retângulo");
            System.out.println("2. Calcular Área do Triângulo");
            System.out.println("3. Calcular Área do Círculo");
            System.out.println("0. Sair");
            System.out.print("-- Escolha uma opção: ");
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a base do retângulo: ");
                    double base = ler.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = ler.nextDouble();
                    double arearetangulo = base * altura;
                    System.out.printf("Área do Retângulo: %.2f%n", arearetangulo);
                    break;
                
                case 2:
                    System.out.print("Digite a base do triângulo: ");
                    double basetriangulo = ler.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturatriangulo = ler.nextDouble();
                    double areatriangulo = (basetriangulo * alturatriangulo) / 2;
                    System.out.printf("Área do Triângulo: %.2f%n", areatriangulo);
                    break;
                
                case 3:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = ler.nextDouble();
                    double areacirculo = Math.PI * raio * raio;
                    System.out.printf("Área do Círculo: %.2f%n", areacirculo);
                    break;
                
                case 0:
                    System.out.println("Saindo...");
                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
