package aula3_integraçao.emAula;

public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int pontos_por_venda;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome+ " realizoou "+qtdVendas+" vendas...");
    }
    //metodo  que calcula ponros do Vendedor de acordo com os aspectos considerados
    public abstract int calcularPontos();

    //Template method  -- recebe o total de pontos calculados a partir da  subclasse e valida cada item para
    public String mostrarCategoria(){
        int pontosVendedor = calcularPontos();
        return this.nome+" tem um total de "+pontosVendedor+" pontos sua categoria e "+getNomeCategoria(pontosVendedor);
    }
    // recebo os pontos e informo uma categorizaçao
    private String getNomeCategoria(int pontosVendedor){
        if(pontosVendedor < 20){
            return "Vendedor novato";
        }else if(pontosVendedor < 31){
            return "Vendedor aprendiz";
        } else if (pontosVendedor <41) {
            return "Vendedor Bao";
        }else {
            return "Vendedor Mestre";
        }
    }

}
