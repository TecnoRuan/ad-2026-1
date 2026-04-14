import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        float celsius,fahrenheit;
        Scanner lerfloat = new Scanner(System.in);
        System.out.println("Quantos graus celsius? ");
        celsius = lerfloat.nextFloat();
        fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em fahrenheit é: "+fahrenheit);

    }
}
