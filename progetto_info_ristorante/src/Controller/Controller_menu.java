package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Amministrazione;
import Model.Cameriere;
import Model.Cassa;
import Model.Cucina;
import Model.Ordine;
import View.Grafica_menu;

public class Controller_menu implements ActionListener{
	Amministrazione a;
	Cameriere cam;
	Cucina cuc;
	Cassa cas;
	Ordine o;
	Grafica_menu g;
	String check;
	
	public Controller_menu(Amministrazione a, Cameriere cam, Cucina cuc, Cassa cas, Ordine o, Grafica_menu g) {
		this.a = a;
		this.cam = cam;
		this.cuc = cuc;
		this.cas = cas;
		this.o = o;
		this.g = g;
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
			//check = cam.receiveOrder(g.ordine());
			//informazioni.setText(check);
			
		}
		
		//reset
		if (e.getSource() == g.getButton(1)) {
			g.reset();
		}
		
		
		//modifica
		if (e.getSource() == g.getButton(2)) {
			
			
		}

		
	}

}
