
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Ex006 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) numeros.add(rand.nextInt(100) + 1);
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
