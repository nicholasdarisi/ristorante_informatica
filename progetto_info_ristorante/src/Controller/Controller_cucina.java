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
	Cucina cuc;
	Grafica_cucina g;
	String check;
	
	public Controller_cucina(Cucina cuc, Grafica_cucina g) {
		this.cuc = cuc;
		this.g = g;
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
			}
		}
		
		
	}

}
