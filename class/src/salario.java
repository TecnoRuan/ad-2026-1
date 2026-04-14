import java.util.Scanner;
public class salario {
    public static void main(String[] args) {
        String nomevendedor;
        float salariofixo, valorvendas, salariototal;

        Scanner receberdados = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        nomevendedor = receberdados.next();
        System.out.println("Digite o salário mensal: ");
        salariofixo = Float.parseFloat(receberdados.next());
        System.out.println("Digite o valor das vendas do mês: ");
        valorvendas = Float.parseFloat(receberdados.next());
        salariototal = (float) (salariofixo + (valorvendas * 0.15));
        System.out.println("Nome do vendedor é:" + nomevendedor);
        System.out.println("Salario sem comissao é: " + salariofixo);
        System.out.println("Salario com comissao: " + salariototal);
    }
}
