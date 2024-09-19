import java.util.ArrayList;
import java.util.Scanner;

public class iPhone1 extends Iphone implements MusicPlayer, InternetBrowser, Phone {
    private ArrayList<String> musicas;
    private ArrayList<String> artistas;
    private ArrayList<String> albuns;
    private ArrayList<String> contatos;
    private String musicaAtual;
    private String paginaAtual;
    private boolean tocando;
    private boolean emChamada;

    public iPhone1() {
        super();
        initializeLists();
        musicaAtual = "";
        paginaAtual = "";
        tocando = false;
        emChamada = false;
        coletarInformacoesDono();
    }

    private void initializeLists() {
        musicas = new ArrayList<>();
        artistas = new ArrayList<>();
        albuns = new ArrayList<>();
        contatos = new ArrayList<>();
    }

    private void coletarInformacoesDono() {
        Scanner scanner = new Scanner(System.in);

        printHeader("Configuração Inicial do iPhone");

        System.out.println("Por favor, forneça as informações do proprietário do iPhone:\n");

        System.out.print("Nome do proprietário: ");
        setDono(scanner.nextLine());

        System.out.print("Endereço: ");
        setEndereco(scanner.nextLine());

        System.out.print("E-mail: ");
        setEmail(scanner.nextLine());

        System.out.print("Documento: ");
        setDocumento(scanner.nextLine());

        System.out.println("\nInformações do proprietário registradas com sucesso!");
        pressEnterToContinue(scanner);
    }

    public static void main(String[] args) {
        iPhone1 iphone = new iPhone1();
        iphone.runMainMenu();
    }

    private void runMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printHeader("Menu Principal");
            System.out.println("1. Música");
            System.out.println("2. Telefone");
            System.out.println("3. Internet");
            System.out.println("4. Exibir Dados do Proprietário");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opção: ");

            int choice = getValidIntInput(scanner, 1, 5);

