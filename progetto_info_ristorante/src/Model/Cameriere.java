package Model;

import java.util.ArrayList;

public class Cameriere {
    private String nome;
    private ArrayList<String> piatti = null;

    /****
     * Costruttore
     * @param nome
     */
    public Cameriere(String nome){
        this.nome = nome;
    }

    public void addPiatti(ArrayList<String> ordini){
        piatti = ordini;
    }
    public String getPiatti(){
        String a = null;
        if(piatti.size() > 0){
            for(String piatto : piatti){
                Ordine.menu.get(piatto.intern());
            }
        }
        return a;
    }

}
