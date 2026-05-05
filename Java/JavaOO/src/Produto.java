public class Produto {
    String nome;
    double preco;
    int quantidade;
    public double calcularValorTotal() {
        return preco * quantidade;
    }
    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: R$" + calcularValorTotal());
        System.out.println("---------------------------");
    }
}