package Aula4_ChainOfRes.mesa;

public class GerenciadorLote extends Gerenciador {

    @Override
    public void verificar(Artigo a) {
        if (a.getLote()>=1000 && a.getLote()<=2000){
            if (this.getSeguinte()!=null){
                this.getSeguinte().verificar(a);
            }
        }else{
            System.out.println("Rejeitado");
        }
    }
}
