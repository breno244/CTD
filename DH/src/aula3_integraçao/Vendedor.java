package aula3_integraçao;

public abstract class Vendedor {
    public boolean mostrarCategoria;
    protected int pontos_por_venda;
    private String nome;
    private int idVendedor;
    private int totalVendas;

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Vendedor(String nome, int idVendedor) {
        this.nome = nome;
        this.idVendedor = idVendedor;
    }

    public abstract int calcularPontos();
}
