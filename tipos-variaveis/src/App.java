import java.util.Locale;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {

       ContaTeste();
    

    }
    static void ContaTeste(){
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();
        System.out.println("Digite um valor inicial para ser o saldo de sua conta:");
        conta.saldo = scanner.nextFloat();
        conta.imprimirSaldo();
       // System.out.println("Seu novo saldo é: " + conta.saldo);

        System.out.println("Digite agora o valor que você gostaria de sacar:");
        double saque = scanner.nextFloat();
        conta.sacar(saque);
        }
}
