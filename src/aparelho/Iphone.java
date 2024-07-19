package aparelho;

import java.util.Scanner;

public class Iphone extends Dispositivo {
    private ReprodutorMusical reprodutorMusical;
    private Telefone telefone;
    private Navegador navegador;

    public Iphone(String modelo, String versaoOS,
            ReprodutorMusical reprodutorMusical, Telefone telefone, Navegador navegador) {
        super(modelo, versaoOS);
        this.reprodutorMusical = reprodutorMusical;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void fazerChamada(String numero) {
        telefone.fazerChamada(numero);
    }

    public void carregarPagina(String url) {
        navegador.carregarPagina(url);
    }

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical("faxa 1", 15);
        Telefone telefone = new Telefone();
        Navegador navegador = new Navegador();

        Iphone meuIphone = new Iphone("Iphone 1", "iOS 1.0", reprodutor, telefone, navegador);

        Scanner scanner = new Scanner(System.in);
        boolean running = false;
        System.out.println("Digite 1 para iniciar o dispositivo: ");
        int sn = scanner.nextInt();
        scanner.nextLine();
        if (sn == 1) {
            meuIphone.iniciar();
            running = true;
        } else {
            System.err.println("O dispositivo esta desligado");
        }
        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Tocar Música");
            System.out.println("2 - Fazer Chamada");
            System.out.println("3 - Carregar Página");
            System.out.println("4 - Desligar Dispositivo");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    meuIphone.tocarMusica();
                    break;
                case 2:
                    System.out.print("Digite o número para chamar: ");
                    String numero = scanner.nextLine();
                    meuIphone.fazerChamada(numero);
                    break;
                case 3:
                    System.out.print("Digite a URL para carregar: ");
                    String url = scanner.nextLine();
                    meuIphone.carregarPagina(url);
                    break;
                case 4:
                    meuIphone.desligar();
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

}
