import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leituraDados = new Scanner(System.in);
        System.out.println("Olá, por favor, informe o seu nome: ");
        String nome = leituraDados.nextLine();
        System.out.println("Por favor, digite o número da Agência (Sem traços e sem pontos) !");
        int agencia = leituraDados.nextInt();
        System.out.println("Por favor, digite o número da conta (Sem traços e sem pontos) !");
        int conta = leituraDados.nextInt();
        System.out.println("Por favor, digite o seu saldo: R$ ");
        double saldo = leituraDados.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo R$ %.2f já está disponível apra saque", nome, agencia, conta, saldo);

    }
}