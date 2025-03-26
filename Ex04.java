/*
A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.
*/
import java.util.Scanner; //Ler as entradas do teclado
public class Ex04
{
    public static void main(String[] args){
    Scanner ler = new Scanner (System.in);
    Double salario, st1, st2;
    int a;
    
    //Entrada de dados
    System.out.println("Informe o salário");
    salario=ler.nextDouble();
    System.out.println("Informe quantos anos trabalha na empresa");
    a=ler.nextInt();
    
    st1 = salario * 1.20;
    st2= salario * 1.10;

   //Processamento
  if (a>=5)
        System.out.println("O salário é de: " + st2);
         
         if (a<=5)
        System.out.println("O salário é de: " + st1);
    }
}