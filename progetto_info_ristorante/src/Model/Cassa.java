package Model;

import org.junit.Test;

import java.util.Map;

public class Cassa {
    private String name;
    private Ordine ordini;

    public Cassa(String name){
        this.name = name;
    }

    public void setOrder(Ordine ordine){
        this.ordini = ordine;
    }

    public float calcolaImporto(int tavolo){
        float result = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(tavolo).entrySet() ){
            result += ordine.getValue() * Menu.menu_price.get(ordine.getKey());
        }
        return result;
    }


}
