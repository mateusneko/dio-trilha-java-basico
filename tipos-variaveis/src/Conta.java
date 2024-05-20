public class Conta {
    public double saldo;

    /**
     * @param valor
     */
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            imprimirSaldo();
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + ".");            
        }
    }

    public void imprimirSaldo() {
        System.out.println("Seu novo saldo é de R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
