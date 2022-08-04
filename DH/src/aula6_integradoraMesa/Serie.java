package aula6_integradoraMesa;

public class Serie implements Iserie {

    @Override
    public String getSerie(String nome) {
        return "www."+nome;
    }
}
