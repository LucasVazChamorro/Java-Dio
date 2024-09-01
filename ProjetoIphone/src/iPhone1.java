public class iPhone1 extends Iphone implements SystemIPhone {

    private Iphone iphone1;

    public iPhone1() {
        iphone1 = new Iphone();
        iphone1.setDono("Lucas Chamorro");
        iphone1.setEmail("lucasvazchamorro7@gmail.com");
        iphone1.setEndereco("Rua Chinforínfora, Tangamandápio-TA");
        iphone1.setDocumento("3333.3333.333-33");

        iphone1.setAlbum("... And Justice For All");
        iphone1.setArtista("Metallica");
        iphone1.setMusica("Blackened");

        iphone1.setContato("Pai 45544-12521");

        iphone1.setNavegador("Opera");
    }

    public static void main(String[] args) {
        iPhone1 iphone1Instance = new iPhone1();
        iphone1Instance.iphone1.exibirDadosPessoais();
        iphone1Instance.reprodutorMusical();
        iphone1Instance.tocar();
        iphone1Instance.pausar();
        iphone1Instance.selecionarMusica("One");
        iphone1Instance.Telefonar();
        iphone1Instance.ligar();
        iphone1Instance.atender();
        iphone1Instance.iniciarCorreioVoz();
        iphone1Instance.navegadarInternet();
        iphone1Instance.exibirPagina("www.google.com");
        iphone1Instance.adicionarNovaAba("www.stackoverflow.com");
        iphone1Instance.atualizarPagina();
    }

    @Override
    public void reprodutorMusical() {
        System.out.println("Artista: " + iphone1.getArtista());
        System.out.println("Música: " + iphone1.getMusica());
        System.out.println("Álbum: " + iphone1.getAlbum());
        System.out.println();
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música: " + iphone1.getMusica());
        System.out.println();
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
        System.out.println();
    }

    @Override
    public void selecionarMusica(String musica) {
        iphone1.setMusica(musica);
        System.out.println("Música selecionada: " + iphone1.getMusica());
        System.out.println();
    }

    @Override
    public void Telefonar() {
        System.out.println("Ligando para..." + iphone1.getContato());
        System.out.println();
    }

    @Override
    public void ligar() {
        System.out.println("Chamando...");
        System.out.println();
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
        System.out.println();
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
        System.out.println();
    }

    @Override
    public void navegadarInternet() {
        System.out.println("Abrindo navegador " + iphone1.getNavegador());
        System.out.println();
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        System.out.println();
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a página: " + url);
        System.out.println();
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
        System.out.println();
    }
}
