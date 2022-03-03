package it.unipv.po.trasporti.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import it.unipv.po.trasporti.model.*;
import it.unipv.po.trasporti.view.*;

public class Controller {

	private SistemaTrasporti model;
	private SistemaTrasportiGUI view;

	public Controller(SistemaTrasporti model, SistemaTrasportiGUI view) {
		this.model = model;
		this.view = view;
		initListeners();
	}

	private void initListeners() {
		view.getBtnCapacita().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel lbl = view.getLblTarga();
				JTextField txt = view.getTxtOutput();
				lbl.setText(model.getCapienza(    (txt.getText())    )+ "");

			}
		});
	}
}