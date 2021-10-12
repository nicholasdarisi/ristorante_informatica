package View;

import javax.swing.JFrame;

public class Grafica {

	private JFrame frame;
	
	public Grafica() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void mostra() {
		frame.setVisible(true);
	}
	
	

}
