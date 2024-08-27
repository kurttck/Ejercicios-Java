package POOAVANZADO.Herencia.LigaDeFutbol;

public class Persona {

    protected String name;
    protected Integer age;
    protected String team;

    public Persona(String name, Integer age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void gritarGol() {
        System.out.println("GOL");
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + ", team=" + team + '}';
    }
}
