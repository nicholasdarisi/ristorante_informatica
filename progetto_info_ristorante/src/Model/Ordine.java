package Model;

import java.io.*;
import java.util.*;

public class Ordine extends Menu implements Serializable{
    protected ArrayList<Map<String, Integer>> ordini;
    public ArrayList<Map<String, Integer>> getOrdini(){
        return ordini;
    }
}
