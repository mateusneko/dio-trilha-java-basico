    import java.util.Scanner;
//https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/controle-fluxo/README.md
    public class Contador {
        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            
            }catch (Exception exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            }
            
        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
        }
    }