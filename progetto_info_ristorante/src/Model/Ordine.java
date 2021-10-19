package Model;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ordine extends Menu implements Serializable{
    protected Map<String, Integer> ordini;

    public Ordine(){
        ordini = menu;
    }

}
