package it.unipv.po.banca.model.conto;

import java.util.ArrayList;
import java.util.Collections;

import it.unipv.po.banca.model.Accountable;
import it.unipv.po.banca.model.Conto;
import it.unipv.po.banca.model.conto.util.TipologiaConto;

public class ContoCorrente implements Conto {

	private String cf;
	protected double saldo; // @@@@@QUANDO FACCIO L'OVERRIDE DEL METODO OPERAZIONE MI DICE DI FARLO
							// PROTECTED
	final private String IBAN;
	// protected TipologiaConto tipo;
	
	protected ArrayList<Accountable> accountables;


	public ContoCorrente(String iban, String cf) { // qui minuscolo iban, passo un parametro non costante
		this.IBAN = iban;
		this.cf = cf;
		saldo = 0;
		accountables = new ArrayList<Accountable>();
		/// tipo = TipologiaConto.CORRENTE;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getCf() {
		return cf;
	}

	public String getIban() {
		return IBAN;
	}

	// devo mettere @Override @@@@@ ? o serve solo a me per ricordarmi che è un
	// override?
	public boolean operazione(double valore) {
		if ((valore <= 0) && (valore <= saldo)) { // prelievo
			saldo -= valore;
			return true;
		} else // deposito
			saldo += valore;
		return true;
	}

	@Override
	public String toString() {
		return "Tipo di conto " + this.getTipo()+ " con iban: " + IBAN + "\tcfIntestatario: " + cf + "\tsaldo: " + saldo;
	}

	@Override
	public TipologiaConto getTipo() {
		return TipologiaConto.CORRENTE;
	}
	
//_____________________________________________________________________________________________
	
    @Override
    public boolean addAccountable(Accountable acc) {
    	return accountables.add(acc);
    }
    
    public boolean fineMese() {
        Collections.sort(accountables);				//ecco perchè l'implements, per avere un ordine
        for (Accountable acc : accountables) {
            double importo = acc.getImporto();
            boolean esito = operazione(importo);		//con ciò che devo versare/pagare effettuo l'operazione
            if (esito == false) {
                return false;
            }
        }
        return true;
    }

}
