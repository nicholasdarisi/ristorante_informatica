package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Cameriere;
import Model.Cassa;
import Model.Cucina;
import Model.Ordine;
import View.Grafica_tavoli;

public class Controller_paga implements ActionListener{
	Cassa cas;
	Grafica_tavoli g;
	String check;
	
	public Controller_paga( Cassa cas, Grafica_tavoli g) {
		this.cas = cas;
		this.g = g;
		g.registraController(this);
	}
	
	public void inizio() {
		g.mostra();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		//paga
		if (e.getSource() == g.getButton(0)) {
			int i = g.getIndex();
			if (i >= 0){
			g.setLabel(cas.payOrder(g.getIndex()));
			}
		}
		
	}

}
