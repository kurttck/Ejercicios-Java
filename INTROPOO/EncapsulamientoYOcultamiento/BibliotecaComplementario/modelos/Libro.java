package INTROPOO.EncapsulamientoYOcultamiento.BibliotecaComplementario.modelos;

public class Libro {
    private String titulo;
    private String autor;
    private Integer numPaginas;

    public Libro() {

    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo, String autor, Integer numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
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

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String mostrarInformacion() {
        return "El libro " + this.titulo + " fue escrito por " + this.autor + " y tiene " + this.numPaginas
                + " paginas";
    }

    public static Integer calcularPaginas(Integer num) {
        return num * 7;
    }

    public String AllBooks() {
        return "El libro " + this.titulo;
    }

}
