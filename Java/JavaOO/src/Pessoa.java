public class Pessoa {

    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void fazerAniversario() {
        idade = idade + 1;
        System.out.println("Feliz aniversário!! Agora você tem " + idade + " anos.");
    }
}
