package aparelho;

public class ReprodutorMusical {
    private String faixaAtual;
    private int volume;

    public ReprodutorMusical(String faixaAtual, int volume) {
        this.faixaAtual = faixaAtual;
        this.volume = volume;
    }

    public void tocar() {
        System.out.println("Tocando música: " + faixaAtual);
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void parar() {
        System.out.println("Música parada.");
    }

    public void proximaFaixa() {
        System.out.println("Indo para a próxima faixa.");
    }

    public void faixaAnterior() {
        System.out.println("Voltando para a faixa anterior.");
    }
    public void aumentaVolume(){
        if (volume<100) {
            volume++;
            System.out.println("Volume aumentou " + volume);
        }else{
            System.out.println("Volume já esta no máximo!!! " + volume);
        }
    }
    public void baixarVolume(){
        if(volume>0){
            volume--;
            System.out.println("Volume baixou " + volume);
        } else{
            System.out.println("Volume já esta no mínimo!!! " + volume);
        }
    }
}
