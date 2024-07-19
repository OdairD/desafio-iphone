package aparelho;

public class Dispositivo {
    private String modelo;
    private String versaoOS;

    public Dispositivo(String modelo, String versaoOS){
        this.modelo = modelo;
        this.versaoOS = versaoOS;
    }
    public void iniciar(){
        System.out.println("Dispositivo iniciado");
    }
    public void desligar(){
        System.out.println("Dispositivo desligado");
    }
}
