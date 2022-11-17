public class Schueler {


	private String name;
	private String vorname;
	private String geschlecht;
	private Klassen klasse;

	public Klassen getKlasse() {
		return klasse;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public Schueler(String name, String vorname, String geschlecht, Klassen klasse) {
		this.name = name;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
		this.klasse = klasse;
	}

	public void lernen() {

	}

	public void quatschMachen() {

	}

	public void hausaufgabenMachen() {

		System.out.println(this.vorname + " macht Hausaufgaben.");
	}

	public void mittagEssen() {
		System.out.println(this.vorname+" isst Mittag.");
	}

}
