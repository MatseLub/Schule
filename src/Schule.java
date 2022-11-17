public class Schule {

	String name;
	Lehrer[] lehrerListe;
	Schueler[] schuelerListe;
	Klassen[] klassenListe;
	Schulleiter schulleiter;

	public Lehrer[] getLehrerListe() {
		return lehrerListe;
	}

	public Schueler[] getSchuelerListe() {
		return schuelerListe;
	}

	public Schulleiter getSchulleiter() {
		return schulleiter;
	}

	public String getName() {
		return this.name;
	}

	public Schule(String name, Schulleiter schulleiter, Lehrer[] lehrerListe, Schueler[] schuelerListe, Klassen[] klassenListe) {
		this.name = name;
		this.lehrerListe = lehrerListe;
		this.schuelerListe = schuelerListe;
		this.schulleiter = schulleiter;
		this.klassenListe = klassenListe;
	}

	public void einschulen(Klassen[] klassenListe, Klassen[] neueKlassen) {
		this.klassenListe = klassenListe;
		for (int i = 0; i < klassenListe.length; i++) {
			klassenListe[i].setStufe(klassenListe[i].getStufe() + 1);
			System.out.println(klassenListe[i].getStufe() + klassenListe[i].getBuchstabe());
		}
	}

	public void abschlussfeier(Klassen[] abschlussKlassen) {

	}
}
