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

public class Controller_menu implements ActionListener{
	Cameriere cam;
	Grafica_menu g;
	String check;
	
	public Controller_menu(Cameriere cam, Grafica_menu g) {
		this.cam = cam;
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
			check = cam.receiveOrder(g.getOrdine());
			g.setLabel(check);
		}
		
		//reset
		if (e.getSource() == g.getButton(1)) {
			g.reset();
		}
		
		
		//modifica
		if (e.getSource() == g.getButton(2)) {
			int i = g.getIndex();
			if (i >= 0) {
				check = cam.ChangeOrder(g.getOrdine(), i);
				g.setLabel(check);
			}
		}

		if (e.getSource() == g.getButton(3)) {
			int i = g.getIndex();
			if (i >=0){
				check = cam.DeleteOrder(i);
				g.setLabel(check);
			}
			g.reset();
		}
	}

}
