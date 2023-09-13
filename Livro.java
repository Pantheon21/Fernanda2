public class Livro {
    private String titulo;
    private String autor;
    private boolean livre = true;
    private Integer id;
    public void setLivre(Boolean livre) {
        this.livre = livre;
    }

    public boolean getLivre() {
        return livre;
    }

    public Integer getId() {
        return id;
    }

    public Livro(String titulo, String autor, Integer id) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void emprestarLivro(Usuario usuario) {
        Livro livro = new Livro(titulo, autor, id);
        if (livre == true) {
            usuario.setLivro(livro);
            livre = false;
        } else {
            System.out.println("Livro não disponivel para emprestimo");
        }

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Id : "+id+"\n Titulo : "+titulo+"\n Autor : "+autor;
    }

}