            switch (choice) {
                case 1:
                    handleMusicMenu(scanner);
                    break;
                case 2:
                    handlePhoneMenu(scanner);
                    break;
                case 3:
                    handleInternetMenu(scanner);
                    break;
                case 4:
                    exibirDadosPessoais();
                    pressEnterToContinue(scanner);
                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    scanner.close();
                    return;
            }
        }
    }

    private void handleMusicMenu(Scanner scanner) {
        while (true) {
            printHeader("Menu de Música");
            System.out.println("1. Ver lista de Músicas");
            System.out.println("2. Adicionar Músicas a lista");
            System.out.println("3. Pausar Música");
            System.out.println("4. Parar Música");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("\nEscolha uma opção: ");

            int choice = getValidIntInput(scanner, 1, 5);

            switch (choice) {
                case 1:
                    handleMusicListMenu(scanner);
                    break;
                case 2:
                    adicionarNovaMusica(scanner);
                    break;
                case 3:
                    pausar();
                    pressEnterToContinue(scanner);
                    break;
                case 4:
                    pararMusica();
                    pressEnterToContinue(scanner);
                    break;
                case 5:
                    return;
            }
        }
    }

    private void handleMusicListMenu(Scanner scanner) {
        if (musicas.isEmpty()) {
            System.out.println("\nNão há músicas disponíveis.");
            pressEnterToContinue(scanner);
            return;
        }
        printHeader("Lista de Músicas");
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println((i + 1) + ". " + musicas.get(i) + " - " + artistas.get(i));
        }
        System.out.println((musicas.size() + 1) + ". Voltar");
        System.out.print("\nEscolha uma opção: ");

        int choice = getValidIntInput(scanner, 1, musicas.size() + 1);

        if (choice <= musicas.size()) {
            selecionarMusica(choice - 1);
            tocar();
            pressEnterToContinue(scanner);
        }
    }

    private void handlePhoneMenu(Scanner scanner) {
        while (true) {
            printHeader("Menu de Telefone");
            System.out.println("1. Ver Contatos");
            System.out.println("2. Adicionar Contato");
            System.out.println("3. Correio de Voz");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("\nEscolha uma opção: ");

            int choice = getValidIntInput(scanner, 1, 4);

            switch (choice) {
                case 1:
                    handleContactListMenu(scanner);
                    break;
                case 2:
                    adicionarNovoContato(scanner);
                    break;
                case 3:
                    iniciarCorreioVoz();
                    pressEnterToContinue(scanner);
                    break;
                case 4:
                    return;
            }
        }
    }

    private void handleContactListMenu(Scanner scanner) {
        if (contatos.isEmpty()) {
            System.out.println("\nNão há contatos na lista.");
            pressEnterToContinue(scanner);
            return;
        }

        printHeader("Lista de Contatos");
        exibirContatos();

        System.out.println((contatos.size() + 1) + ". Voltar");
        System.out.print("\nEscolha um contato (ou voltar): ");

        int choice = getValidIntInput(scanner, 1, contatos.size() + 1);

        if (choice <= contatos.size()) {
            handleContactOptions(scanner, choice - 1);
        }
    }

    private void handleContactOptions(Scanner scanner, int contactIndex) {
        while (true) {
            printHeader("Opções para o contato: " + contatos.get(contactIndex));
            System.out.println("1. Ligar");
            System.out.println("2. Editar contato");
            System.out.println("3. Excluir contato");
            System.out.println("4. Voltar");
            System.out.print("\nEscolha uma opção: ");

            int choice = getValidIntInput(scanner, 1, 4);

            switch (choice) {
                case 1:
                    System.out.println("\nLigando para " + contatos.get(contactIndex));
                    ligar();
                    pressEnterToContinue(scanner);
                    return;
                case 2:
                    editarContato(scanner, contactIndex);
                    return;
                case 3:
                    excluirContato(scanner, contactIndex);
                    return;
                case 4:
                    return;
            }
        }
    }

    private void editarContato(Scanner scanner, int index) {
        printHeader("Editando contato: " + contatos.get(index));
        System.out.print("Digite o novo nome do contato: ");
        String novoNome = scanner.nextLine();
        System.out.print("Digite o novo número do contato: ");
        String novoNumero = scanner.nextLine();
        contatos.set(index, novoNome + " - " + novoNumero);
        System.out.println("\nContato atualizado com sucesso!");
        pressEnterToContinue(scanner);
    }

    private void excluirContato(Scanner scanner, int index) {
        System.out.println("\nTem certeza que deseja excluir o contato: " + contatos.get(index) + "? (S/N)");
        String confirmacao = scanner.nextLine().trim().toLowerCase();
        if (confirmacao.equals("s")) {
            String contatoRemovido = contatos.remove(index);
            System.out.println("Contato removido: " + contatoRemovido);
        } else {
            System.out.println("Operação de exclusão cancelada.");
        }
        pressEnterToContinue(scanner);
    }

    private void handleInternetMenu(Scanner scanner) {
        while (true) {
            printHeader("Menu de Internet");
            System.out.println("1. Exibir Página");
            System.out.println("2. Adicionar Nova Aba");
            System.out.println("3. Atualizar Página");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("\nEscolha uma opção: ");

            int choice = getValidIntInput(scanner, 1, 4);

            switch (choice) {
                case 1:
                    System.out.print("\nDigite a URL: ");
                    exibirPagina(scanner.nextLine());
                    pressEnterToContinue(scanner);
                    break;
                case 2:
                    System.out.print("\nDigite a URL para a nova aba: ");
                    adicionarNovaAba(scanner.nextLine());
                    pressEnterToContinue(scanner);
                    break;
                case 3:
                    atualizarPagina();
                    pressEnterToContinue(scanner);
                    break;
                case 4:
                    return;
            }
        }
    }

    private int getValidIntInput(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                }
                System.out.println("Por favor, digite um número entre " + min + " e " + max);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
        }
    }

    // Métodos de Música
    @Override
    public void tocar() {
        if (!musicaAtual.isEmpty()) {
            tocando = true;
            System.out.println("\nTocando: " + musicaAtual);
        } else {
            System.out.println("\nNenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("\nMúsica pausada: " + musicaAtual);
        } else {
            System.out.println("\nNenhuma música está tocando.");
        }
    }

    private void pararMusica() {
        if (tocando || !musicaAtual.isEmpty()) {
            tocando = false;
            musicaAtual = "";
            System.out.println("\nMúsica parada.");
        } else {
            System.out.println("\nNenhuma música está tocando.");
        }
    }

    @Override
    public void selecionarMusica(int indice) {
        if (indice >= 0 && indice < musicas.size()) {
            musicaAtual = musicas.get(indice) + " - " + artistas.get(indice);
            System.out.println("\nMúsica selecionada: " + musicaAtual);
        } else {
            System.out.println("\nÍndice de música inválido.");
        }
    }

    private void adicionarNovaMusica(Scanner scanner) {
        printHeader("Adicionar Nova Música");
        System.out.print("Digite o nome da música: ");
        String musica = scanner.nextLine();
        System.out.print("Digite o nome do artista: ");
        String artista = scanner.nextLine();
        System.out.print("Digite o nome do álbum: ");
        String album = scanner.nextLine();
        adicionarMusica(musica, artista, album);
        pressEnterToContinue(scanner);
    }

    private void adicionarMusica(String musica, String artista, String album) {
        musicas.add(musica);
        artistas.add(artista);
        albuns.add(album);
        System.out.println("\nMúsica adicionada: " + musica + " - " + artista);
    }

    // Métodos de Telefone
    @Override
    public void ligar() {
        if (!emChamada) {
            System.out.print("Digite o número para ligar: ");
            Scanner scanner = new Scanner(System.in);
            String numero = scanner.nextLine();
            System.out.println("\nLigando para " + numero + "...");
            emChamada = true;
        } else {
            System.out.println("\nJá está em uma chamada.");
        }
    }

    @Override
    public void atender() {
        if (!emChamada) {
            emChamada = true;
            System.out.println("\nChamada atendida.");
        } else {
            System.out.println("\nJá está em uma chamada.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("\nIniciando correio de voz...");
    }

    private void adicionarNovoContato(Scanner scanner) {
        printHeader("Adicionar Novo Contato");
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o número do contato: ");
        String numero = scanner.nextLine();
        adicionarContato(nome, numero);
        pressEnterToContinue(scanner);
    }

    private void adicionarContato(String nome, String numero) {
        contatos.add(nome + " - " + numero);
        System.out.println("\nContato adicionado: " + nome);
    }

    private void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos na lista.");
        } else {
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println((i + 1) + ". " + contatos.get(i));
            }
        }
    }

    // Métodos de Internet
    @Override
    public void exibirPagina(String url) {
        paginaAtual = url;
        System.out.println("\nExibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("\nNova aba aberta com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("\nAtualizando página: " + paginaAtual);
        } else {
            System.out.println("\nNenhuma página aberta para atualizar.");
        }
    }

    // Métodos auxiliares para melhorar a apresentação no console
    private void printHeader(String title) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println(" ".repeat((50 - title.length()) / 2) + title);
        System.out.println("=".repeat(50) + "\n");
    }

    private void pressEnterToContinue(Scanner scanner) {
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }

    // Método para exibir dados pessoais
    @Override
    public void exibirDadosPessoais() {
        printHeader("Dados do Proprietário do iPhone");
        System.out.println("Nome: " + getDono());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Documento: " + getDocumento());
    }
}