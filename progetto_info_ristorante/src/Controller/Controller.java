package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Amministrazione;
import Model.Cameriere;
import Model.Cassa;
import Model.Cucina;
import Model.Ordine;
import View.Grafica;

public class Controller implements ActionListener{
	Amministrazione a;
	Cameriere cam;
	Cucina cuc;
	Cassa cas;
	Ordine o;
	Grafica g;
	
	public Controller(Amministrazione a, Cameriere cam, Cucina cuc, Cassa cas, Ordine o, Grafica g) {
		this.a = a;
		this.cam = cam;
		this.cuc = cuc;
		this.cas = cas;
		this.o = o;
		this.g = g;
	}
	
	public void inizio() {
		g.mostra();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
