package Aula4_ChainOfRes.mesa;

public class GerenciadorEmbalagem extends Gerenciador{

    @Override
    public void verificar(Artigo a) {
        if (a.getEmbalagem().equalsIgnoreCase("Saudável") || a.getEmbalagem().equalsIgnoreCase("Quase saudável")){
            System.out.println("Aceito");
        }else{
            System.out.println("Rejeitado");
        }
    }
}
