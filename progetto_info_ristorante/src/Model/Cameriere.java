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


    public String receiveOrder(int ordinazione[]) {
        if(ordini.getOrdini().size() >= 10){
            return nome + " : non abbiamo altri tavoli !!!";
        }

        final int[] i = {0};
        int numTav = ordini.ordini.size() - 1;
        ordini.ordini.add(new HashMap<String, Integer>(Menu.getNewMenu()));
        ordini.ordini.get(numTav).forEach(
                (String key, Integer value) -> {
                    ordini.ordini.get(numTav).replace(key, ordinazione[i[0]]);
                    i[0]++;
                }
        );
        Save.saveOrdine(ordini);
        return nome + " : Tutti i piatti della tavola " + numTav + " sono stati inseriti !!!";
    }

    public Object getOrder() {
        return ordini;
    }



}
