package aula10;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Itens {

    private static final Logger logs = Logger.getLogger(Itens.class);

    private List<Integer> integerList = new ArrayList<>();

    public void gg(){
        try {
            if (integerList.isEmpty()){
                logs.error(" A lista é igual a zero. ");
            }
            if(integerList.size()>5){
                logs.info(" O comprimento da lista é maior que 5\n");
            }
            if (integerList.size()>10){
                logs.info(" O comprimento da lista é maior que 10\n");
            }
            Integer media = 0;
            for (Integer item: integerList){
                media +=item;
            }
            media /=integerList.size();

            logs.info("A media da lista e "+ media);
            }
        catch (Exception i){
            logs.error("");
        }

    }

    public Itens(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }
}