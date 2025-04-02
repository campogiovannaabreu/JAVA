/*
19) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
*/
import java.util.Scanner;

public class Ex19 {
    public static void main(String []args) {
        Scanner ler = new Scanner(System.in);
        String nome, nomenovo="";
        int idade = 0, idade1 = 200;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nome = ler.nextLine();
            System.out.print("Digite a idade da pessoa: ");
            idade = ler.nextInt();
            if (idade < idade1) {
                idade = idade1;
                nomenovo = nome;
                
            }
            ler.nextLine();
        }
        System.out.println("A pessoa mais nova é: " + nomenovo);
}
}