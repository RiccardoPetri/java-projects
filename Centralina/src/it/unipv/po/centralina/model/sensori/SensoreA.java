package it.unipv.po.centralina.model.sensori;

import it.unipv.po.centralina.model.sensori.util.TipoGrandezzaFisica;
import it.unipv.po.centralina.model.sensori.util.TipoSensore;

public class SensoreA extends Sensore {

	public String unitaDiMisura;
	public double rangeMax;
	public double rangeMin;
	public TipoGrandezzaFisica tipoGF;
	
	

	public SensoreA(TipoGrandezzaFisica tipoGF, String unitaDiMisura, double rangeMin, double rangeMax, boolean allarme) {
		super(allarme);
		this.unitaDiMisura = unitaDiMisura;
		this.rangeMax = rangeMax;
		this.rangeMin = rangeMin;
		this.tipoGF=tipoGF;
	}
	

	public boolean monitoraggioValori(double valMin, double valMax) {			//@@@come fare override con firme diverse?
		if(valMin >= rangeMin && valMax <= rangeMax) {
			return allarme = false;
		}
		return allarme = true;
	}

	//Nel caso di sensori di tipo A, l’allarme viene generato se le misure rilevate sono fuori dal
	//range di riferimento (configurato al momento in cui il sensore viene connesso alla centralina). Nel caso di
	//sensori di tipo B, l’allarme viene generato nel caso si verifichi l’evento almeno un numero minimo di volte
	//consecutive (configurabile).
	


	@Override
	public TipoSensore getTipoSensore() {
		return TipoSensore.RILEVA_GRANDEZZA_FISICA;

	}
	
	public TipoGrandezzaFisica getTipoGrandezzaFisica() {
		return tipoGF;
	}

	@Override
	public String toString() {
		return "SensoreA rileva " + tipoGF;
	}


	

}
