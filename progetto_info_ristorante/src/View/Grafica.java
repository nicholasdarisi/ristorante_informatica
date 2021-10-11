package View;

import javax.swing.JFrame;

public class Grafica {

	private JFrame frame;
	
	public Grafica() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void mostra() {
		frame.setVisible(true);
	}
	
	

}
