package Prototype.atributos;


public class Status implements Cloneable {
    private String doenca;
    private String fome;


    public Status(String doenca, String fome) {
        super();
        this.doenca = doenca;
        this.fome = fome;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoença(String doenca) {
        this.doenca = doenca;
    }

    public String getFome() {
        return fome;
    }

    public void setFome(String fome) {
        this.fome = fome;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Status{" +
                "Doença='" + doenca + '\'' +
                ", Fome=" + fome +
                '}';
    }
}