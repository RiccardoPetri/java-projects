package it.unipv.po.banca.view;


import java.awt.BorderLayout;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import it.unipv.po.banca.controller.ButtonListener;
import it.unipv.po.banca.model.Conto;



public class Panel extends JPanel{
	
	private JLabel label;
	private JTextField text;
	public HashMap<String,Conto > map;
	
	public Panel(HashMap<String, Conto> map) {
		//this.map=map;
		label = new JLabel("Insert iban to show credit");
		text = new JTextField("Insert iban here");
		JButton b = new JButton("Find conto");
		
	    ButtonListener action = new ButtonListener(text, map, this);
		b.addActionListener(action);
		
	    JPanel south = new JPanel();
	    south.add(b);

	    setLayout(new BorderLayout());
		
		add(label, BorderLayout.CENTER); 
	    add(text, BorderLayout.NORTH); 
	    add(south, BorderLayout.SOUTH);
		
	}
	
//	tot = (float) ((Sal/30.0)*days);
//	String s = Float.toString(tot);
//	lblNetSal.setText(s);
	
	public void setLabel(double saldo) {
		String s = saldo+"";
		label.setText(s);
	}
	
//	   public String getIban() {
//		   try {
//			   return Integer.parseInt(text.getText());
//		   }catch(NumberFormatException e) {
//			   e.printStackTrace();
//			   return 1; @@@@
//		   }
//	   }
	
	
}
