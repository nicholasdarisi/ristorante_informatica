package Model;

import javafx.scene.control.Tab;

import java.util.Map;

public class Amministrazione {
    public String nome;
    public Ordine ordini;
    public Amministrazione(String nome ){
        this.nome = nome;
    }

    public String getOrder(Ordine ordine){
        ordini = ordine;
        return nome + " : ordine preso";
    }

    public void refreshOrder(){
        this.ordini = Save.loadOrdine();
    }

    public String ChangeOrder(int ordinazioni[] ,int tavolo){
        int i = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(tavolo).entrySet() ){
            ordine.setValue(ordinazioni[i++]);
        }
        Save.saveOrdine(ordini);
        return nome + " : tavolo " + tavolo + "" + " modificato con successo !!";
    }

    public String DeleteOrder(int tavolo){
        int i = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(tavolo).entrySet() ){
            ordine.setValue(0);
        }
        Save.saveOrdine(ordini);
        return nome + " : tavolo " + tavolo + " eliminato con successo !!";
    }
}
