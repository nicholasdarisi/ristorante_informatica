package Model;

import org.junit.Test;

import java.util.Map;

public class Cassa {
    private String nome;
    private Ordine ordini;

    public Cassa(String name){
        this.nome = name;
    }

    public void setOrder(Ordine ordine){
        this.ordini = ordine;
    }

    public String calcolaImporto(int tavolo){
        if(tavolo > ordini.ordini.size() || ordini.ordini.size() == 0) return nome + ": Tavolo " + tavolo + " non aperto";
        float result = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(tavolo).entrySet() ){
            result += ordine.getValue() * Menu.menu_price.get(ordine.getKey());
        }
        return "" + result;
    }
    public String payOrder(int tavolo){
        if(!ordini.isTavolo(tavolo))
            return nome + ": Tavolo " + tavolo + " non aperto";
        int i = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(tavolo).entrySet() ){
            ordine.setValue(0);
        }
        Save.saveOrdine(ordini);
        return nome + " : tavolo " + tavolo + " eliminato con successo !!";
    }

    public void refreshOrder(){
        this.ordini = Save.loadOrdine();
    }


}
