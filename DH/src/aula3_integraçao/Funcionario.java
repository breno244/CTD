package aula3_integraçao;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Vendedor {

    private List<Afiliado>afiliados = new ArrayList<>();

    public Funcionario(String nome, int idVendedor) {
        super(nome, idVendedor);
    }

    public void obterAfiliado(String nome, int id){
        Afiliado afiliado = new Afiliado(nome,id);
    }

    @Override
    public int calcularPontos() {
        return getTotalVendas();
    }

}
