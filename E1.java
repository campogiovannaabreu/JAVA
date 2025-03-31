/*
Tabuada- Desenvolver um programa de tabuada.
*/
import java.util.Scanner;
public class E1
{
    public static void main (String []args){
        Scanner ler = new Scanner (System.in);
        int t, resultado;
        System.out.println("Entre com a tabuada:");
        t = ler.nextInt();
        for (int i = 1; i<=10; i++){
            resultado = t * i;
            System.out.println (t + " X " + i + " = " + resultado);
        }
    }
}