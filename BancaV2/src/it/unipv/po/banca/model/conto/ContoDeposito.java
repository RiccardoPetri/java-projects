package it.unipv.po.banca.model.conto;

import it.unipv.po.banca.model.Accountable;
import it.unipv.po.banca.model.accountable.TipoAccountable;
import it.unipv.po.banca.model.conto.util.TipologiaConto;

public class ContoDeposito extends ContoCorrente{
	
	//gli attributi li eredita!!, idem i metodi
	
	public ContoDeposito(String iban, String cf) {
		super(iban, cf);
		//tipo=TipologiaConto.DEPOSITO;
		//tipo = TipologiaConto.DEPOSITO;
	}

	
	@Override
	public boolean operazione(double valore) {
		if(valore >= 0) {
			saldo+=valore;
			return true;
		}
		System.out.println("Operazione non consentita per questo tipo di conto!");
		return false;
	}
	
	@Override
	public TipologiaConto getTipo() {
		return TipologiaConto.DEPOSITO;
	}
	
//	@Override 
//	public TipologiaConto getTipo() {
//	    return tipo;
//	}
	
	//INUTILE RIFARE IL TOSTRING SE NON AGGIUNGO ROBA

//______________________________________________________________________________________________________________--
	
    @Override
    public boolean addAccountable(Accountable acc){
        if(acc.getType() == TipoAccountable.ACCREDITO)
            return accountables.add(acc);
        else
            return false;

    }
	
}
