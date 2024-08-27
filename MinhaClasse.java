public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Lucas";
        String segundoNome = "Chamorro";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeironome, String segundoNome){
        return "Resultado do método: " + primeironome.concat(" ").concat(segundoNome);
    }
}
