package Model;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Map;

public class Cucina extends Ordine {
    private String nome;
    private String piatti;


    /***
     * Costruttore
     * @param nome
     */
    public Cucina(String nome){
        super();
        this.nome = nome;
    }

    public String receiveOrder( Map<String, Integer> ordini){
        this.ordini = ordini;

        return " Ordine e stato ricevuto !!";
    }

    public String CockOrder(){
        final String[] result = {""};
        ordini.forEach(
                (String key, Integer value) -> {
                    if(value > 0){
                        result[0] += value + (value > 1 ? "Piatti " : " Piatto") + " di " + key + " sono stati preparati !!";
                    }
                    ordini.replace(key ,0);
                }
        );
        return result[0];
    }



}
