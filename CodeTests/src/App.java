import java.util.Scanner;

public class App {
    public static double saldo;
    public static double saque;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double saldo = 200.0;
        System.out.println("Seu saldo é de R$ " + saldo);
        System.out.println("Digite agora o valor do saque ");

        saque = scanner.nextDouble();
        scanner.close();
        if (saque < saldo) {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso! Seu novo saldo é de R$ " + saldo);

        } else {
            double falta;
            falta = saldo - saque;
            System.out.println("Saldo insuficitente falta R$ " + falta + " para o saque! ");

        }

    }
}
