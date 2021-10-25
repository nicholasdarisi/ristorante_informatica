package Controller;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Model.Cameriere;
import Model.Cucina;
import Model.Ordine;
import View.Grafica_menu;


public class Controller_ValueChanged_Menu implements ListSelectionListener{
	Cameriere c;
	Grafica_menu g;
	
	public Controller_ValueChanged_Menu(Cameriere c, Grafica_menu g) {
		this.c = c;
		this.g = g;
		g.registraValueChanged(this);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		g.setSpinner(c.getOrder().getTavolo(g.getIndex()));
	}

}
