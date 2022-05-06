
/**
 *  Reservierungssoftware 
 *  ---------------------------------------------------------------------- 
 *  Autor: Bockwurst2016
 *  Erstellungs-Datum: 25.03.2022
 *  Version 1.2
 *  Datum der letzten Aenderung: 06.05.2022
 *  ----------------------------------------------------------------------
 */

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class BungalwSoftwareFinal extends JFrame {
	private JTextField textBungalowNr;
	private JTextField textStartWoche;
	private JTextField textEndWoche;
	private JTextField textAnzahlPersonen;
	private JTextField textRueckmeldung;
	private JTextArea textBuchungenAnzeigen;
	boolean ausgebucht = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BungalwSoftwareFinal frame = new BungalwSoftwareFinal();
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
	public BungalwSoftwareFinal() {
		setTitle("Reservirungen");

		int[][] Buchungen = new int[11][4];
		

		setAutoRequestFocus(true);
		setPreferredSize(new Dimension(800, 450));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		JButton btnReservierungDurchfuehren = new JButton("Reservierung Durchf\u00FChren");
		btnReservierungDurchfuehren.setBounds(64, 283, 200, 60);
		btnReservierungDurchfuehren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnReservierungDurchfuehren) {

					if (ausgebucht == false) {
						Buchungen[Integer.parseInt(textBungalowNr.getText())][0] = Integer.parseInt(textBungalowNr.getText());
						Buchungen[Integer.parseInt(textBungalowNr.getText())][1] = Integer.parseInt(textStartWoche.getText());
						Buchungen[Integer.parseInt(textBungalowNr.getText())][2] = Integer.parseInt(textEndWoche.getText());
						Buchungen[Integer.parseInt(textBungalowNr.getText())][3] = Integer.parseInt(textAnzahlPersonen.getText());
					
					}
					
					textBungalowNr.setText(null);
					textStartWoche.setText(null);
					textEndWoche.setText(null);
					textAnzahlPersonen.setText(null);
					
					for (int i = 1; i < Buchungen.length; i++) {
						for (int j = 1; j < Buchungen.length; j++) {
							if (Buchungen[i][0] == Buchungen[j][Integer.parseInt(textBungalowNr.getText())]) {
							 ausgebucht = true;	
							}
						}
					}
					if (ausgebucht == true ) {
						textBuchungenAnzeigen.setText("AUSGEBUCHT!!!!!");
					}
					
				}

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
		btnAuswertung.setBounds(522, 302, 120, 60);
		btnAuswertung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnAuswertung) {

					textBuchungenAnzeigen
							.setText("Bungalo Nr." + Buchungen[Integer.parseInt(textRueckmeldung.getText())][0] + "\n"
									+ "Startwoche: " + Buchungen[Integer.parseInt(textRueckmeldung.getText())][1] + "\n"
									+ "Endwoche: " + Buchungen[Integer.parseInt(textRueckmeldung.getText())][2] + "\n"
									+ "Anzahl Personen: " + Buchungen[Integer.parseInt(textRueckmeldung.getText())][3]);

				}
			}
		});
		getContentPane().add(btnAuswertung);

		textBuchungenAnzeigen = new JTextArea();
		textBuchungenAnzeigen.setColumns(10);
		textBuchungenAnzeigen.setBounds(480, 90, 200, 200);
		getContentPane().add(textBuchungenAnzeigen);

	}

}
