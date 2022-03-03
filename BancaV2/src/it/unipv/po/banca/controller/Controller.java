package it.unipv.po.banca.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JTextField;

import it.unipv.po.banca.model.Banca;
import it.unipv.po.banca.model.Conto;
import it.unipv.po.banca.view.BanchiereGUI;

public class Controller {		

	private Banca model;
	private BanchiereGUI view;
	
	public Controller(Banca model,BanchiereGUI view) {
		this.model=model;
		this.view=view;
		initListeners();
	}
	
	private void initListeners() {
		view.getBtnSaldo().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel lbl= view.getLblSaldo();
				JTextField txt=view.getTxtFldIban();
//				HashMap<String,Conto> map=model.getMap();
				lbl.setText(model.getSaldo(txt.getText())+""); 
				
							//arrayl.getCicloConto(txt.getText()).getSaldo()+"");
			}
			
		});
		//view.getBtnDelete().addActionListener(new ActionListener() {};
		
		//view.getBtnCf().
	}
}
