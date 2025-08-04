import java.util.ArrayList;
import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        String[] disciplinas = {"Matemática","Filosofia","História","Física"};
        ArrayList <String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
        novaLista.add("Geografia");
        novaLista.add("Língua Inglesa");

        for(String i: novaLista)
        {
            System.out.println("Disciplina: "+i);
        }
    }
}