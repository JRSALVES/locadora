package bancolib.entity;

public class Fabricante {

    public int id;
    public String nome;

    public Fabricante(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Fabricante() {
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
