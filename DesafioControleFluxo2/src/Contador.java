import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem vindo ao nosso prograda de Desafio de Controle de Fluxo!");
        System.out.println("Este programa consiste em inserir dois valores para serem incrementados ???, lembrando que o segundo valor deve ser maior do que o primeiro!");
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = scanner.nextInt();

        if (n1 > n2){
            ParametrosInvalidosException.tratamentoErro();
        } else {
           int contagem = n2 - n1;
           for (int i = 1; i <= contagem ; i++){
               System.out.println("Imprimindo o númeor: " + i);
           }
        }
    }
}