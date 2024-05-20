import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criar o Scanner
        Scanner scanner = new Scanner(System.in);
        //Exibir mensagem no terminal para digitar a agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        //Exibir mensagem no terminal para digitar o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        //Digitaremos um nome aleatório
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        //Digitaremos um valor aleatório
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Encerramos o scanner
        scanner.close();

        // Exibição da mensagem de confirmação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
