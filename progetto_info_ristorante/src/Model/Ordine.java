package Model;

import java.io.*;
import java.util.*;

public class Ordine extends Menu implements Serializable{
    protected ArrayList<Map<String, Integer>> ordini = new ArrayList<Map<String, Integer>>();
    public ArrayList<Map<String, Integer>> getOrdini(){
        return ordini;
    }

    public int[] getTavolo(int tavolo){
        int result[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        int i = 0;
        for(Map.Entry<String, Integer> ordine : ordini.get(tavolo).entrySet() ){
            result[i] = ordine.getValue();
            i++;
        }
        return result;
    }
}
