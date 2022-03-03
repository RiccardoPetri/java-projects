package it.unipv.po.triangle.dataModel;

public abstract class Forma implements Misurabile{              
									 //Misurabile, Programmabile{  (caso di seconda interfaccia implementata)
	public Colore colore;  //posso prenderlo essendo nello stesso package
	public double spessore;
	
	
	public Forma(Colore colore, double spessore) {
		this.colore= colore;
		this.spessore=spessore;
	}
	
	public Forma() {}      
	
	public Colore getColore() {
		return colore;
	}
	
	//public abstract double area();
	
	public void setColore(Colore colore) {
		this.colore = colore;
	}
	
	
	
	
	//posso non scrivere i metodi dichiarati come firme in Misurabile ( perchè è una classe astratta, se no dovevo specificarli!!!!)
	
	
	
}
