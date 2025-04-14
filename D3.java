/*
Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:
Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
-Quando o usuário digitar -1, o programa termina e exibe a média geral e a contagem de cada classificação.
*/
 import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double somarnotas = 0;
        int contarnotas = 0;
        int excelente = 0;
        int bom = 0;
        int regular = 0;
        int insuficiente = 0;

        while (true) {
            System.out.print("Digite uma nota entre 0 e 10 (ou -1 para sair): ");
            double nota = ler.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
                continue;
            }
            
            somarnotas += nota;
            contarnotas++;

            
            if (nota >= 9) {
                excelente++;
            } else if (nota >= 7) {
                bom++;
            } else if (nota >= 5) {
                regular++;
            } else {
                insuficiente++;
            }
        }


        double media = (contarnotas > 0) ? (somarnotas / contarnotas) : 0;

       
        System.out.println("Resultados:");
        System.out.println("Média geral: " + media);
        System.out.println("Total de notas cadastradas: " + contarnotas);
        System.out.println("----- Classificações -----");
        System.out.println("Excelente: " + excelente);
        System.out.println("Bom: " + bom);
        System.out.println("Regular: " + regular);
        System.out.println("Insuficiente: " + insuficiente);
    }
}