/*
A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra. 
*/
import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao = 0, qsand, qqueijo, qpresunto, qcarne, x = 1000;


        System.out.println("Entre com a quantidade de sanduíches que deseja fazer:");
        qsand = ler.nextInt();



        while (opcao != 5){

        System.out.println("\nEntre com uma opção:\n1)Checar a quantidade de queijo nescessária;\n2)Cehcar a quantidade de presunto nescessária;\n3)Checar a quantidade de carne nescessária;\n4) Preparar lanche.");
        opcao = ler.nextInt();

        switch(opcao) {
            case 1:
                qqueijo = 50*qsand;
                if(qqueijo >= x) {
                    x = qqueijo / 1000;
                    qqueijo = x;
                    System.out.println("Para preparar " + qsand + " sanduíches será nescessário " + qqueijo + " KG de queijo.");
                } else
                    System.out.println("Para preparar " + qsand + " sanduíches será nescessário " + qqueijo + " gramas de queijo.");
                break;

            case 2:
                qpresunto = 50*qsand;
                if(qpresunto >= x) {
                    x = qpresunto / 1000;
                    qpresunto = x;
                    System.out.println("Para preparar " + qsand + " sanduíches será nescessário " + qpresunto + " KG de presunto.");
                } else
                    System.out.println("Para preparar " + qsand + " sanduíches será nescessário " + qpresunto + " gramas de presunto.");
                break;

            case 3:
                qcarne = 100*qsand;
                if(qcarne >= x) {
                    x = qcarne / 1000;
                    qcarne = x;
                    System.out.println("Para preparar " + qsand + " sanduíches será nescessário " + qcarne + " KG de carne.");
                } else
                    System.out.println("Para preparar " + qsand + " sanduíches será nescessário " + qcarne + " gramas de carne.");
                break;

                case 4:
                System.out.println("Preparar lanche!");
                break;
            default:
                System.out.println("ERRO.");
                break;


            }
        }
    }
}