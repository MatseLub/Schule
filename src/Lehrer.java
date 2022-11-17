public class Lehrer {
	private final String anrede;
	private final String name;
	private Klassen klasse;


	public String getAnrede() {
		return anrede;
	}

	public String getName() {
		return name;
	}

	public Klassen getKlasse() {
		return klasse;
	}

	public Lehrer(String anrede, String name) {
		this.anrede = anrede;
		this.name = name;
	}

	public Lehrer(String anrede, String name, Klassen klasse) {
		this.anrede = anrede;
		this.name = name;
		this.klasse = klasse;
	}


	public void krankWerden(Schule schule) {
		System.out.println(this.anrede + " " + this.name + " ist heute Krank");
		schule.getSchulleiter().stundenAusfallenLassen(this, schule);
	}


}
