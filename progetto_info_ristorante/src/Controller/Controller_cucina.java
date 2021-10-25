package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Cameriere;
import Model.Cassa;
import Model.Cucina;
import Model.Ordine;
import Model.Save;
import View.Grafica_cucina;
import View.Grafica_menu;
import View.Grafica_tavoli;

public class Controller_cucina implements ActionListener{
	Cameriere cam;
	Cucina cuc;
	Cassa cas;
	Ordine o;
	Grafica_cucina g;
	Grafica_menu g_m;
	Grafica_tavoli g_t;
	String check;
	
	public Controller_cucina(Cameriere cam, Cucina cuc, Cassa cas, Ordine o, Grafica_cucina g, Grafica_menu g_m, Grafica_tavoli g_t) {
		this.cam = cam;
		this.cuc = cuc;
		this.cas = cas;
		this.o = o;
		this.g = g;
		this.g_m = g_m;
		this.g_t = g_t;
		g.registraController(this);
	}
	
	public void inizio() {
		g.mostra();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//cucina
		if (e.getSource() == g.getButton(0)) {
			int i = g.getIndex();
			if (i >= 0){
			check = cuc.CookOrder(i);
			g.setLabel(check);
			g.remove(i);
			g_m.remove(i);
			o = Save.loadOrdine();
			g_t.setList(o.getOrdini());
			}
			g.setLabel("Seleziona qualcosa");
			
		}
		
		
	}

}
