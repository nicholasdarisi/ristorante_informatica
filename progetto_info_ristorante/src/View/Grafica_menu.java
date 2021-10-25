package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingConstants;

import Controller.Controller_ValueChanged_Cucina;
import Controller.Controller_ValueChanged_Menu;
import Controller.Controller_menu;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.SpinnerNumberModel;

public class Grafica_menu {

	private JFrame frmMenu;
	private JTextField txtMen;
	private JTextField txtAntipasti;
	private JTextField txtPrimi;
	private JTextField txtSecondi;
	private JTextField txtContorni;
	private JTextField txtBevande;
	private JTextField txtDolci;
	private JTextField txtBattilarda;
	private JTextField txtTagliatelle;
	private JTextField txtRavioli;
	private JTextField txtFaraona;
	private JTextField txtGrigliata;
	private JTextField txtPatate;
	private JTextField txtVerdure;
	private JTextField txtInsalata;
	private JTextField txtAcqua;
	private JTextField txtPepsi;
	private JTextField txtVino;
	private JTextField txtCaffe;
	private JTextField txtTiramisu;
	private JSpinner spinner0;
	private JSpinner spinner1;
	private JSpinner spinner2;
	private JSpinner spinner3;
	private JSpinner spinner4;
	private JSpinner spinner5;
	private JSpinner spinner6;
	private JSpinner spinner7;
	private JSpinner spinner8;
	private JSpinner spinner9;
	private JSpinner spinner10;
	private JSpinner spinner11;
	private JSpinner spinner12;
	private JButton btnOrdina;
	private JButton btnResetta;
	private JLabel lblSfondo;
	private JButton btnModifica;
	private JList<String> listMenu;
	private JScrollPane scrollPaneMenu;
	private JTextField txtInfo;
	private ListModel<String> model;
	private JButton btnCancella;
	
