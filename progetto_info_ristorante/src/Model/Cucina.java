package Model;

public class Cucina {
    private Ordine ordini;
    private String nome;


    /***
     * Costruttore
     * @param nome
     */
    public Cucina(String nome){
        this.nome = nome;
    }

    public String setOrder( Ordine ordini){
        this.ordini = ordini;

        return " Ordine e stato ricevuto !!";
    }

    public void refreshOrder(){
        this.ordini = Save.loadOrdine();
    }

    public String CookOrder(int tavolo){
        if(!ordini.isTavolo(tavolo)) return nome + ": Tavolo " + tavolo + " non aperto";
        final String[] result = {nome + " : \n"};
        ordini.ordini.get(tavolo).forEach(
                (String key, Integer value) -> {
                    if(value > 0){
                        result[0] += value + (value > 1 ? "Piatti " : " Piatto") + " di " + key + " sono stati preparati !!";
                    }
                    ordini.ordini.get(tavolo).replace(key ,0);
                }
        );
        Save.saveOrdine(ordini);
        return result[0];
    }



}
