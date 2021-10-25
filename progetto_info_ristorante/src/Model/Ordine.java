package Model;

import java.io.*;
import java.util.*;

public class Ordine extends Menu implements Serializable {
    protected ArrayList<Map<String, Integer>> ordini = new ArrayList<Map<String, Integer>>();
    protected int qty[][] = new int[10][13];

    public Ordine() {
        for (int i = 0; i < 10; i++)
            ordini.add(new HashMap<String, Integer>(Menu.getNewMenu()));
        for(int tavolo[] : qty){
            for(int p_preparati : tavolo)
                p_preparati = 0;
        }
    }

    public ArrayList<Map<String, Integer>> getOrdini() {
        return ordini;
    }
    public int[][] getQty(){
        return qty;
    }


    public int[] getTavolo(int tavolo) {
        System.out.println(tavolo);
        int result[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = 0;
        if(ordini.get(tavolo) != null)
            for (Map.Entry<String, Integer> ordine : ordini.get(tavolo).entrySet()) {
                result[i] = ordine.getValue();
                i++;
            }
        return result;
    }

    public boolean isTavolo(int tavolo) {
        boolean bool = false;
        if (ordini.get(tavolo) != null)
            for (Map.Entry<String, Integer> ordine : ordini.get(tavolo).entrySet()) {
                if (ordine.getValue() > 0) {
                    bool = true;
                    break;
                }
            }
        return bool;
    }

    public boolean isTavolo(Map<String, Integer> tavolo) {
        boolean bool = false;
        if (ordini.contains(tavolo))
            for (Map.Entry<String, Integer> ordine : ordini.get(ordini.indexOf(tavolo)).entrySet()) {
                if (ordine.getValue() > 0) {
                    bool = true;
                    break;
                }
            }
        return bool;
    }


    public boolean tavoliLeft(){
        boolean bool = false;
        if(ordini.size() < 10) bool = true;
        else {
            for(Map<String, Integer> ordine : ordini){
                if(!isTavolo(ordine)) bool = true;
            }
        }
        return bool;
    }

    public int firstTavAvaiable(){
        int tav = -1;
        for(Map<String, Integer> ordine : ordini){
            if(!isTavolo(ordine)) tav = ordini.indexOf(ordine);
        }
        return tav;
    }

}
