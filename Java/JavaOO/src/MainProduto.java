import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        System.out.println("Produto 1");
        System.out.print("Nome: ");
        p1.nome = sc.nextLine();

        System.out.print("Preço: ");
        p1.preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        p1.quantidade = sc.nextInt();
        sc.nextLine();
        System.out.println("Produto 2");
        System.out.print("Nome: ");
        p2.nome = sc.nextLine();

        System.out.print("Preço: ");
        p2.preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        p2.quantidade = sc.nextInt();
        System.out.println("Dados dos Produtos");
        p1.exibirProduto();
        p2.exibirProduto();
    }
}

