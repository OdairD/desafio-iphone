package aparelho;
public class Telefone {
    private String chamadaAtual;

    public Telefone() {
        this.chamadaAtual = null;
    }

    public void fazerChamada(String numero) {
        chamadaAtual = numero;
        System.out.println("Chamando número: " + numero);
    }

    public void terminarChamada() {
        System.out.println("Encerrar chamada");
        chamadaAtual = null;
    }

    public void atenderChamada() {
        System.out.println("Atender chamada");
    }
}