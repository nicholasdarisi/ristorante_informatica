package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Amministrazione;
import Model.Cameriere;
import Model.Cassa;
import Model.Cucina;
import Model.Ordine;
import View.Grafica;
import View.Grafica_tavoli;

public class Controller_paga implements ActionListener{
	Amministrazione a;
	Cameriere cam;
	Cucina cuc;
	Cassa cas;
	Ordine o;
	Grafica_tavoli g;
	String check;
	
	public Controller_paga(Amministrazione a, Cameriere cam, Cucina cuc, Cassa cas, Ordine o, Grafica_tavoli g) {
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
	
		//paga
		if (e.getSource() == g.getButton(0)) {
			
			
		}
		
	}

}
