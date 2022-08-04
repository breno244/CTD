package aula3_integraçao.emAula;

public class Afiliado extends Vendedor {

    public Afiliado(String nome) {
        super.nome = nome;
        int pontos_por_venda1 = super.pontos_por_venda;
    }

    @Override
    public int calcularPontos(){
        return this.vendas * pontos_por_venda;
    }
}