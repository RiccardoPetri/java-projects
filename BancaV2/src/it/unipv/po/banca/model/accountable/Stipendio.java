package it.unipv.po.banca.model.accountable;

import it.unipv.po.banca.model.AbstractAccountable;

public class Stipendio extends AbstractAccountable{

    private double cifraBase, cifraReale;
    private final double COSTO_ORA = 15;

    public Stipendio(double cifraBase) {
//        super(AccountableType.ACCREDITO);
        this.cifraBase = cifraBase;
        this.cifraReale = cifraBase;
    }

    public void addStraordinario(int oreStr) {
        cifraReale += COSTO_ORA * oreStr;
    }

    @Override
    public double getImporto() {
        double cifraReturn = cifraReale;
        cifraReale = cifraBase;
        return cifraReturn;
    }

    @Override
    public TipoAccountable getType() {
        return TipoAccountable.ACCREDITO;
    }

}

