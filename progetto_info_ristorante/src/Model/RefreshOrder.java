package Model;

import View.Grafica_cucina;
import View.Grafica_menu;
import View.Grafica_tavoli;

import java.net.SocketTimeoutException;

/**
 * @author Oniichan
 * @data 25/10/2021
 * @project ristorante_informatica
 */
public class RefreshOrder implements Runnable {

    Cucina cucina;
    Cameriere cameriere;
    Cassa cassa;
    Grafica_menu g_m;
    Grafica_cucina g_c;
    Grafica_tavoli g_t;

    public RefreshOrder(Cucina cucina, Cassa cassa, Cameriere cameriere, Grafica_tavoli g_t, Grafica_cucina g_c, Grafica_menu g_m) {
        this.cameriere = cameriere;
        this.cucina = cucina;
        this.cassa = cassa;
        this.g_c = g_c;
        this.g_m = g_m;
        this.g_t = g_t;

    }

    @Override
    public void run() {
        Save.saveOrdine(new Ordine());
        while (true) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

            cameriere.refreshOrder();
            cassa.refreshOrder();
            if (g_t.getIndex() != -1)
                g_t.setList(cassa.getOrder().getTavolo(g_t.getIndex()));
            cucina.refreshOrder();
            if (g_c.getIndex() != -1){
                g_c.setList(cucina.getOrder().getTavolo(g_c.getIndex()));
                g_c.setQty(cucina.getOrder().getQty()[g_c.getIndex()]);
            }


        }
    }
}
