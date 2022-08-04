package aula3_integraçao.emAula;

import aula3_integraçao.Vendedor;

import java.util.ArrayList;

public class Funcionario extends Vendedor {

    private int anosAntiguidade;
    private ArrayList<aula3_integraçao.emAula.Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anosAntiguidade){
        super.nome = nome;
        super.pontos_por_venda = 5;
        this.anosAntiguidade = anosAntiguidade;

    }
    //agregar afiliado e seus pontos

    public void addAfiliado(aula3_integraçao.emAula.Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome+ " agora e afiliado de "+super.nome);
    }
    //implementaçao do metodo abstrato
    //por ano de antiguidae
    @Override
    public int calcularPontos(){
        return (this.afiliados.size()*10)+(this.anosAntiguidade);
    }

    public void vender(int i) {
    }
}
