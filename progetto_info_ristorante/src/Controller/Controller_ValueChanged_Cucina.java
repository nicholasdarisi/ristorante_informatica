package Controller;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.Cucina;
import Model.Ordine;
import View.Grafica_cucina;

public class Controller_ValueChanged_Cucina implements ListSelectionListener{
	
	Cucina c;
	Grafica_cucina g;

	public Controller_ValueChanged_Cucina(Cucina c,Grafica_cucina g) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.g = g;
		g.registraValueChanged(this);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		c.refreshOrder();
		g.setList(c.getOrder().getTavolo(g.getIndex()));
		//g.setNumeri(o.getTavolo(g.getIndex()));
		
	}
	
	

}
