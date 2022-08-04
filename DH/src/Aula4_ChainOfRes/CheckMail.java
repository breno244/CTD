package Aula4_ChainOfRes;

public class CheckMail {

    Gerenciador inicial;

    public CheckMail(){

        this.inicial = new GerenciadorGerencia();
        Gerenciador tecnica = new GerenciadorTecnico();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        //verificação em cada setor

        inicial.setSeguinte(comercial);
        comercial.setSeguinte(tecnica);
        tecnica.setSeguinte(spam);

    }

    public void verificar(Mail email){
        inicial.verificar(email);
    }
}
