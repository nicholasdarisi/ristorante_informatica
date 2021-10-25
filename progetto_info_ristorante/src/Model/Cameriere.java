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

    public void refreshOrder(){
        this.ordini = Save.loadOrdine();
    }

    public String receiveOrder(int ordinazione[]) {
        if(ordini.getOrdini().size() >= 10){
            return nome + " : non abbiamo altri tavoli !!!";
        }
        int numTav = ordini.ordini.size();
        ordini.ordini.add(new HashMap<String, Integer>(Menu.getNewMenu()));
        int i = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(numTav).entrySet() ){
            ordine.setValue(ordinazione[i]);
            i++;
        }
        Save.saveOrdine(ordini);
        return nome + " : Tutti i piatti della tavola " + numTav + " sono stati inseriti !!!";
    }

    public Object getOrder() {
        return ordini;
    }



}
