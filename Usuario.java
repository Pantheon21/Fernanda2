public class Usuario {
    private int id;
    private String nome;
    private Livro livro;
    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
