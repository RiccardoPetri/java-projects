package it.unipv.po.banca.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import it.unipv.po.banca.model.Banca;


public class BanchiereGUI extends JFrame implements Observer {			//NON SERVE UNA CLASSE FRAME E PANEL, FACCIO TUTTO QUI DENTRO


	private JTextField txtFldIban;
	private JButton btnSaldo;
	private JLabel lblSaldo;
	
	public BanchiereGUI() {
		setTitle("Banchiere");
		setSize(300,300);
		centeredFrame();				//SE VOGLIO CENTRARLO
		initComponents();
	}
	
	private void centeredFrame() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
	
	private void initComponents() {
		Container c= getContentPane();
		txtFldIban = new JTextField("Insert iban here");
		btnSaldo = new JButton("Find conto");
		lblSaldo= new JLabel("Insert iban to show credit");
		
	    JPanel panelTxtFld = new JPanel();
	    panelTxtFld.setSize(100,100);
	    panelTxtFld.add(txtFldIban);
	    JPanel panelLbl = new JPanel();
	    panelLbl.setSize(100,100);
	    panelLbl.add(lblSaldo);
	    JPanel panelBtn = new JPanel();
	    panelBtn.setSize(100,100);
	    panelBtn.add(btnSaldo);
		
	    c.setLayout(new BorderLayout());
		c.add(panelLbl, BorderLayout.CENTER); 
	    c.add(panelTxtFld, BorderLayout.NORTH); 
	    c.add(panelBtn, BorderLayout.SOUTH);
	    
	    
	    
	}
	
	public JTextField getTxtFldIban() {
		return txtFldIban;
	}
	
	

	public JLabel getLblSaldo() {
		return lblSaldo;
	}
	
	public JButton getBtnSaldo() {		//USA CTRL SPAZIO O THIS. PER VEDERE TUTTO
		return btnSaldo;
	}

	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Update");
		System.out.println("Saldo disponibile:"+((Banca)o).getSaldo(txtFldIban.getText()));
		
	}
	

}
