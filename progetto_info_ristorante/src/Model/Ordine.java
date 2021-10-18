package Model;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ordine extends Menu implements Serializable {
    public Map<String, Integer> ordini;

    public Ordine(){
        ordini = menu;
    }

    public String ChangeOrder(String name,int qty){
        ordini.replace(name,qty);

        return "Piatto " + name + " modificato con successo !!";
    }

    public String DeleteOrder(String name){
        ordini.replace(name,0);

        return "Piatto " + name + " eliminato con successo !!";
    }

    public String CockOrder(){
        String result = "";
        ordini.forEach(
                (String key, Integer value) -> {
                    if(value > 0){
                        result = result.concat("")
                    }
                }
        );
        return result;
    }
}
