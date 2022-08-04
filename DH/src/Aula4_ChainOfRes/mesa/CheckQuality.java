package Aula4_ChainOfRes.mesa;

public class CheckQuality {

    Gerenciador inicial;

    public CheckQuality(){

        this.inicial = new GerenciadorLote();
        Gerenciador peso = new GerenciadorPeso();
        Gerenciador embalagem = new GerenciadorEmbalagem();

        inicial.setSeguinte(peso);
         peso.setSeguinte(embalagem);
    }

    public void verificar (Artigo a) {
        inicial.verificar(a);
    }
}
