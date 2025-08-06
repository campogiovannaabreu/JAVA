import java.util.ArrayList;
import java.util.Scanner;

public class Ex008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesProdutos = new ArrayList<>();
        ArrayList<Double> precosProdutos = new ArrayList<>();

        // Leitura dos produtos e preços
        while (true) {
            System.out.print("Digite o nome do produto (ou 'sair' para terminar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            nomesProdutos.add(nome);

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            precosProdutos.add(preco);
        }

        // Exibição dos produtos com preço acima de R$ 50,00
        System.out.println("\nProdutos com preço superior a R$ 50,00:");
        for (int i = 0; i < nomesProdutos.size(); i++) {
            if (precosProdutos.get(i) > 50.0) {
                System.out.println(nomesProdutos.get(i) + " - R$ " + precosProdutos.get(i));
            }
        }

        scanner.close();
    }
}