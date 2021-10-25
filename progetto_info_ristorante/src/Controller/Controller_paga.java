package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Cameriere;
import Model.Cassa;
import Model.Cucina;
import Model.Ordine;
import View.Grafica_tavoli;

public class Controller_paga implements ActionListener{
	Cameriere cam;
	Cucina cuc;
	Cassa cas;
	Ordine o;
	Grafica_tavoli g;
	String check;
	
	public Controller_paga( Cameriere cam, Cucina cuc, Cassa cas, Ordine o, Grafica_tavoli g) {
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
	
		//paga
		if (e.getSource() == g.getButton(0)) {
			int i = g.getIndex();
			if (i >= 0){
			g.setImporto(cas.calcolaImporto(i));
			g.remove(i);
			}
			//g.setLabel("Seleziona qualcosa");
		}
		
	}

}
