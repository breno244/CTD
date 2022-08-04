package Aula4_ChainOfRes.mesa;

public class GerenciadorPeso extends Gerenciador {

    @Override
    public void verificar(Artigo a) {
        if (a.getPeso()>=1200 && a.getPeso()<=1300){
            if (this.getSeguinte()!=null){
                this.getSeguinte().verificar(a);
            }
        }else{
            System.out.println("Rejeitado");
        }
    }

}
