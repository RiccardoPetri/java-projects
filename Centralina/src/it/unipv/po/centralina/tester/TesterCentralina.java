package it.unipv.po.centralina.tester;

import it.unipv.po.centralina.model.Centralina;
import it.unipv.po.centralina.model.CentralinaPiccola;
import it.unipv.po.centralina.model.Porta;
import it.unipv.po.centralina.model.sensori.SensoreA;
import it.unipv.po.centralina.model.sensori.SensoreB;
import it.unipv.po.centralina.model.sensori.util.TipoEvento;
import it.unipv.po.centralina.model.sensori.util.TipoGrandezzaFisica;

public class TesterCentralina {

	public static void main(String[] args) {

		Centralina c = new Centralina("Centralina1");	//LIMITE DI 5
		
		//LE PORTE LE CREO QUANDO AGGIUNGO I SENSORI ALLA CENTRALINA NEL METODO AGGIUNGISENSORE!!!!
		
//		SensoreB B4 = new SensoreB(TipoEvento.FUMO, false,P4);
		
		
		c.aggiungiPorta(new SensoreA(TipoGrandezzaFisica.TEMPERATURA, "Gradi Celsius", 10, 20, false));
		c.aggiungiPorta(new SensoreA(TipoGrandezzaFisica.UMIDITA, "kg/m^3", 5, 10, false));

		c.aggiungiPorta(new SensoreB(TipoEvento.MOVIMENTO, false));
		c.aggiungiPorta(new SensoreB(TipoEvento.ROTTURA_VETRO, false));
		c.aggiungiPorta(new SensoreB(TipoEvento.FUMO, false));  //NON AGGIUNGIBILE!!! (DATO CHE HO IMPOSTATO MASSIMO 4 PORTE NELL'IF)

		
		((SensoreA)c.getPorta().get(1).getSensore()).monitoraggioValori(9, 100);
		((SensoreA)c.getPorta().get(2).getSensore()).monitoraggioValori(8, 9);
		
		((SensoreB)c.getPorta().get(3).getSensore()).monitoraggioFrequenzaEvento(TipoEvento.MOVIMENTO);
		((SensoreB)c.getPorta().get(4).getSensore()).monitoraggioFrequenzaEvento(TipoEvento.ROTTURA_VETRO);
		((SensoreB)c.getPorta().get(4).getSensore()).monitoraggioFrequenzaEvento(TipoEvento.ROTTURA_VETRO);
		
		c.verificaAnomalie();
		
		
		CentralinaPiccola x = new CentralinaPiccola("CIAO");		//l'hashMap istanziato è nuovo, quindi non centra con quello allocato 
		x.aggiungiPorta(new SensoreB(TipoEvento.FUMO, false));	//dall'altra centralina!!!!!
		x.aggiungiPorta(new SensoreB(TipoEvento.FUMO, false));
		x.aggiungiPorta(new SensoreB(TipoEvento.FUMO, false));
		x.aggiungiPorta(new SensoreB(TipoEvento.FUMO, false));	//non aggiungibile!!!
		
		((SensoreB)x.getPorta().get(5).getSensore()).monitoraggioFrequenzaEvento(TipoEvento.FUMO);
		((SensoreB)x.getPorta().get(6).getSensore()).monitoraggioFrequenzaEvento(TipoEvento.FUMO);	//rimane true l'allarme!!!
		((SensoreB)x.getPorta().get(6).getSensore()).monitoraggioFrequenzaEvento(TipoEvento.FUMO);	//setta a falso l'allarme!!!

		x.verificaAnomalie();		
	}

}
