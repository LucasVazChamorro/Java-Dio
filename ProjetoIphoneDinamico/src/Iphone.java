public class Iphone {
    private String dono;
    private String endereco;
    private String email;
    private String documento;

    // Construtor
    public Iphone() {
        this.dono = "";
        this.endereco = "";
        this.email = "";
        this.documento = "";
    }

    // Método para exibir dados pessoais
    public void exibirDadosPessoais() {
        System.out.println("------------------------------------");
        System.out.println("Dados do Proprietário do iPhone:");
        System.out.println("Nome: " + dono);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
        System.out.println("Documento: " + documento);
        System.out.println("------------------------------------");
    }

    // Getters e Setters
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}