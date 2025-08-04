package src;

import java.util.ArrayList;

public class Ex09 {

    public static void main(String[] args) {
        //Criando um ArrayList de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);//Adicionar elementos
        numeros.add(20);

        System.out.println(numeros.get(0));//Saída:10
        System.out.println(numeros.get(1));//Saída:20

        numeros.set(1,25);
        System.out.println(numeros.get(1));//Saída:25 //Modificando um elemento

        numeros.remove(0);
        System.out.println(numeros.get (0));//Saída:25//Removendo um elemento

        System.out.println(numeros.size());//Saída:2//Obtendo o tamanho do Array
    }
}

