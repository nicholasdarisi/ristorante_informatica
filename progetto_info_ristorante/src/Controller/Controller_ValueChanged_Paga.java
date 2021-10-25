package Controller;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.Cassa;
import Model.Ordine;
import View.Grafica_tavoli;

public class Controller_ValueChanged_Paga implements ListSelectionListener{
	
	Cassa c;
	Ordine o;
	Grafica_tavoli g;

	public Controller_ValueChanged_Paga(Cassa c, Ordine o, Grafica_tavoli g) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.g = g;
		g.registraValueChanged(this);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		c.refreshOrder();
		//g.setNumeri(o.getTavolo(g.getIndex()));
		
	}
	
	

}
