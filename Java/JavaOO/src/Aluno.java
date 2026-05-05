public class Aluno {
    String nome;
    double nota1;
    double nota2;
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
    public void verificarSituacao() {
        if (calcularMedia() >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
