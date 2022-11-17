public class Klassen{

	int stufe;
	String buchstabe;

	public int getStufe() {
		return stufe;
	}

	public String getBuchstabe() {
		return buchstabe;
	}

	public void setStufe(int stufe) {
		this.stufe = stufe;
	}

	public void setBuchstabe(String buchstabe) {
		this.buchstabe = buchstabe;
	}

	public Klassen(int stufe, String buchstabe){
		setStufe(stufe);
		setBuchstabe(buchstabe);
	}
}
