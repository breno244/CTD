package Aula4_ChainOfRes;

public class ProcessaMail {

    public static void main(String args[]){
        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com","tecnica@digitalhouse.com","reclamaçao"));
        processo.verificar(new Mail("email@email.com","olaMundo@digitalhouse.com","Gerencia"));
        processo.verificar(new Mail("email@email.com","wifi@gmail.com","Comercial"));
        processo.verificar(new Mail("email@email.com","tecnica@colmeia.com","Reclamaçao"));

    }
}
