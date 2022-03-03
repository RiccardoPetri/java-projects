package it.unipv.po.trasporti.model.biglietto;
import it.unipv.po.trasporti.model.biglietto.util.TipologiaBiglietto;

public class AbbonamentoAnnuale extends Biglietto{

	private int annoDiRilascio;
	private int annoDiUtilizzo;
	
	public AbbonamentoAnnuale(String codice, int annoDiRilascio, int annoDiUtilizzo) {
		super(codice);
		this.annoDiRilascio=annoDiRilascio;
		this.annoDiUtilizzo=annoDiUtilizzo;
	}

	@Override
	public boolean isUtilizzabile() {
		if (annoDiRilascio == annoDiUtilizzo) {
			return true;
		}
		return false;
	}

	@Override
	public TipologiaBiglietto getTipo() {
		return TipologiaBiglietto.ANNUALE;
	}
}
