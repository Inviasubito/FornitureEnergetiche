package Boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Package_ausiliario.TipoFornitura;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Font;

public class BCreazioneFornitura extends JFrame {

	private JPanel contentPane;
	private JTextField txtCognome;
	private JTextField txtCodiceFiscale;
	private JTextField txtVia;
	private JTextField txtNumeroInterno;
	private JTextField txtNumeroCivico;
	private JTextField txtCodiceAvviamentoPostale;
	private JTextField txtCitta;
	private JTextField txtNome;
	
	//label di controllo
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BCreazioneFornitura frame = new BCreazioneFornitura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/** controllo completezza */
	private static boolean controllaCompletezza( String stringa) {
		if(stringa == null || stringa.equals("")) return false;
		return true;
	}
	
	public static boolean controllaCompletezzaParametri(ArrayList<String> stringhe , JLabel [] controlli) {
		String[] campo = new String[]{"Nome" , "Cognome" , "Codice Fiscale" , "Via"  , "Numero Civico" , "CAP" , "Città"};
		boolean check = true;
		
		for(int i = 0; i < campo.length ; i++) {
			if(controllaCompletezza(stringhe.get(i)))controlli[i].setText("");	
			else {	controlli[i].setText(campo[i] +" non completo"); check = false;}
		}	
		return check;		
	}
	
	public static boolean controllaCorrettezzaParametri(ArrayList<String> stringhe , int tipoFornitura, JLabel [] controlli ,ArrayList<String> pattern) {
		String[] campo = new String[]{"Nome" , "Cognome" , "Codice Fiscale" , "Via"  , "Numero Civico" , "CAP" , "Città","Numero Interno" , "Tipo Fornitura"};
		boolean check = true;
		int i=0;
		for(i = 0; i < stringhe.size() ; i++) {
			if(stringhe.get(i).matches(pattern.get(i)))	controlli[i].setText("");	
			else {	controlli[i].setText(campo[i] +" non valido"); check = false;}
		}
		if(  (tipoFornitura != 0)) controlli[i].setText("");
		else { controlli[i].setText("Scegli un Tipo Fornitura Valido"); check = false;}
		return check;
	}
	
	public static boolean controllaParametri(ArrayList<String> stringhe , int tipoFornitura, JLabel [] controlli ,ArrayList<String> pattern) {
		return  controllaCompletezzaParametri(stringhe,controlli) & controllaCorrettezzaParametri(stringhe, tipoFornitura, controlli, pattern);
	}
	
	
	/*
	private static boolean controllaCompletezzaParametri(ArrayList<String> stringhe , ArrayList<JLabel> controlli) {
		for(int i = 0; i < stringhe.size() ; i++)
			if(!controllaCompletezzaStringa(stringhe.get(i))) controlli.get(i).setText("Parametro Vuoto");
	}
	*/
	

	/**
	 * Create the frame.
	 */
	public BCreazioneFornitura() {
		JLabel lblControlloNome;
		JLabel lblControlloCognome;
		JLabel lblControlloCodiceFiscale;
		JLabel lblControlloVia;
		JLabel lblControlloNumeroCivico;
		JLabel lblControlloNumeroInterno;
		JLabel lblControlloCitta;
		JLabel lblControlloCAP;
		JLabel lblControlloTipoFornitura;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 545);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//panel
		JPanel panleCliente = new JPanel();
		panleCliente.setBounds(10, 11, 593, 158);
		contentPane.add(panleCliente);
		panleCliente.setLayout(null);
		
		//lblNome
		JLabel lblNome = new JLabel("Nome ");
		lblNome.setBounds(9, 58, 87, 14);
		panleCliente.add(lblNome);
		
		//txtNome
		txtNome = new JTextField();
		txtNome.setBounds(133, 55, 200, 20);
		panleCliente.add(txtNome);
		txtNome.setColumns(10);
		
		//lblControlloNome
		lblControlloNome = new JLabel("");
		lblControlloNome.setForeground(Color.RED);
		lblControlloNome.setBounds(353, 58, 209, 14);
		panleCliente.add(lblControlloNome);

		

		
		JLabel lblCodiceFiscale = new JLabel("Coidce Fiscale");
		lblCodiceFiscale.setBounds(9, 120, 87, 14);
		panleCliente.add(lblCodiceFiscale);
		
