class BancoDigital {
    public static void main(String[] args) {
        ContaCorrente corrente1 = new ContaCorrente("001", "12345", "Fulano");
        ContaPoupanca poupanca1 = new ContaPoupanca("001", "54321", "Ciclano");

        corrente1.depositar(1000);
        corrente1.sacar(200);
        corrente1.transferir(poupanca1, 300);

        poupanca1.depositar(500);
        poupanca1.sacar(100);

        corrente1.verExtrato();
        poupanca1.verExtrato();
    }
}
