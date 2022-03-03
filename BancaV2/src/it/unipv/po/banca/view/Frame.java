package it.unipv.po.banca.view;

import java.awt.*;
import java.util.HashMap;

import javax.swing.*;

import it.unipv.po.banca.model.Conto;

public class Frame extends JFrame {
	
	public Frame(HashMap<String, Conto> map) {
		setTitle("Inserire iban per vedere il saldo");
		setSize(300,200);
		Panel panel = new Panel(map);
		Container contentPane=getContentPane();
		contentPane.add(panel);
		
	}

}
