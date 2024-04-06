package bancolib.entity;

public class Carro {

    public int id;
    public int id_fabricante;
    public int id_modelo;
    public String placa;
    public String cor;
    public boolean disponivel;
    public double valorlocacao;

    public Carro(int id, int id_fabricante, int id_modelo, String placa, String cor, boolean disponivel, double valorlocacao) {
        this.id = id;
        this.id_fabricante = id_fabricante;
        this.id_modelo = id_modelo;
        this.placa = placa;
        this.cor = cor;
        this.disponivel = disponivel;
        this.valorlocacao = valorlocacao;
    }

    public Carro() {
    }
}
