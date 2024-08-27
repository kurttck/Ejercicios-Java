package POOAVANZADO.Herencia.GestionEdificios;

public class Polideportivo extends Edificio {
    String nombre;
    String tipo;
    static int cantTechado = 0;
    static int cantAbierto = 0;

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
        /*
         * if (tipo.equals("Techado")) {
         * cantTechado++;
         * } else {
         * cantAbierto++;
         * }
         */
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
