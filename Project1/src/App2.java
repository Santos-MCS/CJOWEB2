import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1 = 5, number2 = 2, sum;
        
        System.out.println("Digite um número: ");
        number1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        number2 =  scanner.nextInt();
        sum  = number1 + number2;
        System.out.println("Soma = " + sum);
        scanner.close();
    }
}
