package bancolib.entity;

public class Modelo {

    public int id;
    public String nome;
    public int id_fabricante;

    public Modelo(int id, String nome, int id_fabricante) {
        this.id = id;
        this.nome = nome;
        this.id_fabricante = id_fabricante;
    }

    public Modelo() {
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
