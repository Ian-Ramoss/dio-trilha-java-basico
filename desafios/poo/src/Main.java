public class Main {
    public static void main(String[] args) {
        // Cria uma instância de iPhone
        iPhone meuIPhone = new iPhone();

        // Testa os métodos de ReprodutorMusical
        System.out.println("Testando ReprodutorMusical:");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Billionaire - Bruno Mars");

        // Testa os métodos de AparelhoTelefonico
        System.out.println("\nTestando AparelhoTelefonico:");
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testa os métodos de NavegadorInternet
        System.out.println("\nTestando NavegadorInternet:");
        meuIPhone.exibirPagina("https://github.com/Ian-Ramoss/dio-trilha-java-basico/tree/main");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
