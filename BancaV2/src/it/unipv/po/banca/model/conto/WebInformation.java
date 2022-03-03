package it.unipv.po.banca.model.conto;

import it.unipv.po.banca.model.conto.util.TipologiaConto;

public interface WebInformation {
	public boolean changePassword(String oldPw, String password); //setPWD
	public boolean isLogged();
	//public TipologiaConto getTipo();	//lo eredita da contoCorrente
	public boolean login(String password); //setFlagLogin
	
}
