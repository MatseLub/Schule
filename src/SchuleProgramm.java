public class SchuleProgramm {
	public static void main(String[] args) {

		Klassen a5 = new Klassen(5, "a");
		Klassen b5 = new Klassen(5, "b");
		Klassen c5 = new Klassen(5, "c");
		Klassen a6 = new Klassen(6, "a");
		Klassen b6 = new Klassen(6, "b");
		Klassen c6 = new Klassen(6, "c");

		Klassen[] klassenListe = {a5, b5, c5, a6, b6, c6};

		Lehrer l1 = new Lehrer("Frau", "Noodl",b6);
		Lehrer l2 = new Lehrer("Herr", "Nagel");
		Lehrer l3 = new Lehrer("Frau", "Nougat", a6);
		Lehrer l4 = new Lehrer("Herr", "Robust");

		Lehrer[] listeLehrer = {l1, l2, l3, l4};

		Schueler s1 = new Schueler("Heuler", "Sabine", "weiblich", a5);
		Schueler s2 = new Schueler("Frojanus", "Udo", "männlich", a6);
		Schueler s3 = new Schueler("Hodus", "Mannfred", "männlich", b6);
		Schueler s4 = new Schueler("Suson", "Roman", "männlich", a5);

		Schueler[] schuelerListe = {s1, s2, s3, s4};

		Schulleiter direx = new Schulleiter("Herr", "Peterson");

		Schule schule = new Schule("M-C-G", direx, listeLehrer, schuelerListe, klassenListe);

		l1.krankWerden(schule);
		l3.krankWerden(schule);


	}
}
