package aparelho;
import java.util.ArrayList;
import java.util.List;

public class Navegador {
    private String urlAtual;
    private List<String> historico;
    private int cont;

    public Navegador() {
        this.historico = new ArrayList<>();
        this.cont = -1; // Inicializa cont como -1 para indicar que não há páginas carregadas
    }

    public void carregarPagina(String url) {
        this.urlAtual = url;
        historico.add(url);
        cont = historico.size() - 1; // Atualiza cont para o índice da nova página
        System.out.println("Carregando página: " + url);
    }

    public void atualizar() {
        if (urlAtual != null) {
            System.out.println("Atualizando página: " + urlAtual);
        } else {
            System.err.println("Nenhuma página carregada para atualizar.");
        }
    }

    public void voltar() {
        if (cont > 0) {
            cont--;
            urlAtual = historico.get(cont);
            System.out.println("Voltando para: " + urlAtual);
        } else {
            System.err.println("Nenhuma página anterior.");
        }
    }

    public void avancar() {
        if (cont < historico.size() - 1) {
            cont++;
            urlAtual = historico.get(cont);
            System.out.println("Avançando para: " + urlAtual);
        } else {
            System.err.println("Nenhuma página seguinte.");
        }
    }
}
