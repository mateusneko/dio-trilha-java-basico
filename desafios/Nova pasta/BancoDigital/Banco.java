public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso!");
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public Conta buscarConta(String agencia, String numero) {
        for (Conta conta : contas) {
            if (agencia.equals(conta.getAgencia()) && conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }
}
