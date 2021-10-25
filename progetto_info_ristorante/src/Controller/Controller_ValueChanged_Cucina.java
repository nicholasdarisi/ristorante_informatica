package Controller;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.Cucina;
import Model.Ordine;
import View.Grafica_cucina;

public class Controller_ValueChanged_Cucina implements ListSelectionListener{
	
	Cucina c;
	Ordine o;
	Grafica_cucina g;

	public Controller_ValueChanged_Cucina(Cucina c, Ordine o, Grafica_cucina g) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.g = g;
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		c.refreshOrder();
		//g.setNumeri(o.getTavolo(g.getIndex()));
		
	}
	
	

}
