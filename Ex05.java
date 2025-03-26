/*
Ex-Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.
*/
import java.util.Scanner;
public class Ex05
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    Double valore,salario, valorp, lp;
	    int quantidadep;
	    
	    System.out.println("Informe o valor do empréstimo:");
	    valore = ler.nextDouble();
	    
	    System.out.println("Informe o valor das parcelas:");
	    quantidadep = ler.nextInt();
	    
	    System.out.println("Informe o valor do salário:");
	    salario = ler.nextDouble();
	    
	    valorp= valore/quantidadep;
	    lp=salario* 0.30;
	    
	    if (valorp <=lp)
        System.out.println("O empréstimo foi aprovado");
      else 
      System.out.println("O empréstimo não foi aprovado");
     
     }
     
}
	    
	    
	    
	    
	    
	    
	    
	    
	   