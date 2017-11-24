public class Mensa{
	public static void main(String[] args){
	char name;
	int postleitzahl;
	char strasse;
	getSpeiseplan();
	bezahlen(gericht:Gericht,geld:int):int;
	
	
	}
	static void getSpeiseplan(){
		getGericht(name): Gericht;
	
	}
	static void Gericht{
		char name;
		double preis;
	}
	static void Mensabesucher{
		char vorname;
		char nachname;
		boolean hunger;
		int geld;
		essen(gericht: Gericht);
		besuchen(mensa:Mensa);
		
		
	}

}