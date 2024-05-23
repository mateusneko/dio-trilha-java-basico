public class MinhaClasse {
    // Seguindo as convenções de Java, nomes de classes iniciam com letras
    // minúsculas
    private String nome;
    private int idade;
    private String profissao;

    // Constructor - O nome deve ser igual ao da classe.
    public MinhaClasse(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Métodos Get
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }

    // Método Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        MinhaClasse teste = new MinhaClasse("Mateus", 25, "Engenheiro");
        // teste.setNome("João");
        System.out.println(teste.getNome() + ", " + teste.getIdade() + " anos, profissão " + teste.getProfissao());
    }
}
