package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class Grafica {

	private JFrame frmRistorante;
	private JTextField txtMen;
	private JTextField txtCucina;
	private JTextField txtTavoli;
	private JTextField txtAntipasti;
	private JTextField txtPrimi;
	private JTextField txtSecondi;
	private JTextField txtContorni;
	private JTextField txtBevande;
	private JTextField txtDolciECaff;
	private JTextField txtBattilardaConSalumi;
	private JTextField txtTagliatelleAlRag;
	private JTextField txtRavioliAiPorcini;
	private JTextField txtFaraonaAlCoccio;
	private JTextField txtGrigliataMistaDi;
	private JTextField txtPatateAlForno;
	private JTextField txtVerdureGratinate;
	private JTextField txtInsalataMista;
	private JTextField txtAcqua;
	private JTextField txtPepsiCola;
	private JTextField txtVinoRosso;
	private JTextField txtCaff;
	private JTextField txtTiramis;
	private JButton btnResetta;
	private JButton btnModifica;
	private JButton btnCucina;
	private JButton btnPaga;
	private JTextField txtInformazioniBenvenutiAl;
	
	
	
	public Grafica() {
		frmRistorante = new JFrame();
		frmRistorante.setTitle("Ristorante");
		frmRistorante.setResizable(false);
		frmRistorante.setBounds(100, 100, 1200, 900);
		frmRistorante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRistorante.getContentPane().setLayout(null);
		
		txtMen = new JTextField();
		txtMen.setBackground(Color.WHITE);
		txtMen.setForeground(Color.RED);
		txtMen.setFont(new Font("Kristen ITC", Font.PLAIN, 40));
		txtMen.setHorizontalAlignment(SwingConstants.CENTER);
		txtMen.setText("Men\u00F9");
		txtMen.setEditable(false);
		txtMen.setBounds(542, 13, 120, 50);
		frmRistorante.getContentPane().add(txtMen);
		txtMen.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(415, 133, 50, 30);
		frmRistorante.getContentPane().add(spinner);
		
		txtCucina = new JTextField();
		txtCucina.setBackground(Color.WHITE);
		txtCucina.setForeground(Color.RED);
		txtCucina.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtCucina.setText("Cucina");
		txtCucina.setHorizontalAlignment(SwingConstants.CENTER);
		txtCucina.setEditable(false);
		txtCucina.setColumns(10);
		txtCucina.setBounds(782, 553, 116, 50);
		frmRistorante.getContentPane().add(txtCucina);
		
		txtTavoli = new JTextField();
		txtTavoli.setBackground(Color.WHITE);
		txtTavoli.setForeground(Color.RED);
		txtTavoli.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtTavoli.setText("Tavoli");
		txtTavoli.setHorizontalAlignment(SwingConstants.CENTER);
		txtTavoli.setEditable(false);
		txtTavoli.setColumns(10);
		txtTavoli.setBounds(215, 553, 116, 50);
		frmRistorante.getContentPane().add(txtTavoli);
		
		txtAntipasti = new JTextField();
		txtAntipasti.setBackground(Color.WHITE);
		txtAntipasti.setForeground(Color.BLUE);
		txtAntipasti.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtAntipasti.setText("Antipasti");
		txtAntipasti.setHorizontalAlignment(SwingConstants.CENTER);
		txtAntipasti.setEditable(false);
		txtAntipasti.setColumns(10);
		txtAntipasti.setBounds(25, 80, 200, 40);
		frmRistorante.getContentPane().add(txtAntipasti);
		
		txtPrimi = new JTextField();
		txtPrimi.setBackground(Color.WHITE);
		txtPrimi.setForeground(Color.BLUE);
		txtPrimi.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtPrimi.setText("Primi");
		txtPrimi.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrimi.setEditable(false);
		txtPrimi.setColumns(10);
		txtPrimi.setBounds(502, 76, 200, 40);
		frmRistorante.getContentPane().add(txtPrimi);
		
		txtSecondi = new JTextField();
		txtSecondi.setBackground(Color.WHITE);
		txtSecondi.setForeground(Color.BLUE);
		txtSecondi.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtSecondi.setText("Secondi");
		txtSecondi.setHorizontalAlignment(SwingConstants.CENTER);
		txtSecondi.setEditable(false);
		txtSecondi.setColumns(10);
		txtSecondi.setBounds(869, 80, 200, 40);
		frmRistorante.getContentPane().add(txtSecondi);
		
		txtContorni = new JTextField();
		txtContorni.setBackground(Color.WHITE);
		txtContorni.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtContorni.setForeground(Color.BLUE);
		txtContorni.setText("Contorni");
		txtContorni.setHorizontalAlignment(SwingConstants.CENTER);
		txtContorni.setEditable(false);
		txtContorni.setColumns(10);
		txtContorni.setBounds(25, 254, 200, 40);
		frmRistorante.getContentPane().add(txtContorni);
		
		txtBevande = new JTextField();
		txtBevande.setBackground(Color.WHITE);
		txtBevande.setForeground(Color.BLUE);
		txtBevande.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtBevande.setText("Bevande");
		txtBevande.setHorizontalAlignment(SwingConstants.CENTER);
		txtBevande.setEditable(false);
		txtBevande.setColumns(10);
		txtBevande.setBounds(502, 254, 200, 40);
		frmRistorante.getContentPane().add(txtBevande);
		
		txtDolciECaff = new JTextField();
		txtDolciECaff.setBackground(Color.WHITE);
		txtDolciECaff.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtDolciECaff.setForeground(Color.BLUE);
		txtDolciECaff.setText("Dolci e caff\u00E8");
		txtDolciECaff.setHorizontalAlignment(SwingConstants.CENTER);
		txtDolciECaff.setEditable(false);
		txtDolciECaff.setColumns(10);
		txtDolciECaff.setBounds(869, 254, 200, 40);
		frmRistorante.getContentPane().add(txtDolciECaff);
		
		txtBattilardaConSalumi = new JTextField();
		txtBattilardaConSalumi.setBackground(Color.WHITE);
		txtBattilardaConSalumi.setText("Battilarda con Salumi e piadine farcite");
		txtBattilardaConSalumi.setHorizontalAlignment(SwingConstants.CENTER);
		txtBattilardaConSalumi.setForeground(Color.BLACK);
		txtBattilardaConSalumi.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtBattilardaConSalumi.setEditable(false);
		txtBattilardaConSalumi.setColumns(10);
		txtBattilardaConSalumi.setBounds(25, 133, 390, 30);
		frmRistorante.getContentPane().add(txtBattilardaConSalumi);
		
		txtTagliatelleAlRag = new JTextField();
		txtTagliatelleAlRag.setBackground(Color.WHITE);
		txtTagliatelleAlRag.setText("Tagliatelle al rag\u00F9");
		txtTagliatelleAlRag.setHorizontalAlignment(SwingConstants.CENTER);
		txtTagliatelleAlRag.setForeground(Color.BLACK);
		txtTagliatelleAlRag.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtTagliatelleAlRag.setEditable(false);
		txtTagliatelleAlRag.setColumns(10);
		txtTagliatelleAlRag.setBounds(502, 131, 190, 30);
		frmRistorante.getContentPane().add(txtTagliatelleAlRag);
		
		txtRavioliAiPorcini = new JTextField();
		txtRavioliAiPorcini.setBackground(Color.WHITE);
		txtRavioliAiPorcini.setText("Ravioli ai porcini e scalogno");
		txtRavioliAiPorcini.setHorizontalAlignment(SwingConstants.CENTER);
		txtRavioliAiPorcini.setForeground(Color.BLACK);
		txtRavioliAiPorcini.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtRavioliAiPorcini.setEditable(false);
		txtRavioliAiPorcini.setColumns(10);
		txtRavioliAiPorcini.setBounds(502, 174, 280, 30);
		frmRistorante.getContentPane().add(txtRavioliAiPorcini);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(692, 131, 50, 30);
		frmRistorante.getContentPane().add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(782, 174, 50, 30);
		frmRistorante.getContentPane().add(spinner_7);
		
		txtFaraonaAlCoccio = new JTextField();
		txtFaraonaAlCoccio.setBackground(Color.WHITE);
		txtFaraonaAlCoccio.setText("Faraona al coccio");
		txtFaraonaAlCoccio.setHorizontalAlignment(SwingConstants.CENTER);
		txtFaraonaAlCoccio.setForeground(Color.BLACK);
		txtFaraonaAlCoccio.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtFaraonaAlCoccio.setEditable(false);
		txtFaraonaAlCoccio.setColumns(10);
		txtFaraonaAlCoccio.setBounds(869, 131, 190, 30);
		frmRistorante.getContentPane().add(txtFaraonaAlCoccio);
		
		txtGrigliataMistaDi = new JTextField();
		txtGrigliataMistaDi.setBackground(Color.WHITE);
		txtGrigliataMistaDi.setText("Grigliata mista di mare");
		txtGrigliataMistaDi.setHorizontalAlignment(SwingConstants.CENTER);
		txtGrigliataMistaDi.setForeground(Color.BLACK);
		txtGrigliataMistaDi.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtGrigliataMistaDi.setEditable(false);
		txtGrigliataMistaDi.setColumns(10);
		txtGrigliataMistaDi.setBounds(869, 174, 230, 30);
		frmRistorante.getContentPane().add(txtGrigliataMistaDi);
		
		JSpinner spinner_6_1 = new JSpinner();
		spinner_6_1.setBounds(1059, 131, 50, 30);
		frmRistorante.getContentPane().add(spinner_6_1);
		
		JSpinner spinner_6_2 = new JSpinner();
		spinner_6_2.setBounds(1099, 174, 50, 30);
		frmRistorante.getContentPane().add(spinner_6_2);
		
		txtPatateAlForno = new JTextField();
		txtPatateAlForno.setBackground(Color.WHITE);
		txtPatateAlForno.setText("Patate al forno");
		txtPatateAlForno.setHorizontalAlignment(SwingConstants.CENTER);
		txtPatateAlForno.setForeground(Color.BLACK);
		txtPatateAlForno.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtPatateAlForno.setEditable(false);
		txtPatateAlForno.setColumns(10);
		txtPatateAlForno.setBounds(25, 307, 160, 30);
		frmRistorante.getContentPane().add(txtPatateAlForno);
		
		txtVerdureGratinate = new JTextField();
		txtVerdureGratinate.setBackground(Color.WHITE);
		txtVerdureGratinate.setText("Verdure gratinate");
		txtVerdureGratinate.setHorizontalAlignment(SwingConstants.CENTER);
		txtVerdureGratinate.setForeground(Color.BLACK);
		txtVerdureGratinate.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtVerdureGratinate.setEditable(false);
		txtVerdureGratinate.setColumns(10);
		txtVerdureGratinate.setBounds(25, 350, 190, 30);
		frmRistorante.getContentPane().add(txtVerdureGratinate);
		
		txtInsalataMista = new JTextField();
		txtInsalataMista.setBackground(Color.WHITE);
		txtInsalataMista.setText("Insalata mista");
		txtInsalataMista.setHorizontalAlignment(SwingConstants.CENTER);
		txtInsalataMista.setForeground(Color.BLACK);
		txtInsalataMista.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtInsalataMista.setEditable(false);
		txtInsalataMista.setColumns(10);
		txtInsalataMista.setBounds(25, 393, 150, 30);
		frmRistorante.getContentPane().add(txtInsalataMista);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(185, 307, 50, 30);
		frmRistorante.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(215, 350, 50, 30);
		frmRistorante.getContentPane().add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(175, 393, 50, 30);
		frmRistorante.getContentPane().add(spinner_3);
		
		txtAcqua = new JTextField();
		txtAcqua.setBackground(Color.WHITE);
		txtAcqua.setText("Acqua");
		txtAcqua.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcqua.setForeground(Color.BLACK);
		txtAcqua.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtAcqua.setEditable(false);
		txtAcqua.setColumns(10);
		txtAcqua.setBounds(502, 307, 100, 30);
		frmRistorante.getContentPane().add(txtAcqua);
		
		txtPepsiCola = new JTextField();
		txtPepsiCola.setBackground(Color.WHITE);
		txtPepsiCola.setText("Pepsi Cola");
		txtPepsiCola.setHorizontalAlignment(SwingConstants.CENTER);
		txtPepsiCola.setForeground(Color.BLACK);
		txtPepsiCola.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtPepsiCola.setEditable(false);
		txtPepsiCola.setColumns(10);
		txtPepsiCola.setBounds(502, 350, 130, 30);
		frmRistorante.getContentPane().add(txtPepsiCola);
		
		txtVinoRosso = new JTextField();
		txtVinoRosso.setBackground(Color.WHITE);
		txtVinoRosso.setText("Vino rosso");
		txtVinoRosso.setHorizontalAlignment(SwingConstants.CENTER);
		txtVinoRosso.setForeground(Color.BLACK);
		txtVinoRosso.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtVinoRosso.setEditable(false);
		txtVinoRosso.setColumns(10);
		txtVinoRosso.setBounds(502, 393, 130, 30);
		frmRistorante.getContentPane().add(txtVinoRosso);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(602, 307, 50, 30);
		frmRistorante.getContentPane().add(spinner_1_1);
		
		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.setBounds(632, 350, 50, 30);
		frmRistorante.getContentPane().add(spinner_1_2);
		
		JSpinner spinner_1_3 = new JSpinner();
		spinner_1_3.setBounds(632, 393, 50, 30);
		frmRistorante.getContentPane().add(spinner_1_3);
		
		txtCaff = new JTextField();
		txtCaff.setBackground(Color.WHITE);
		txtCaff.setText("Caff\u00E8");
		txtCaff.setHorizontalAlignment(SwingConstants.CENTER);
		txtCaff.setForeground(Color.BLACK);
		txtCaff.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtCaff.setEditable(false);
		txtCaff.setColumns(10);
		txtCaff.setBounds(869, 307, 100, 30);
		frmRistorante.getContentPane().add(txtCaff);
		
		txtTiramis = new JTextField();
		txtTiramis.setBackground(Color.WHITE);
		txtTiramis.setText("Tiramis\u00F9");
		txtTiramis.setHorizontalAlignment(SwingConstants.CENTER);
		txtTiramis.setForeground(Color.BLACK);
		txtTiramis.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtTiramis.setEditable(false);
		txtTiramis.setColumns(10);
		txtTiramis.setBounds(869, 350, 100, 30);
		frmRistorante.getContentPane().add(txtTiramis);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setBounds(969, 307, 50, 30);
		frmRistorante.getContentPane().add(spinner_1_1_1);
		
		JSpinner spinner_1_1_2 = new JSpinner();
		spinner_1_1_2.setBounds(969, 350, 50, 30);
		frmRistorante.getContentPane().add(spinner_1_1_2);
		
		JButton btnNewButton = new JButton("Ordina");
		btnNewButton.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnNewButton.setBounds(25, 473, 130, 30);
		frmRistorante.getContentPane().add(btnNewButton);
		
		btnResetta = new JButton("Resetta");
		btnResetta.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnResetta.setBounds(167, 473, 130, 30);
		frmRistorante.getContentPane().add(btnResetta);
		
		btnModifica = new JButton("Modifica");
		btnModifica.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnModifica.setBounds(95, 799, 130, 30);
		frmRistorante.getContentPane().add(btnModifica);
		
		btnCucina = new JButton("Cucina");
		btnCucina.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnCucina.setBounds(335, 799, 130, 30);
		frmRistorante.getContentPane().add(btnCucina);
		
		btnPaga = new JButton("Paga");
		btnPaga.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnPaga.setBounds(782, 799, 130, 30);
		frmRistorante.getContentPane().add(btnPaga);
		
		txtInformazioniBenvenutiAl = new JTextField();
		txtInformazioniBenvenutiAl.setText("Informazioni: Benvenuti al ristorante \"Da Ruiza\"");
		txtInformazioniBenvenutiAl.setHorizontalAlignment(SwingConstants.RIGHT);
		txtInformazioniBenvenutiAl.setForeground(Color.BLACK);
		txtInformazioniBenvenutiAl.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtInformazioniBenvenutiAl.setEditable(false);
		txtInformazioniBenvenutiAl.setColumns(10);
		txtInformazioniBenvenutiAl.setBackground(Color.WHITE);
		txtInformazioniBenvenutiAl.setBounds(309, 473, 840, 30);
		frmRistorante.getContentPane().add(txtInformazioniBenvenutiAl);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(105, 640, 349, 113);
		frmRistorante.getContentPane().add(scrollPane);
        scrollPane.getViewport().setOpaque(false);

		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"ciao", "banana", "ugifdkjf"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(0, 0, 1, 1);
		scrollPane.add(list);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Grafica.class.getResource("/Img/sfondo.jpg")));
		lblNewLabel.setBounds(0, 0, 1200, 1000);
		frmRistorante.getContentPane().add(lblNewLabel);
	}

	public void mostra() {
		frmRistorante.setVisible(true);
	}
	
	public JButton getButton(int type) {
        switch (type) {
            case 0:
                //return btnNewButton;
            case 1:
                //return btnNewButton_1;
            case 2:
                //return btnNewButton_2;
            case 3:
                //return btnNewButton_3;
            case 4:
                //return btnNewButton_4;
            case 5:
                //return btnNewButton_5;
        }
        return null;
    }
}
