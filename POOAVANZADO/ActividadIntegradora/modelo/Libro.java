package POOAVANZADO.ActividadIntegradora.modelo;

public class Libro {
    private String titulo;
    private String autor;
    private Integer numPage;
    private Boolean prestado = false;

    public Libro() {

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

    public Integer getNumPage() {
        return numPage;
    }

    public void setNumPage(Integer numPage) {
        this.numPage = numPage;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public Libro(String titulo, String autor, Integer numPage, Boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPage = numPage;
        this.prestado = prestado;
    }

    public String mostrarInformacion() {
        return "El libro " + this.titulo + " fue escrito por " + this.autor + " y tiene " + this.numPage + " "
                + (this.prestado ? "prestado" : "disponible");
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + '}';
    }

}