	public Grafica_menu() {
		frmMenu = new JFrame();
		frmMenu.setIconImage(Toolkit.getDefaultToolkit().getImage(Grafica.class.getResource("/Img/icona.jpg")));
		frmMenu.setTitle("Men\u00F9");
		frmMenu.setResizable(false);
		frmMenu.setBounds(100, 100, 1200, 480);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		txtMen = new JTextField();
		txtMen.setBackground(Color.WHITE);
		txtMen.setForeground(Color.RED);
		txtMen.setFont(new Font("Kristen ITC", Font.PLAIN, 40));
		txtMen.setHorizontalAlignment(SwingConstants.CENTER);
		txtMen.setText("Men\u00F9");
		txtMen.setEditable(false);
		txtMen.setBounds(25, 13, 120, 50);
		frmMenu.getContentPane().add(txtMen);
		txtMen.setColumns(10);
		
		spinner0 = new JSpinner();
		spinner0.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner0.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner0.setBounds(415, 133, 50, 30);
		frmMenu.getContentPane().add(spinner0);
		
		txtAntipasti = new JTextField();
		txtAntipasti.setBackground(Color.WHITE);
		txtAntipasti.setForeground(Color.BLUE);
		txtAntipasti.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtAntipasti.setText("Antipasti");
		txtAntipasti.setHorizontalAlignment(SwingConstants.CENTER);
		txtAntipasti.setEditable(false);
		txtAntipasti.setColumns(10);
		txtAntipasti.setBounds(25, 80, 200, 40);
		frmMenu.getContentPane().add(txtAntipasti);
		
		txtPrimi = new JTextField();
		txtPrimi.setBackground(Color.WHITE);
		txtPrimi.setForeground(Color.BLUE);
		txtPrimi.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtPrimi.setText("Primi");
		txtPrimi.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrimi.setEditable(false);
		txtPrimi.setColumns(10);
		txtPrimi.setBounds(502, 76, 200, 40);
		frmMenu.getContentPane().add(txtPrimi);
		
		txtSecondi = new JTextField();
		txtSecondi.setBackground(Color.WHITE);
		txtSecondi.setForeground(Color.BLUE);
		txtSecondi.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtSecondi.setText("Secondi");
		txtSecondi.setHorizontalAlignment(SwingConstants.CENTER);
		txtSecondi.setEditable(false);
		txtSecondi.setColumns(10);
		txtSecondi.setBounds(869, 80, 200, 40);
		frmMenu.getContentPane().add(txtSecondi);
		
		txtContorni = new JTextField();
		txtContorni.setBackground(Color.WHITE);
		txtContorni.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtContorni.setForeground(Color.BLUE);
		txtContorni.setText("Contorni");
		txtContorni.setHorizontalAlignment(SwingConstants.CENTER);
		txtContorni.setEditable(false);
		txtContorni.setColumns(10);
		txtContorni.setBounds(25, 254, 200, 40);
		frmMenu.getContentPane().add(txtContorni);
		
		txtBevande = new JTextField();
		txtBevande.setBackground(Color.WHITE);
		txtBevande.setForeground(Color.BLUE);
		txtBevande.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtBevande.setText("Bevande");
		txtBevande.setHorizontalAlignment(SwingConstants.CENTER);
		txtBevande.setEditable(false);
		txtBevande.setColumns(10);
		txtBevande.setBounds(302, 254, 200, 40);
		frmMenu.getContentPane().add(txtBevande);
		
		txtDolci = new JTextField();
		txtDolci.setBackground(Color.WHITE);
		txtDolci.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtDolci.setForeground(Color.BLUE);
		txtDolci.setText("Dolci e caff\u00E8");
		txtDolci.setHorizontalAlignment(SwingConstants.CENTER);
		txtDolci.setEditable(false);
		txtDolci.setColumns(10);
		txtDolci.setBounds(539, 254, 200, 40);
		frmMenu.getContentPane().add(txtDolci);
		
		txtBattilarda = new JTextField();
		txtBattilarda.setBackground(Color.WHITE);
		txtBattilarda.setText("Battilarda con Salumi e piadine farcite");
		txtBattilarda.setHorizontalAlignment(SwingConstants.CENTER);
		txtBattilarda.setForeground(Color.BLACK);
		txtBattilarda.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtBattilarda.setEditable(false);
		txtBattilarda.setColumns(10);
		txtBattilarda.setBounds(25, 133, 390, 30);
		frmMenu.getContentPane().add(txtBattilarda);
		
		txtTagliatelle = new JTextField();
		txtTagliatelle.setBackground(Color.WHITE);
		txtTagliatelle.setText("Tagliatelle al rag\u00F9");
		txtTagliatelle.setHorizontalAlignment(SwingConstants.CENTER);
		txtTagliatelle.setForeground(Color.BLACK);
		txtTagliatelle.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtTagliatelle.setEditable(false);
		txtTagliatelle.setColumns(10);
		txtTagliatelle.setBounds(502, 131, 190, 30);
		frmMenu.getContentPane().add(txtTagliatelle);
		
		txtRavioli = new JTextField();
		txtRavioli.setBackground(Color.WHITE);
		txtRavioli.setText("Ravioli ai porcini e scalogno");
		txtRavioli.setHorizontalAlignment(SwingConstants.CENTER);
		txtRavioli.setForeground(Color.BLACK);
		txtRavioli.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtRavioli.setEditable(false);
		txtRavioli.setColumns(10);
		txtRavioli.setBounds(502, 174, 280, 30);
		frmMenu.getContentPane().add(txtRavioli);
		
		spinner1 = new JSpinner();
		spinner1.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner1.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner1.setBounds(692, 131, 50, 30);
		frmMenu.getContentPane().add(spinner1);
		
		spinner2 = new JSpinner();
		spinner2.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner2.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner2.setBounds(782, 174, 50, 30);
		frmMenu.getContentPane().add(spinner2);
		
		txtFaraona = new JTextField();
		txtFaraona.setBackground(Color.WHITE);
		txtFaraona.setText("Faraona al coccio");
		txtFaraona.setHorizontalAlignment(SwingConstants.CENTER);
		txtFaraona.setForeground(Color.BLACK);
		txtFaraona.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtFaraona.setEditable(false);
		txtFaraona.setColumns(10);
		txtFaraona.setBounds(869, 131, 190, 30);
		frmMenu.getContentPane().add(txtFaraona);
		
		txtGrigliata = new JTextField();
		txtGrigliata.setBackground(Color.WHITE);
		txtGrigliata.setText("Grigliata mista di mare");
		txtGrigliata.setHorizontalAlignment(SwingConstants.CENTER);
		txtGrigliata.setForeground(Color.BLACK);
		txtGrigliata.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtGrigliata.setEditable(false);
		txtGrigliata.setColumns(10);
		txtGrigliata.setBounds(869, 174, 230, 30);
		frmMenu.getContentPane().add(txtGrigliata);
		
		spinner3 = new JSpinner();
		spinner3.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner3.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner3.setBounds(1059, 131, 50, 30);
		frmMenu.getContentPane().add(spinner3);
		
		spinner4 = new JSpinner();
		spinner4.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner4.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner4.setBounds(1099, 174, 50, 30);
		frmMenu.getContentPane().add(spinner4);
		
		txtPatate = new JTextField();
		txtPatate.setBackground(Color.WHITE);
		txtPatate.setText("Patate al forno");
		txtPatate.setHorizontalAlignment(SwingConstants.CENTER);
		txtPatate.setForeground(Color.BLACK);
		txtPatate.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtPatate.setEditable(false);
		txtPatate.setColumns(10);
		txtPatate.setBounds(25, 307, 160, 30);
		frmMenu.getContentPane().add(txtPatate);
		
		txtVerdure = new JTextField();
		txtVerdure.setBackground(Color.WHITE);
		txtVerdure.setText("Verdure gratinate");
		txtVerdure.setHorizontalAlignment(SwingConstants.CENTER);
		txtVerdure.setForeground(Color.BLACK);
		txtVerdure.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtVerdure.setEditable(false);
		txtVerdure.setColumns(10);
		txtVerdure.setBounds(25, 350, 190, 30);
		frmMenu.getContentPane().add(txtVerdure);
		
		txtInsalata = new JTextField();
		txtInsalata.setBackground(Color.WHITE);
		txtInsalata.setText("Insalata mista");
		txtInsalata.setHorizontalAlignment(SwingConstants.CENTER);
		txtInsalata.setForeground(Color.BLACK);
		txtInsalata.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtInsalata.setEditable(false);
		txtInsalata.setColumns(10);
		txtInsalata.setBounds(25, 393, 150, 30);
		frmMenu.getContentPane().add(txtInsalata);
		
		spinner5 = new JSpinner();
		spinner5.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner5.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner5.setBounds(185, 307, 50, 30);
		frmMenu.getContentPane().add(spinner5);
		
		spinner6 = new JSpinner();
		spinner6.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner6.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner6.setBounds(215, 350, 50, 30);
		frmMenu.getContentPane().add(spinner6);
		
		spinner7 = new JSpinner();
		spinner7.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner7.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner7.setBounds(175, 393, 50, 30);
		frmMenu.getContentPane().add(spinner7);
		
		txtAcqua = new JTextField();
		txtAcqua.setBackground(Color.WHITE);
		txtAcqua.setText("Acqua");
		txtAcqua.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcqua.setForeground(Color.BLACK);
		txtAcqua.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtAcqua.setEditable(false);
		txtAcqua.setColumns(10);
		txtAcqua.setBounds(302, 307, 100, 30);
		frmMenu.getContentPane().add(txtAcqua);
		
		txtPepsi = new JTextField();
		txtPepsi.setBackground(Color.WHITE);
		txtPepsi.setText("Pepsi Cola");
		txtPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		txtPepsi.setForeground(Color.BLACK);
		txtPepsi.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtPepsi.setEditable(false);
		txtPepsi.setColumns(10);
		txtPepsi.setBounds(302, 350, 130, 30);
		frmMenu.getContentPane().add(txtPepsi);
		
		txtVino = new JTextField();
		txtVino.setBackground(Color.WHITE);
		txtVino.setText("Vino rosso");
		txtVino.setHorizontalAlignment(SwingConstants.CENTER);
		txtVino.setForeground(Color.BLACK);
		txtVino.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtVino.setEditable(false);
		txtVino.setColumns(10);
		txtVino.setBounds(302, 393, 130, 30);
		frmMenu.getContentPane().add(txtVino);
		
		spinner8 = new JSpinner();
		spinner8.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner8.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner8.setBounds(402, 307, 50, 30);
		frmMenu.getContentPane().add(spinner8);
		
		spinner9 = new JSpinner();
		spinner9.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner9.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner9.setBounds(432, 350, 50, 30);
		frmMenu.getContentPane().add(spinner9);
		
		spinner10 = new JSpinner();
		spinner10.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner10.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner10.setBounds(432, 393, 50, 30);
		frmMenu.getContentPane().add(spinner10);
		
		txtCaffe = new JTextField();
		txtCaffe.setBackground(Color.WHITE);
		txtCaffe.setText("Caff\u00E8");
		txtCaffe.setHorizontalAlignment(SwingConstants.CENTER);
		txtCaffe.setForeground(Color.BLACK);
		txtCaffe.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtCaffe.setEditable(false);
		txtCaffe.setColumns(10);
		txtCaffe.setBounds(539, 307, 100, 30);
		frmMenu.getContentPane().add(txtCaffe);
		
		txtTiramisu = new JTextField();
		txtTiramisu.setBackground(Color.WHITE);
		txtTiramisu.setText("Tiramis\u00F9");
		txtTiramisu.setHorizontalAlignment(SwingConstants.CENTER);
		txtTiramisu.setForeground(Color.BLACK);
		txtTiramisu.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtTiramisu.setEditable(false);
		txtTiramisu.setColumns(10);
		txtTiramisu.setBounds(539, 350, 100, 30);
		frmMenu.getContentPane().add(txtTiramisu);
		
		spinner11 = new JSpinner();
		spinner11.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner11.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner11.setBounds(639, 307, 50, 30);
		frmMenu.getContentPane().add(spinner11);
		
		spinner12 = new JSpinner();
		spinner12.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner12.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		spinner12.setBounds(639, 350, 50, 30);
		frmMenu.getContentPane().add(spinner12);
		
		btnOrdina = new JButton("Ordina");
		btnOrdina.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnOrdina.setBounds(1019, 254, 130, 30);
		frmMenu.getContentPane().add(btnOrdina);
		
		btnResetta = new JButton("Resetta");
		btnResetta.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnResetta.setBounds(1019, 393, 130, 30);
		frmMenu.getContentPane().add(btnResetta);
		
		btnModifica = new JButton("Modifica");
		btnModifica.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnModifica.setBounds(1019, 297, 130, 30);
		frmMenu.getContentPane().add(btnModifica);
		
		listMenu = new JList<String>();
		listMenu.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		listMenu.setModel(model);
		listMenu.setBounds(105, 640, 349, 113);
		
		scrollPaneMenu = new JScrollPane(listMenu);
		scrollPaneMenu.setBounds(782, 254, 215, 169);
		frmMenu.getContentPane().add(scrollPaneMenu);
        scrollPaneMenu.getViewport().setOpaque(false);
		
		txtInfo = new JTextField();
		txtInfo.setText("Benvenuti al ristorante da Ruiza");
		txtInfo.setHorizontalAlignment(SwingConstants.CENTER);
		txtInfo.setForeground(Color.BLACK);
		txtInfo.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtInfo.setEditable(false);
		txtInfo.setColumns(10);
		txtInfo.setBackground(Color.WHITE);
		txtInfo.setBounds(157, 25, 992, 30);
		frmMenu.getContentPane().add(txtInfo);
		
		btnCancella = new JButton("Cancella");
		btnCancella.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnCancella.setBounds(1019, 340, 130, 30);
		frmMenu.getContentPane().add(btnCancella);
		
		lblSfondo = new JLabel("");
		lblSfondo.setIcon(new ImageIcon(Grafica.class.getResource("/Img/sfondo.jpg")));
		lblSfondo.setBounds(0, 0, 1194, 445);
		frmMenu.getContentPane().add(lblSfondo);
	}

