package Aula4_ChainOfRes;

public class GerenciadorGerencia extends Gerenciador{

    @Override
    public void verificar (Mail email){
        // verificaçao do destino e Assunto a partir do meu gerenciador

        if ((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Gerencia"))){
            System.out.println("Enviando ao departamento Gerencial");

        }else {
            //verifica a proxima entrada e executo novamente o metodo Verificar
            if (this.getSeguinte()!=null){

                this.getSeguinte().verificar(email);

            }
        }
    }


}
