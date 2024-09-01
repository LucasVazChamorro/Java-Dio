import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // TODO: Verifique se o serviço está na lista de serviços contratados

        scanner.close();
        String[] usuario = {"Alice", "Bob", "Carol"};
        for (int c = 0; c < usuario.length; c++) {
            if (usuario[c].equals(nomeCliente)) {
                // TODO: Verifique se o serviço está na lista de serviços contratados
                for (int i = 0; i < partes.length; i++) {
                    if (partes[i].equals(servico)) {
                        System.out.println("Sim");
                        contratado = true;
                        break;
                    }
                }
                if (contratado == false) {
                    System.out.println("Nao");
                    System.exit(0);
                }
            }
        }
    }
}