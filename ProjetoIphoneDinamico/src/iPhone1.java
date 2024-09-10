import java.util.ArrayList;
import java.util.Scanner;

public class iPhone1 extends Iphone implements MusicPlayer, InternetBrowser, Phone {

    private Iphone iphone1;
    private ArrayList<String> musicas;
    private ArrayList<String> artistas;
    private ArrayList<String> albuns;
    private ArrayList<String> contatos;

    public iPhone1() {
        Scanner scanner = new Scanner(System.in);
        iphone1 = new Iphone();

        System.out.println("Informe o dono do iPhone: ");
        String dono = scanner.nextLine();
        iphone1.setDono(dono);
        System.out.println("Informe o email: ");
        String email = scanner.nextLine();
        iphone1.setEmail(email);
        System.out.println("Informe o endereço: ");
        String endereco = scanner.nextLine();
        iphone1.setEndereco(endereco);
        System.out.println("Informe o documento: ");
        String documento = scanner.nextLine();
        iphone1.setDocumento(documento);

        musicas = new ArrayList<>();
        artistas = new ArrayList<>();
        albuns = new ArrayList<>();
        contatos = new ArrayList<>();

        //Iniciando as listas de músicas e contatos apenas para se ter algo no dispositivo...
        musicas.add("Blackened");
        artistas.add("Metallica");
        albuns.add("... And Justice For All");

        contatos.add("João - 123456789");
        contatos.add("Maria - 987654321");
    }

    public static void main(String[] args) {
        iPhone1 iphone1Instance = new iPhone1();
        iphone1Instance.iphone1.exibirDadosPessoais();

        Scanner scanner = new Scanner(System.in);
        int command = 0;

        do {
            System.out.println("Selecione a opção desejada:\n" +
                    "[ 1 ] = Musica\n" +
                    "[ 2 ] = Telefonar\n" +
                    "[ 3 ] = Navegar\n" +
                    "[ 4 ] = Sair:\n");

            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    System.out.println("Informe a opção desejada: \n" +
                            "[ 1 ] - Selecionar Música\n" +
                            "[ 2 ] - Tocar Música Selecionada\n" +
                            "[ 3 ] - Pausar Música\n" +
                            "[ 4 ] - Adicionar Música\n");
                    int musicaCommand = scanner.nextInt();
                    switch (musicaCommand) {
                        case 1:
                            iphone1Instance.exibirMusicas();
                            System.out.println("Digite o número da música que deseja tocar:");
                            int index = scanner.nextInt();
                            scanner.nextLine();  // Consumir nova linha
                            iphone1Instance.selecionarMusica(index - 1);
                            break;
                        case 2:
                            iphone1Instance.tocar();
                            break;
                        case 3:
                            iphone1Instance.pausar();
                            break;
                        case 4:
                            System.out.println("Digite o nome da música:");
                            scanner.nextLine();  // Consumir nova linha
                            String novaMusica = scanner.nextLine();
                            System.out.println("Digite o nome do artista:");
                            String novoArtista = scanner.nextLine();
                            System.out.println("Digite o nome do álbum:");
                            String novoAlbum = scanner.nextLine();
                            iphone1Instance.adicionarMusica(novaMusica, novoArtista, novoAlbum);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    System.out.println("Informe a opção desejada:\n" +
                            "[ 1 ] = Ligar\n" +
                            "[ 2 ] = Atender\n" +
                            "[ 3 ] = Correio Eletrônico\n" +
                            "[ 4 ] = Adicionar Contato\n" +
                            "[ 5 ] = Ver lista de Contatos\n");

                    int telefonarCommand = scanner.nextInt();
                    switch (telefonarCommand) {
                        case 1:
                            iphone1Instance.ligar();
                            break;
                        case 2:
                            iphone1Instance.atender();
                            break;
                        case 3:
                            iphone1Instance.iniciarCorreioVoz();
                            break;
                        case 4:
                            System.out.println("Digite o nome do contato:");
                            scanner.nextLine();  // Consumir nova linha
                            String nomeContato = scanner.nextLine();
                            System.out.println("Digite o número do contato:");
                            String numeroContato = scanner.nextLine();
                            iphone1Instance.inserirNovoContato(nomeContato + " - " + numeroContato);
                            break;
                        case 5:
                            iphone1Instance.exibirContatos();
                            System.out.println("Digite o número do contato que deseja ligar:");
                            int contatoIndex = scanner.nextInt();
                            scanner.nextLine();  // Consumir nova linha
                            iphone1Instance.selecionarContato(contatoIndex - 1);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    System.out.println("Informe a opção desejada:\n" +
                            "[ 1 ] = Exibir\n" +
                            "[ 2 ] = Nova Aba\n" +
                            "[ 3 ] = Atualizar Página\n");
                    int navegarCommand = scanner.nextInt();
                    switch (navegarCommand) {
                        case 1:
                            System.out.println("Digite o URL da página:");
                            scanner.nextLine();  // Consumir nova linha
                            String url = scanner.nextLine();
                            iphone1Instance.exibirPagina(url);
                            break;
                        case 2:
                            System.out.println("Digite o URL da nova aba:");
                            scanner.nextLine();  // Consumir nova linha
                            String novaAbaUrl = scanner.nextLine();
                            iphone1Instance.adicionarNovaAba(novaAbaUrl);
                            break;
                        case 3:
                            iphone1Instance.atualizarPagina();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (command != 4);

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
        System.out.println("Tocando a música: " + iphone1.getMusica() + " do artista " + iphone1.getArtista() + " no álbum " + iphone1.getAlbum());
        System.out.println();
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
        System.out.println();
    }

    @Override
    public void selecionarMusica(int index) {
        iphone1.setMusica(musicas.get(index));
        iphone1.setArtista(artistas.get(index));
        iphone1.setAlbum(albuns.get(index));
        System.out.println("Música selecionada: " + iphone1.getMusica() + " do artista " + iphone1.getArtista() + " no álbum " + iphone1.getAlbum());
        tocar();
        System.out.println();
    }

    public void exibirMusicas() {
        System.out.println("Músicas disponíveis:");
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println((i + 1) + ". " + musicas.get(i) + " - " + artistas.get(i) + " (" + albuns.get(i) + ")");
            System.out.println();
        }
    }

    public void adicionarMusica(String musica, String artista, String album) {
        musicas.add(musica);
        artistas.add(artista);
        albuns.add(album);
        System.out.println("Nova música adicionada: " + musica + " do artista " + artista + " no álbum " + album);
        System.out.println();
    }

    public void exibirContatos() {
        System.out.println("Contatos disponíveis:");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println((i + 1) + ". " + contatos.get(i));
            System.out.println();
        }
    }

    public void inserirNovoContato(String novoContato) {
        contatos.add(novoContato);
        System.out.println("Novo contato inserido: " + novoContato);
        System.out.println();
    }

    public void selecionarContato(int index) {
        iphone1.setContato(contatos.get(index));
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
