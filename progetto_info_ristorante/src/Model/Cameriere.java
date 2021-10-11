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


}
