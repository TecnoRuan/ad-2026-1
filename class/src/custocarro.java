import java.util.Scanner;

public class custocarro {
    public static void main(String[] args) {
        float custofabrica,custoconsumidor,impostos,custocomimpostos;
        Scanner lerfloat = new Scanner(System.in);
        System.out.println("Informe o valor do veículo: ");
        custofabrica = lerfloat.nextFloat();
        impostos = (float) (custofabrica *(0.45));
        custocomimpostos = impostos + custofabrica;
        custoconsumidor = (float) (custocomimpostos + (custocomimpostos* 0.28));
        System.out.println("O custo final é: "+custoconsumidor);
    }
}
