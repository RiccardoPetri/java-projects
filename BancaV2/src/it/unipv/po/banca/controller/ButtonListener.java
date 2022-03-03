package it.unipv.po.banca.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextField;
import it.unipv.po.banca.model.Conto;
import it.unipv.po.banca.view.*; //DA IMPORTARE PER LEGGERE IL PANEL!!!

public class ButtonListener implements ActionListener {

	private JTextField text;
	private HashMap<String, Conto> map;
	private Panel p; // import it.unipv.po.banca.view.*; DA IMPORTARE!!!!

	public ButtonListener(JTextField text, HashMap<String, Conto> map, Panel panel) {
		this.text = text;
		this.map = map;
		this.p = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		p.setLabel(map.get(text.getText()).getSaldo());
		// nel get metto l'oggetto della chiave, ovvero l'iban
		// associato al conto, e mi ritornerà il get conto!!!

	}

}
