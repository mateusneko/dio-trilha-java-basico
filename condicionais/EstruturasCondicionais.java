import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
       //SwitchAse();
       Ternario();
    }

   static void SwitchAse(){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um tamanho P, M ou G");
        String tamanho  = scanner.next().toUpperCase();
        scanner.close();
        switch (tamanho) {
            case "P":
                System.out.println("Você Escolheu o tamnaho " + tamanho);
                break;
                case "M":
                System.out.println("Você Escolheu o tamnaho " + tamanho);
                break;
                case "G":
                System.out.println("Você Escolheu o tamnaho " + tamanho);
                break;
            default:
            System.out.println("Inválido");
                break;
        }
    }
    static void Ternario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10: ");
        int nota = scanner.nextInt();
        scanner.close();
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
