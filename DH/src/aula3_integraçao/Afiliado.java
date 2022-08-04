package aula3_integraçao;

public class Afiliado extends Vendedor {

    public Afiliado(String nome, int idVendedor) {
        super(nome, idVendedor);
    }

    @Override
    public int calcularPontos() {
        return 0;
    }
}
