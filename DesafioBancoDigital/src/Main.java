public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas Chamorro");

        Conta cc = new ContaCorrente(lucas);
        Conta poupanca = new ContaPoupanca(lucas);

        cc.depositar(250);
        poupanca.depositar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
