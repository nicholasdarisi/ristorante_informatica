package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import Model.Amministrazione;
import Model.Cameriere;
import Model.Cassa;
import Model.Cucina;
import Model.Ordine;
import View.Grafica_cucina;
import View.Grafica_menu;
import View.Grafica_tavoli;

public class Controller_cucina implements ActionListener{
	Amministrazione a;
	Cameriere cam;
	Cucina cuc;
	Cassa cas;
	Ordine o;
	Grafica_cucina g;
	Grafica_menu g_m;
	Grafica_tavoli g_t;
	String check;
	
	public Controller_cucina(Amministrazione a, Cameriere cam, Cucina cuc, Cassa cas, Ordine o, Grafica_cucina g, Grafica_menu g_m, Grafica_tavoli g_t) {
		this.a = a;
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
			//if (i >= 0){
			check = cuc.CookOrder(i);
			//g.setText(check);
			//g.Remove(i);
			//g_m.Remove(i);
			//o = Save.loadOrdine();
			//g_t.setList(o.getOrdini());
			//}
			//g.setText("Seleziona qualcosa");
			
		}
		
		
	}

}
