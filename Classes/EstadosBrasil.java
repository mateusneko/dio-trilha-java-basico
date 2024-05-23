public enum EstadosBrasil {
    ALAGOAS("Alagoas", "Maceió", "AL"),
    PERNAMBUCO("Pernambuco", "Recife", "PE"),
    PIAUI("Piauí", "Teresina", "PI"),
    MARANHAO("Maranhão", "São Luís", "MA");

    private String nome;
    private String sigla;
    private String capital;

    private EstadosBrasil(String nome, String capital, String sigla) {
        this.nome = nome;
        this.capital = capital;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla.toUpperCase();
    }

    public String getNome() {
        return nome;
    }
    public String getCapital(){
        return capital;
    }
    

    static void ListarEstados() {
        for (EstadosBrasil uf : EstadosBrasil.values()) {
            System.out.println( uf.getCapital() +", "+ uf.getNome()+ "-" + uf.getSigla());
        }

        // selecionando um estado a partir das opções disponíveis
        EstadosBrasil ufSelecionado = EstadosBrasil.ALAGOAS;

        System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
    }

    public static void main(String[] args) {
        ListarEstados();
    }
}
