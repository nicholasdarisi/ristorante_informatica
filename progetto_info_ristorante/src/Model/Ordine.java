package Model;

import java.io.*;
import java.util.*;

public class Ordine extends Menu implements Serializable{
    protected ArrayList<Map<String, Integer>> ordini = new ArrayList<Map<String, Integer>>();
    public ArrayList<Map<String, Integer>> getOrdini(){
        return ordini;
    }
}
