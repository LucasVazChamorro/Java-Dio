public class Iphone {
    private String dono;
    private String endereco;
    private String email;
    private String documento;

    private String artista;
    private String musica;
    private String album;

    private String contato;

    private String navegador;


    void exibirDadosPessoais(){
        System.out.println("Este iPhone pertence a " + dono);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
        System.out.println("Documento: " + documento);
        System.out.println();
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }
}