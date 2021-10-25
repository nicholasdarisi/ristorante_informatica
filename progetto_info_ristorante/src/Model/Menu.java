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
    public static Map<String ,Float> menu_price;
    public static String filePath;
    static {
        filePath = "ordine.dar";
        menu  = new HashMap<String, Integer>();
        menu_price = new HashMap<String ,Float>();
        // Antipasti
        menu.put("Battilarda con Salumi e piadine farcite",0);
        menu_price.put("Battilarda con Salumi e piadine farcite",5.5f);
        //Primi
        menu.put("Tagliatelle al ragu",0);
        menu_price.put("Tagliatelle al ragu",6.5f);
        menu.put("Ravioli ai porcini e scalogno",0);
        menu_price.put("Ravioli ai porcini e scalogno",4.0f);
        //Secondi
        menu.put("Faraona al coccio",0);
        menu_price.put("Faraona al coccio",8.0f);
        menu.put("Grigliata mista di carne",0);
        menu_price.put("Grigliata mista di carne",6.4f);
        //Contorni
        menu.put("Patate al forno",0);
        menu_price.put("Patate al forno",2.0f);
        menu.put("Verdure gratinate",0);
        menu_price.put("Verdure gratinate",4.5f);
        menu.put("Insalata mista",0);
        menu_price.put("Insalata mista",3.8f);
        //Acqua
        menu.put("Acqua",0);
        menu_price.put("Acqua",1.5f);
        menu.put("Pepsi",0);
        menu_price.put("Pepsi",1.8f);
        menu.put("Vino rosso",0);
        menu_price.put("Vino rosso",20.0f);
        //Dolce
        menu.put("Caffe",0);
        menu_price.put("Caffe",1.3f);
        menu.put("Tiramisu",0);
        menu_price.put("Tiramisu",5.0f);

    }
    protected Map<String ,Integer> copyMenu(){
        Map<String, Integer> menu = new HashMap<String, Integer>(this.menu);
        return menu;
    }
    public static Map<String ,Integer> getNewMenu(){
        return menu;
    }
}
