import java.util.Arrays;

public class Schulleiter extends Lehrer {

    public Schulleiter(String anrede, String name) {
        super(anrede, name);
    }

    public void stundenAusfallenLassen(Lehrer lehrer, Schule schule) {
        System.out.printf("Der Unterricht von %s %s fällt heute aus.\n", lehrer.getAnrede(), lehrer.getName());
        Arrays.stream(schule.getSchuelerListe())
              .filter(s -> s.getKlasse() == lehrer.getKlasse() && s.getGeschlecht() == "weiblich")
              .forEach(s -> s.hausaufgabenMachen());
        Arrays.stream(schule.getSchuelerListe())
              .filter(s -> s.getKlasse() == lehrer.getKlasse() && s.getGeschlecht() == "männlich")
              .forEach(s -> s.mittagEssen());
    }
}
