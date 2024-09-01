import java.util.Scanner;

public class iPhone1 extends Iphone implements MusicPlayer, InternetBrowser, Phone {

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

        iphone1.setNavegador("Opera");

        inserirNovoContato("Pai 45544-12521");
    }

    public static void main(String[] args) {
        iPhone1 iphone1Instance = new iPhone1();
        iphone1Instance.iphone1.exibirDadosPessoais();

        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Digite um comando (musica, telefonar, navegar, sair):");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "musica":
                    System.out.println("Digite o comando do reprodutor (tocar, pausar, selecionar):");
                    String musicaCommand = scanner.nextLine().toLowerCase();
                    switch (musicaCommand) {
                        case "tocar":
                            iphone1Instance.tocar();
                            break;
                        case "pausar":
                            iphone1Instance.pausar();
                            break;
                        case "selecionar":
                            System.out.println("Digite o nome da música:");
                            String novaMusica = scanner.nextLine();
                            iphone1Instance.selecionarMusica(novaMusica);
                            break;
                        default:
                            System.out.println("Comando de música não reconhecido.");
                    }
                    break;

                case "telefonar":
                    System.out.println("Digite o comando de telefonia (ligar, atender, correio, novo contato):");
                    String telefonarCommand = scanner.nextLine().toLowerCase();
                    switch (telefonarCommand) {
                        case "ligar":
                            iphone1Instance.ligar();
                            break;
                        case "atender":
                            iphone1Instance.atender();
                            break;
                        case "correio":
                            iphone1Instance.iniciarCorreioVoz();
                            break;
                        case "novo contato":
                            System.out.println("Digite o nome do contato:");
                            String nomeContato = scanner.nextLine();
                            System.out.println("Digite o número do contato:");
                            String numeroContato = scanner.nextLine();
                            iphone1Instance.inserirNovoContato(nomeContato + " " + numeroContato);
                            break;
                        default:
                            System.out.println("Comando de telefonia não reconhecido.");
                    }
                    break;

                case "navegar":
                    System.out.println("Digite o comando de navegação (exibir, nova aba, atualizar):");
                    String navegarCommand = scanner.nextLine().toLowerCase();
                    switch (navegarCommand) {
                        case "exibir":
                            System.out.println("Digite o URL da página:");
                            String url = scanner.nextLine();
                            iphone1Instance.exibirPagina(url);
                            break;
                        case "nova aba":
                            System.out.println("Digite o URL da nova aba:");
                            String novaAbaUrl = scanner.nextLine();
                            iphone1Instance.adicionarNovaAba(novaAbaUrl);
                            break;
                        case "atualizar":
                            iphone1Instance.atualizarPagina();
                            break;
                        default:
                            System.out.println("Comando de navegação não reconhecido.");
                    }
                    break;

                case "sair":
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Comando não reconhecido.");
            }
        } while (!command.equals("sair"));

        scanner.close();
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
        System.out.println("Ligando para " + iphone1.getContato() + "...");
        System.out.println();
    }

    @Override
    public void ligar() {
        System.out.println("Chamando " + iphone1.getContato() + "...");
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

    public void inserirNovoContato(String novoContato) {
        iphone1.setContato(novoContato);
        System.out.println("Novo contato inserido: " + iphone1.getContato());
        System.out.println();
    }
}