import java.util.ArrayList;
public class Ex003 {
    public static void main(String[] args) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 2; pares.size() < 20; i += 2) pares.add(i);
        pares.removeIf(n -> n % 4 == 0);
        System.out.println(pares);
    }
}
