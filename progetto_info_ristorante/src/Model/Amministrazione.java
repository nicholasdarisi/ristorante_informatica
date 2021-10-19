package Model;

public class Amministrazione extends Ordine{
    public Amministrazione(){

    }



    public String ChangeOrder(String name,int qty){
        ordini.replace(name,qty);

        return "Piatto " + name + " modificato con successo !!";
    }

    public String DeleteOrder(String key){
        ordini.replace(key,0);

        return "Piatto " + key + " eliminato con successo !!";
    }
}
