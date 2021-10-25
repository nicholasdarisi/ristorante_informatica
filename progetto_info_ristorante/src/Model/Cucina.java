package Model;

import java.util.Map;

public class Cucina {
    private Ordine ordini;
    private String nome;


    /***
     * Costruttore
     * @param nome
     */
    public Cucina(String nome){
        this.nome = nome;
    }

    public String setOrder( Ordine ordini){
        this.ordini = ordini;

        return " Ordine e stato ricevuto !!";
    }

    public void refreshOrder(){
        this.ordini = Save.loadOrdine();
    }

    public String CookOrder(int tavolo){
        if(!ordini.isTavolo(tavolo)) return nome + ": Tavolo " + tavolo + " non aperto";
        int i = 0;
        for(Map.Entry<String, Integer> ordine : ordini.ordini.get(tavolo).entrySet() ){
            ordini.qty[tavolo][i] = ordine.getValue();
            i++;
        }

        Save.saveOrdine(ordini);
        return nome + " : Tutti i piatti del tavolo " + tavolo + " sono stati preparati !!!";
    }

    public Ordine getOrder(){
        return ordini;
    }

}
