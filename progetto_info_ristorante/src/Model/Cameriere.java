package Model;

import java.util.ArrayList;
import java.util.Map;

public class Cameriere extends Ordine{
    private String nome;
    private ArrayList<String> piatti = null;

    /****
     * Costruttore
     * @param nome
     */
    public Cameriere(String nome){
        super();
        this.nome = nome;
    }


    public String receiveOrder(int ordinazione[]){
            final int[] i = {0};
            ordini.forEach(
                    (String key,Integer value) -> {
                        ordini.replace(key,ordinazione[i[0]]);
                        i[0]++;
                    }
            );
            return "Tutti i piatti sono stati inseriti !!!";
    }

    public Object getOrder(){
        return ordini;
    }

    public void addPiatti(ArrayList<String> ordini){
        piatti = ordini;
    }

}
