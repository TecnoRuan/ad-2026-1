import java.util.Scanner;

public class rendimento {
    public static void main(String[] args) {
        float depositado,juros;
        Scanner lerfloat = new Scanner(System.in);
        System.out.println("Qual o valor depositado? ");
        depositado = lerfloat.nextFloat();
        juros = (float) (depositado + depositado*0.07);
        System.out.println("Valor com juros de rendimento: "+juros);
    }
}
