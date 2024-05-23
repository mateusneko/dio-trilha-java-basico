// Conta.java
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
    private String numeroAgencia;
    private String numeroConta;
    private String nomeTitular;
    private double saldo;
    private List<String> extrato;

    public Conta(String numeroAgencia, String numeroConta, String nomeTitular) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
    }

    public void depositar(double valor) {
        saldo += valor;
        extrato.add("+" + valor + " DEPÓSITO em " + new Date() + ". Saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            extrato.add("-" + valor + " SAQUE em " + new Date() + ". Saldo: " + saldo);
        } else {
            extrato.add("SAQUE de " + valor + " REJEITADO em " + new Date() + ". Saldo insuficiente.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            extrato.add("-" + valor + " TRANSFERÊNCIA para conta " + destino.numeroConta + " em " + new Date() + ". Saldo: " + saldo);
        } else {
            extrato.add("TRANSFERÊNCIA de " + valor + " para conta " + destino.numeroConta + " REJEITADA em " + new Date() + ". Saldo insuficiente.");
        }
    }

    public void verExtrato() {
        System.out.println("Extrato da conta " + numeroConta);
        for (String operacao : extrato) {
            System.out.println(operacao);
        }
    }
}
