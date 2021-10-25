package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cameriere {
    private Ordine ordini;
    private String nome;

    /****
     * Costruttore
     * @param nome
     */
    public Cameriere(String nome) {
        this.nome = nome;
    }

    public void setOrdini(Ordine ordine){
        this.ordini = ordine;
    }

    public void refreshOrder(){
        this.ordini = Save.loadOrdine();
    }

    public String receiveOrder(int ordinazione[]) {
        if(!ordini.tavoliLeft()){
            return nome + " : non abbiamo altri tavoli !!!";
        }
        int numTav = ordini.ordini.size();
        if(numTav == 10)
            numTav = ordini.firstTavAvaiable();
        else
        ordini.ordini.add(new HashMap<String, Integer>(Menu.getNewMenu()));
        int i = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(numTav).entrySet() ){
            ordine.setValue(ordinazione[i]);
            i++;
        }
        Save.saveOrdine(ordini);
        return nome + " : Tutti i piatti della tavola " + numTav + " sono stati inseriti !!!";
    }

    public String ChangeOrder(int ordinazioni[] ,int tavolo){
        if(!ordini.isTavolo(tavolo)) return nome + ": Tavolo " + tavolo + " non aperto";
        int i = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(tavolo).entrySet() ){
            ordine.setValue(ordinazioni[i++]);
        }
        Save.saveOrdine(ordini);
        return nome + " : tavolo " + tavolo + "" + " modificato con successo !!";
    }

    public String DeleteOrder(int tavolo){
        if(!ordini.isTavolo(tavolo)) return nome + ": Tavolo " + tavolo + " non aperto";
        int i = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(tavolo).entrySet() ){
            ordine.setValue(0);
        }
        Save.saveOrdine(ordini);
        return nome + " : tavolo " + tavolo + " eliminato con successo !!";
    }



    public Ordine getOrder() {
        return ordini;
    }



}
