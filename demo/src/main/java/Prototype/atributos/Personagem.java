package Prototype.atributos;

public class Personagem implements Cloneable {
    private String nome;
    private int forca;
    private int destreza;
    private int constituicao;
    private Status status;

    public Personagem(String nome, int forca, int destreza, int constituicao, Status status ) {
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.status = status;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {
        Personagem personagemClone = (Personagem) super.clone();
        personagemClone.status = (Status) personagemClone.status.clone();
        return personagemClone;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "Nome='" + nome + '\'' +
                ", Força=" + forca +
                ", Destreza='" + destreza + '\'' +
                ", Constituicao='" + constituicao + '\'' +
                ", Status=" + status +
                '}';
    }
}
