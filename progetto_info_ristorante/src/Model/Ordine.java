package Model;

import java.io.*;
import java.util.*;

public class Ordine extends Menu implements Serializable {
    protected ArrayList<Map<String, Integer>> ordini = new ArrayList<Map<String, Integer>>();

    public Ordine() {
        for (int i = 0; i < 10; i++)
            ordini.add(new HashMap<String, Integer>(Menu.getNewMenu()));
    }

    public ArrayList<Map<String, Integer>> getOrdini() {
        return ordini;
    }

    public int[] getTavolo(int tavolo) {
        int result[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = 0;
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
