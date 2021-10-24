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

    public String receiveOrder( Ordine ordini){
        this.ordini = ordini;

        return " Ordine e stato ricevuto !!";
    }

    public String CookOrder(int tavolo){
        final String[] result = {nome + " : \n"};
        ordini.ordini.get(tavolo).forEach(
                (String key, Integer value) -> {
                    if(value > 0){
                        result[0] += value + (value > 1 ? "Piatti " : " Piatto") + " di " + key + " sono stati preparati !!";
                    }
                    ordini.ordini.get(tavolo).replace(key ,0);
                }
        );
        return result[0];
    }



}
