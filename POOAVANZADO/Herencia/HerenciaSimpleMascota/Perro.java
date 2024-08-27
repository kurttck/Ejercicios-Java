package POOAVANZADO.Herencia.HerenciaSimpleMascota;

public class Perro extends Animal {
    String raza;

    public Perro(String name, int age, String raza) {
        super(name, age);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("Guau");
    }

    @Override
    public String comer() {
        return this.name + " esta comiendo croquetas";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1 + super.hashCode();
        result = prime * result + ((raza == null) ? 0 : raza.hashCode());
        return result;
    }

    // EQUALS Y HASHCODE: ESTE MODIFICADOR SIRVE PARA QUE AL MOMENTO DE COMPARAR
    // DATOS NO COMPARE LA
    // INSTANCIA SI NO EL VALOR DE ESTAS, SE MODIFICA
    // EN LA CLASE PADRE Y EN LA DEL HIJO

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Perro other = (Perro) obj;
        if (raza == null) {
            if (other.raza != null)
                return false;
        } else if (!raza.equals(other.raza))
            return false;
        return true;
    }

}
