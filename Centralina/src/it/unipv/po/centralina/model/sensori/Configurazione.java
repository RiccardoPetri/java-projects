package it.unipv.po.centralina.model.sensori;

import it.unipv.po.centralina.model.Porta;

public interface Configurazione {

	public boolean aggiungiPorta(Sensore s);
	public boolean verificaAnomalie();

}

//Si deve realizzare una applicazione che consenta di gestire la centralina di un sistema di allarme. La
//centralina � dotata di dieci porte ingresso/uscita indipendenti che si possono interfacciare a diversi sensori:
//temperatura, umidit�, fumo, movimento, ecc. Sono previste due tipologie di sensori: sensori di tipo A che
//rilevano una grandezza fisica (temperatura, umidit�, ecc.) e sensori di tipo B che rilevano l�occorrenza eventi
//(es. movimento, rottura di un vetro, apertura di una finestra, presenza di gas ecc.). Ogni sensore �
//configurabile (deve essere specificato il tipo di sensore e il tipo della misura) e verr� associato ad una porta
//della centralina. 

//Inoltre, nel caso di variabili fisiche, si devono specificare l�unit� di misura e i valori minimi
//e massimo del range di normalit�. Ogni sensore deve inviare un allarme alla centralina nel caso si verifichino
//situazioni critiche. Nel caso di sensori di tipo A, l�allarme viene generato se le misure rilevate sono fuori dal
//range di riferimento (configurato al momento in cui il sensore viene connesso alla centralina). Nel caso di
//sensori di tipo B, l�allarme viene generato nel caso si verifichi l�evento almeno un numero minimo di volte
//consecutive (configurabile).
//La centralina deve ricevere le informazioni dai sensori e deve poter mostrare all�utilizzatore gli stati di
//allarme generati (porta a cui il sensore che ha segnalato l�allarme � collegato, tipo di sensore e timestamp
//dell�evento di allarme).