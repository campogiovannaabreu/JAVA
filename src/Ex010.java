import java.util.ArrayList;
import java.util.Scanner;
public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        while (true) {
            System.out.println("1-Adicionar 2-Remover 3-Listar 4-Sair");
            int opc = Integer.parseInt(sc.nextLine());
            if (opc == 1) tarefas.add(sc.nextLine());
            else if (opc == 2) tarefas.remove(sc.nextLine());
            else if (opc == 3) tarefas.forEach(System.out::println);
            else break;
        }
    }
}
