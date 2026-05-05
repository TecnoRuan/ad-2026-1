import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Média: " + aluno.calcularMedia());
        aluno.verificarSituacao();
    }
}
