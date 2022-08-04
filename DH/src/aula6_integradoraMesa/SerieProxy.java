package aula6_integradoraMesa;

import java.util.HashMap;
import java.util.Map;

public class SerieProxy implements Iserie{

    private int qtdViews = 0;
    private Serie serie;

    public SerieProxy (Serie s){
        this.serie = s;
        this.qtdViews = 0;
    }

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        if (this.qtdViews >4 ){
            throw new SerieNaoHabilitadaException("Excede o número de reproduções semanais permitidas");
        }
        this.qtdViews++;
        return this.serie.getSerie();
    }
}
