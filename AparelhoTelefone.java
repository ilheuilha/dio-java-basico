public class AparelhoTelefone {
    public String numero;

    public void ligar(String numero) {
        this.numero = "12-2222222";
        System.out.println(numero);
    }

    public void atender() {
        System.out.println("Chamada em andamento");
    }

    public void iniciarCorreioVoz () {
        System.out.println("iniciar correio de voz");
    }
    
}
