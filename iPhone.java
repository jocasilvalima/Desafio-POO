public class iPhone implements ReprodutorDeMusica, AparelhoTelefonico, NavegadorWeb {
    // Implemente os métodos da interface ReprodutorDeMusica
    public void tocarMusica() {
        System.out.println("Reproduzindo música...");
    }

    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Implemente os métodos da interface AparelhoTelefonico
    public void ligar() {
        System.out.println("Ligando o aparelho...");
    }

    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarConversaVoz() {
        System.out.println("Iniciando conversa por voz...");
    }

    // Implemente os métodos da interface NavegadorWeb
    public void exibirPagina() {
        System.out.println("Exibindo página web...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página web...");
    }
}