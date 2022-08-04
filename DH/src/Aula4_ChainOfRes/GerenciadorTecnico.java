package Aula4_ChainOfRes;

public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar (Mail email){
        if ((email.getDestino().equalsIgnoreCase("tecnical@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Tecnico"))){
            System.out.println("Enviando ao departamento Tecnico");

        }else {
            if (this.getSeguinte()!=null){//chamamos ao metodo seguinte
                this.getSeguinte().verificar(email);
            }
        }
    }
}
