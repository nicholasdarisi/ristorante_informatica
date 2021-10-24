package Model;

import javafx.scene.control.Tab;

import java.util.Map;

public class Amministrazione {
    public String nome;
    public Ordine ordini;
    public Amministrazione(String nome ){
        this.nome = nome;
    }

    public String getOrder(Ordine ordine){
        ordini = ordine;

        return nome + " : ordine preso";
    }

    public String ChangeOrder(String name,int qty,int tavolo){
        ordini.ordini.get(tavolo).replace(name,qty);

        return nome + " : Piatto " + name + "" + " modificato con successo !!";
    }

    public String DeleteOrder(String name,int tavolo){
        ordini.ordini.get(tavolo).replace(name,0);

        return nome + " : Piatto " + name + " eliminato con successo !!";
    }
}
