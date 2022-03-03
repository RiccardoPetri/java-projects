package it.unipv.po.banca.model.conto;

import it.unipv.po.banca.model.conto.util.TipologiaConto;

public class ContoWeb extends ContoCorrente implements WebInformation {

	private String password;
	private boolean flagLogin, firstLogin;

	public ContoWeb(String iban, String cf) {
		super(iban, cf);
		this.password = "changeme"; // dichiaro inizialmente = a changeme
		flagLogin = false;
		firstLogin = true; // cambio pw, che una volta che avrò fatto un primo login sarà ininfluente!!!
	}

	public String getPassword() { // solo le operazioni hanno bisogno di controlli
		return password;
	}

	// prima di loggare una volta creato il conto devo cambiare la password. Poi
	// riloggo!
	public boolean changePassword(String oldPw, String password) {

		if (this.password.equals(oldPw)) {
			if (firstLogin) { // inizialmente è a vero, vuol dire che come prima cosa lo devo cambiare a
								// falso, modificando una prima volta la pw!!!!, poi riloggo
				this.password = password;
				firstLogin = false;
				flagLogin = false;
				System.out.println("Password cambiata con successo in : " + password);
				return true;
			}
			System.out.println(
					"Login non effettuato, quindi sarà necessario loggare una prima volta per cambiare changeme");
			return false;
		}
		System.out.println("Password sbagliata");
		return false;

	}

	@Override
	public boolean isLogged() {
		return flagLogin;
	}

	@Override
	public boolean operazione(double valore) {
		if (flagLogin) {
			return super.operazione(valore);
		} else
			System.out.println("Login non effettuato!");
		return false;
	}

	@Override
	public TipologiaConto getTipo() {
		return TipologiaConto.WEB;
	}

	@Override
	public boolean login(String password) { // dato che avrò cambiato la pw da changeme, passo la nuova pw!
		this.flagLogin = false;
		if (this.password.equals(password)) {
			if (!firstLogin) { // diventa falsa quando avrò cambiato la pw
				flagLogin = true;
				firstLogin = false;
				System.out.println("Login effettuato!");
				return true;
			} else
				return false;
		}
		return flagLogin;
	}

}
