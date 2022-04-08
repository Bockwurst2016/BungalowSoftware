/**
 *  VORLAGE GUI 
 *  ---------------------------------------------------------------------- 
 *  Autor: Peter Braunsch�del
 *  Erstellungs-Datum: 28.03.2022
 *  Version 1.1
 *  Datum der letzten �nderung: 31.03.2022
 *  �nderung: Kommentar hinzugef�gt
 *  ----------------------------------------------------------------------
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import org.eclipse.ui.IFileEditorMapping;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BungalwSoftware extends JFrame {
	private JTextField textBungalowNr;
	private JTextField textStartWoche;
	private JTextField textEndWoche;
	private JTextField textAnzahlPersonen;
	private JTextField textRueckmeldung;
	private JTextArea textBuchungenAnzeigen;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BungalwSoftware frame = new BungalwSoftware();
					frame.setVisible(true);
					frame.pack();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BungalwSoftware() {
	
		int[][] Buchungen = new int[11][4];
		
		setAutoRequestFocus(false);
		setPreferredSize(new Dimension(800, 450));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		boolean reservierungDurchfuehren = false;
		
		JButton btnReservierungDurchfuehren = new JButton("Reservierung Durchf\u00FChren");
		btnReservierungDurchfuehren.setBounds(27, 250, 200, 60);
		btnReservierungDurchfuehren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReservierungDurchfuehren) {
					
			 Buchungen[Integer.parseInt(textBungalowNr.getText())][0]= Integer.parseInt(textBungalowNr.getText());
			 Buchungen[Integer.parseInt(textBungalowNr.getText())][1]= Integer.parseInt(textStartWoche.getText());
			 Buchungen[Integer.parseInt(textBungalowNr.getText())][2]= Integer.parseInt(textEndWoche.getText());
			 Buchungen[Integer.parseInt(textBungalowNr.getText())][3]= Integer.parseInt(textAnzahlPersonen.getText());
				}
				
//				if (e.getSource()==) {
//					
//				}
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnReservierungDurchfuehren);
		
		
		
		textBungalowNr = new JTextField();
		textBungalowNr.setBounds(159, 21, 164, 40);
		getContentPane().add(textBungalowNr);
		textBungalowNr.setColumns(10);
		
		textStartWoche = new JTextField();
		textStartWoche.setBounds(159, 72, 164, 40);
		textStartWoche.setColumns(10);
		getContentPane().add(textStartWoche);
		
		JLabel lblBungalowNr = new JLabel("Bungalow-Nummer:");
		lblBungalowNr.setBounds(27, 21, 100, 40);
		getContentPane().add(lblBungalowNr);
		
		JLabel lblStartWoche = new JLabel("Start-Woche:");
		lblStartWoche.setBounds(27, 72, 100, 40);
		getContentPane().add(lblStartWoche);
		
		JLabel lblEndWoche = new JLabel("End-Woche:");
		lblEndWoche.setBounds(27, 123, 100, 40);
		getContentPane().add(lblEndWoche);
		
		textEndWoche = new JTextField();
		textEndWoche.setColumns(10);
		textEndWoche.setBounds(159, 123, 164, 40);
		getContentPane().add(textEndWoche);
		
		textAnzahlPersonen = new JTextField();
		textAnzahlPersonen.setColumns(10);
		textAnzahlPersonen.setBounds(159, 173, 164, 40);
		getContentPane().add(textAnzahlPersonen);
		
		JLabel lblAnzahlPersonen = new JLabel("Anzahl Personen:");
		lblAnzahlPersonen.setBounds(27, 174, 100, 40);
		getContentPane().add(lblAnzahlPersonen);
		
		textRueckmeldung = new JTextField();
		textRueckmeldung.setColumns(10);
		textRueckmeldung.setBounds(565, 20, 120, 40);
		getContentPane().add(textRueckmeldung);
		
		JLabel lblAuswahlBungalowAnzeige = new JLabel("Bungalow ausw\u00E4hlen:");
		lblAuswahlBungalowAnzeige.setBounds(425, 20, 120, 40);
		getContentPane().add(lblAuswahlBungalowAnzeige);
		
		JButton btnAuswertung = new JButton("Auswertung");
		btnAuswertung.setBounds(460, 300, 120, 60);
		btnAuswertung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(e.getSource()==btnAuswertung) {
					
					textBuchungenAnzeigen.setText("Bungalo Nr." +  Buchungen[Integer.parseInt(textBungalowNr.getText())][0] + 
					"\n" + "Startwoche: " +Buchungen[Integer.parseInt(textBungalowNr.getText())][1] +
					"\n" + "Endwoche: " +Buchungen[Integer.parseInt(textBungalowNr.getText())][2] + 
					"\n" + "Anzahl Personen: " +Buchungen[Integer.parseInt(textBungalowNr.getText())][3]);
					
					 
						}
			}
		});
		getContentPane().add(btnAuswertung);
	
		
		textBuchungenAnzeigen = new JTextArea();
		textBuchungenAnzeigen.setColumns(10);
		textBuchungenAnzeigen.setBounds(425, 90, 200, 200);
		getContentPane().add(textBuchungenAnzeigen);
	
				
		
	
	}
	
	
	
	
	
}