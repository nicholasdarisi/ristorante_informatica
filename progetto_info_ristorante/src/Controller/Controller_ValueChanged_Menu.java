package Controller;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Model.Cameriere;
import Model.Cucina;
import Model.Ordine;
import View.Grafica_menu;


public class Controller_ValueChanged_Menu implements ListSelectionListener{
	Cameriere c;
	Ordine o;
	Grafica_menu g;
	
	public Controller_ValueChanged_Menu(Cameriere c, Ordine o, Grafica_menu g) {
		this.c = c;
		this.o = o;
		this.g = g;
		g.registraValueChanged(this);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("haha");
		c.refreshOrder();
		g.setSpinner(o.getTavolo(g.getIndex()));
	}

}
