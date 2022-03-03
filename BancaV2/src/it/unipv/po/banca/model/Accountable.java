package it.unipv.po.banca.model;

import it.unipv.po.banca.model.accountable.TipoAccountable;

public interface Accountable extends Comparable<Accountable>{	//estende la classe COMPARABLE!!!

	double getImporto();
	TipoAccountable getType();
}
