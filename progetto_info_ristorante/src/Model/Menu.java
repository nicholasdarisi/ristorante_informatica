package Model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Oniichan
 * @data 18/10/2021
 * @project ristorante_informatica
 */
public class Menu {
    public static Map<String ,Integer> menu;
    public static String filePath;
    static {
        filePath = "ordine.dar";
        menu  = new HashMap<String, Integer>();
        // Antipasti
        menu.put("Battilarda con Salumi e piadine farcite",0);
        //Primi
        menu.put("Tagliatelle al ragu",0);
        menu.put("Ravioli ai porcini e scalogno",0);
        //Secondi
        menu.put("Faraona al coccio",0);
        menu.put("Grigliata mista di carne",0);
        //Contorni
        menu.put("Patate al forno",0);
        menu.put("Verdure gratinate",0);
        menu.put("Insalata mista",0);
        //Acqua
        menu.put("Acqua",0);
        menu.put("Pepsi",0);
        menu.put("Vino rosso",0);
        //Dolce
        menu.put("Caffe",0);
        menu.put("Tiramisu",0);

    }
}
