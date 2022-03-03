package it.unipv.po.banca.tester;

import javax.swing.JFrame;

import it.unipv.po.banca.controller.Controller;
import it.unipv.po.banca.model.Banca;
import it.unipv.po.banca.model.conto.util.TipologiaConto;
import it.unipv.po.banca.view.BanchiereGUI;

public class TesterGUI {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BanchiereGUI view = new BanchiereGUI();	
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setResizable(false);
		view.setVisible(true);
		
		
		Banca model= new Banca("Intesa",10);
		model.aggiungiConto("aaa",TipologiaConto.CORRENTE);
		model.operazioneConto("IT00000Intesa0001", 500);
		model.addObserver(view);
		
		new Controller(model,view);
		
		
	}
}
