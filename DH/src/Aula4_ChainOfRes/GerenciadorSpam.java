package Aula4_ChainOfRes;

public class GerenciadorSpam extends Gerenciador{

    @Override
    public void verificar(Mail email){
        System.out.println("Marcado como Spam");
    }
}