		txtCodiceFiscale = new JTextField();
		txtCodiceFiscale.setBounds(133, 117, 200, 20);
		panleCliente.add(txtCodiceFiscale);
		txtCodiceFiscale.setColumns(10);
		

		
		lblControlloCognome = new JLabel("");
		lblControlloCognome.setForeground(Color.RED);
		lblControlloCognome.setBounds(353, 89, 209, 14);
		panleCliente.add(lblControlloCognome);
		
		lblControlloCodiceFiscale = new JLabel("");
		lblControlloCodiceFiscale.setForeground(Color.RED);
		lblControlloCodiceFiscale.setBounds(353, 120, 209, 14);
		panleCliente.add(lblControlloCodiceFiscale);
		
		txtCognome = new JTextField();
		txtCognome.setBounds(133, 86, 200, 20);
		panleCliente.add(txtCognome);
		txtCognome.setColumns(10);
		
		JLabel lblCognome = new JLabel("Cognome ");
		lblCognome.setBounds(9, 89, 87, 14);
		panleCliente.add(lblCognome);
		

		
		JLabel lblDatiCliente = new JLabel("Dati Cliente");
		lblDatiCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDatiCliente.setForeground(Color.BLUE);
		lblDatiCliente.setBounds(9, 27, 87, 14);
		panleCliente.add(lblDatiCliente);
		

		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 204, 593, 197);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUnitaAbitativa = new JLabel("Dati Unita Abitativa");
		lblUnitaAbitativa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUnitaAbitativa.setForeground(Color.BLUE);
		lblUnitaAbitativa.setVerticalAlignment(SwingConstants.BOTTOM);
		lblUnitaAbitativa.setHorizontalAlignment(SwingConstants.LEFT);
		lblUnitaAbitativa.setBounds(9, 11, 158, 14);
		panel.add(lblUnitaAbitativa);
		
		JLabel lblVia = new JLabel("Via");
		lblVia.setBounds(9, 41, 48, 14);
		panel.add(lblVia);
		
		txtVia = new JTextField();
		txtVia.setBounds(134, 38, 199, 20);
		panel.add(txtVia);
		txtVia.setColumns(10);
		
		JLabel lblNumeroInterno = new JLabel("Numero Interno");
		lblNumeroInterno.setBounds(9, 73, 101, 14);
		panel.add(lblNumeroInterno);
		
		JLabel lblNumeroCivico = new JLabel("Numero Civico");
		lblNumeroCivico.setBounds(9, 105, 101, 14);
		panel.add(lblNumeroCivico);
		
		JLabel lblCodiceAvviamentoPostale = new JLabel("CAP");
		lblCodiceAvviamentoPostale.setBounds(9, 137, 48, 14);
		panel.add(lblCodiceAvviamentoPostale);
		
		JLabel lblCitta = new JLabel("Citt\u00E0");
		lblCitta.setBounds(9, 169, 48, 14);
		panel.add(lblCitta);
		
		txtNumeroInterno = new JTextField();
		txtNumeroInterno.setBounds(134, 70, 199, 20);
		panel.add(txtNumeroInterno);
		txtNumeroInterno.setColumns(10);
		
		txtNumeroCivico = new JTextField();
		txtNumeroCivico.setText("");
		txtNumeroCivico.setBounds(134, 102, 199, 20);
		panel.add(txtNumeroCivico);
		txtNumeroCivico.setColumns(10);
		
		txtCodiceAvviamentoPostale = new JTextField();
		txtCodiceAvviamentoPostale.setBounds(134, 134, 199, 20);
		panel.add(txtCodiceAvviamentoPostale);
		txtCodiceAvviamentoPostale.setColumns(10);
		
		txtCitta = new JTextField();
		txtCitta.setBounds(134, 166, 199, 20);
		panel.add(txtCitta);
		txtCitta.setColumns(10);
		
		lblControlloVia = new JLabel("");
		lblControlloVia.setForeground(Color.RED);
		lblControlloVia.setBounds(354, 41, 207, 14);
		panel.add(lblControlloVia);
		
		lblControlloNumeroInterno = new JLabel("");
		lblControlloNumeroInterno.setForeground(Color.RED);
		lblControlloNumeroInterno.setBounds(354, 73, 207, 14);
		panel.add(lblControlloNumeroInterno);
		
		lblControlloNumeroCivico = new JLabel("");
		lblControlloNumeroCivico.setForeground(Color.RED);
		lblControlloNumeroCivico.setBounds(354, 105, 207, 14);
		panel.add(lblControlloNumeroCivico);
		
		lblControlloCAP = new JLabel("");
		lblControlloCAP.setForeground(Color.RED);
		lblControlloCAP.setBounds(354, 137, 207, 14);
		panel.add(lblControlloCAP);
		
		lblControlloCitta = new JLabel("");
		lblControlloCitta.setForeground(Color.RED);
		lblControlloCitta.setBounds(354, 169, 207, 14);
		panel.add(lblControlloCitta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 412, 593, 39);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTipoFornitura = new JLabel("Tipo Fornitura");
		lblTipoFornitura.setBounds(9, 11, 85, 14);
		panel_1.add(lblTipoFornitura);
		
		JComboBox cmbTipoFornitura = new JComboBox();
		cmbTipoFornitura.setEditable(true);
		cmbTipoFornitura.setModel(new DefaultComboBoxModel(new String[] {"Scegli Fornitura", "ENERGIA ELETTRICA", "GAS", "ACQUA"}));
		cmbTipoFornitura.setBounds(134, 7, 199, 22);
		panel_1.add(cmbTipoFornitura);
		
		lblControlloTipoFornitura = new JLabel("");
		lblControlloTipoFornitura.setForeground(Color.RED);
		lblControlloTipoFornitura.setBounds(359, 11, 196, 14);
		panel_1.add(lblControlloTipoFornitura);
		
		JButton btnCreazioneFornitura = new JButton("Crea Fornitura");
		
		ArrayList<String> stringhe = new ArrayList<String>();
		ArrayList<String> pattern = new ArrayList<String>();
 		JLabel [] lblControlli = new JLabel[] {lblControlloNome, lblControlloCognome, lblControlloCodiceFiscale, lblControlloVia, lblControlloNumeroCivico, lblControlloCAP, lblControlloCitta,  lblControlloNumeroInterno, lblControlloTipoFornitura};
		
		btnCreazioneFornitura.addMouseListener(new MouseAdapter() {
			@Override
			

			public void mouseClicked(MouseEvent e) {
				stringhe.clear();
				
				//nome
				String nome = txtNome.getText();
				pattern.add("^[a-zA-Z]+$");
				stringhe.add(nome);

				
				//cognome
				String cognome = txtCognome.getText();
				pattern.add("^[a-zA-Z]+$");
				stringhe.add(cognome);
				
				//cf
				String cf = txtCodiceFiscale.getText();
				pattern.add("^[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}$");
				stringhe.add(cf);
				
				//via
				String via = txtVia.getText();
				pattern.add("^[A-Za-z0-9\s]+$");
				stringhe.add(via);			
				
				//numeroCivico
				String numeroCivico = txtNumeroCivico.getText();
				stringhe.add(numeroCivico);
				pattern.add("^[A-Za-z0-9]+$");
				
				//cap
				String cap = txtCodiceAvviamentoPostale.getText();
				stringhe.add(cap);
				pattern.add("^[0-9]{5}+$");
				
				//città
				String citta = txtCitta.getText();
				stringhe.add(citta);
				pattern.add("^[a-zA-Z\s]+$");
				
				//numero interno
				String numeroInterno = txtNumeroInterno.getText();
				stringhe.add(numeroInterno);
				pattern.add("^[A-Za-z0-9]+$");
				
				int tipoFornitura = cmbTipoFornitura.getSelectedIndex();
				
				if(!controllaParametri(stringhe,tipoFornitura, lblControlli, pattern)) {
					//fai vedere
					JOptionPane.showMessageDialog(contentPane, "Fornitura non creata", "Errore", JOptionPane.ERROR_MESSAGE);
				}
				

				
			}
		});
		btnCreazioneFornitura.setBounds(469, 476, 134, 23);
		contentPane.add(btnCreazioneFornitura);
		
		
	}
	
}
