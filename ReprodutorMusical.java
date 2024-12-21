
public class ReprodutorMusical {
    public String nome;

    public void tocar() {
        System.out.println("tocando");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica (String nome) {
        this.nome = "Nome da musica";
        System.out.println(nome);
    }
}
