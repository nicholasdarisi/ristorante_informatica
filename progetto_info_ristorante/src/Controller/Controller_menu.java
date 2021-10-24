package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Amministrazione;
import Model.Cameriere;
import Model.Cassa;
import Model.Cucina;
import Model.Ordine;
import View.Grafica_cucina;
import View.Grafica_menu;

public class Controller_menu implements ActionListener{
	Amministrazione a;
	Cameriere cam;
	Cucina cuc;
	Cassa cas;
	Ordine o;
	Grafica_menu g;
	Grafica_cucina g_c;
	String check;
	
	public Controller_menu(Amministrazione a, Cameriere cam, Cucina cuc, Cassa cas, Ordine o, Grafica_menu g, Grafica_cucina g_c) {
		this.a = a;
		this.cam = cam;
		this.cuc = cuc;
		this.cas = cas;
		this.o = o;
		this.g = g;
		this.g_c = g_c;
		g.registraController(this);
	}
	
	public void inizio() {
		g.mostra();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//ordina
		if (e.getSource() == g.getButton(0)) { 
			check = cam.receiveOrder(g.getOrdine());
			//g.setText(check);
			//o = Save.loadOrdine();
			//g.setList(o.getOrdini());
			//g_c.setList(o.getOrdini());
		}
		
		//reset
		if (e.getSource() == g.getButton(1)) {
			g.reset();
		}
		
		
		//modifica
		if (e.getSource() == g.getButton(2)) {
			//int i = g.getIndex();
			//if (i >=0){
			//a.ChangeOrder(g.getOrdine(), i);
			//g.setText(check);
			//o = Save.loadOrdine();
			//g.setList(o.getOrdini());
			//g_c.setList(o.getOrdini());
			//}
			//g.setText("Seleziona qualcosa");
			
		}

		
	}

}