	public void mostra() {
		frmMenu.setVisible(true);
	}
	
	public void registraController(Controller_menu controller) {
		btnOrdina.addActionListener(controller);
		btnResetta.addActionListener(controller);
		btnModifica.addActionListener(controller);
		btnCancella.addActionListener(controller);
	}
	
	public JButton getButton(int type) {
        switch (type) {
            case 0:
                return btnOrdina;
            case 1:
                return btnResetta;
            case 2:
                return btnModifica;
            case 3:
                return btnCancella;
        }
        return null;
    }
	
	public void registraValueChanged(Controller_ValueChanged_Menu c) {
		listMenu.addListSelectionListener(c);
	}

	public void reset() {
		spinner0.setValue(0);
		spinner1.setValue(0);
		spinner2.setValue(0);
		spinner3.setValue(0);
		spinner4.setValue(0);
		spinner5.setValue(0);
		spinner6.setValue(0);
		spinner7.setValue(0);
		spinner8.setValue(0);
		spinner9.setValue(0);
		spinner10.setValue(0);
		spinner11.setValue(0);
		spinner12.setValue(0);
	}
	
	public int[] getOrdine() {
		int[] piatti = new int[13];
		try {
			piatti[0] = Integer.parseInt((String) spinner0.getValue());
		} catch (Exception e) {
			piatti[0] = 0;
		}
		try {
			piatti[1] = Integer.parseInt((String) spinner1.getValue());
		} catch (Exception e) {
			piatti[1] = 0;
		}
		try {
			piatti[2] = Integer.parseInt((String) spinner2.getValue());
		} catch (Exception e) {
			piatti[2] = 0;
		}
		try {
			piatti[3] = Integer.parseInt((String) spinner3.getValue());
		} catch (Exception e) {
			piatti[3] = 0;
		}
		try {
			piatti[4] = Integer.parseInt((String) spinner4.getValue());
		} catch (Exception e) {
			piatti[4] = 0;
		}
		try {
			piatti[5] = Integer.parseInt((String) spinner5.getValue());
		} catch (Exception e) {
			piatti[5] = 0;
		}
		try {
			piatti[6] = Integer.parseInt((String) spinner6.getValue());
		} catch (Exception e) {
			piatti[6] = 0;
		}
		try {
			piatti[7] = Integer.parseInt((String) spinner7.getValue());
		} catch (Exception e) {
			piatti[7] = 0;
		}
		try {
			piatti[8] = Integer.parseInt((String) spinner8.getValue());
		} catch (Exception e) {
			piatti[8] = 0;
		}
		try {
			piatti[9] = Integer.parseInt((String) spinner9.getValue());
		} catch (Exception e) {
			piatti[9] = 0;
		}
		try {
			piatti[10] = Integer.parseInt((String) spinner10.getValue());
		} catch (Exception e) {
			piatti[10] = 0;
		}
		try {
			piatti[11] = Integer.parseInt((String) spinner11.getValue());
		} catch (Exception e) {
			piatti[11] = 0;
		}
		try {
			piatti[12] = Integer.parseInt((String) spinner12.getValue());
		} catch (Exception e) {
			piatti[12] = 0;
		}
		for (int i=0; i<13 ; i++) {
			if (piatti[i]<0) {
				piatti[i]=0;
			}
		}
		reset();
		return piatti;
	}
	
	public int getIndex() {
		return listMenu.getSelectedIndex();
	}
	
	public void setList(ArrayList<?> a) {
		listMenu.removeAll();
		for(int i=0; i<a.size(); i++) {
			listMenu.add((Component) a.get(i));
		}
	}
	
	public void remove(int i) {
		listMenu.remove(i);
	}
	
	public void setLabel(String s) {
		txtInfo.setText(s);
	}
	
	public void setSpinner(int[] a) {
		spinner0.setValue(a[0]);
		spinner1.setValue(a[1]);
		spinner2.setValue(a[2]);
		spinner3.setValue(a[3]);
		spinner4.setValue(a[4]);
		spinner5.setValue(a[5]);
		spinner6.setValue(a[6]);
		spinner7.setValue(a[7]);
		spinner8.setValue(a[8]);
		spinner9.setValue(a[9]);
		spinner10.setValue(a[10]);
		spinner11.setValue(a[11]);
		spinner12.setValue(a[12]);
	}
}
