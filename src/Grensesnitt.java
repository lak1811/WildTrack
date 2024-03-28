import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Grensesnitt{
	//note: La være
	Kontroll kontroll = new Kontroll();
	//Definerer en array med tekstene p� knappene i menyen:
	//lager knappene i menyen
	//Begge menyalternativene
	//note: 1=meny, 2=gauper,3=harer
		private static final String[] ALTERNATIVER = {"gauper", "harer", "Avslutt"};
		private static final String[] ALTERNATIVER1 = {"registrer", "Gjenfanget dyr","søke","Skriv ut alle", "Avslutt"};
		private static final String[] ALTERNATIVER2 = {"registrer", "Gjenfanget dyr","søke","Skriv ut alle","Avslutt"};
		
	//lager mine alternativer
	private final int ALT1 = 0;
	private final int ALT2 = 1;
	private final int ALT3 = 2;
	private final int ALT4 = 3;
	
	public int lesValget() {
		int valg = JOptionPane.showOptionDialog(null,"Utfør et valg","Dyreregister",JOptionPane.DEFAULT_OPTION,
		JOptionPane.PLAIN_MESSAGE,null,ALTERNATIVER,ALTERNATIVER[0]);
		return valg;
	}
	
	public static int lesvalg1() {
		int valg1=JOptionPane.showOptionDialog(null, "Velg hvilken handling du ønsker å utføre (gauper)", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ALTERNATIVER1, ALTERNATIVER1[0]);
		return valg1;

	}
	public int lesValg2() {
		int valg = JOptionPane.showOptionDialog(null,"Utfør et valg (harer)","Dyreregister",JOptionPane.DEFAULT_OPTION,
		JOptionPane.PLAIN_MESSAGE,null,ALTERNATIVER2,ALTERNATIVER2[0]);
		return valg;
	}
	public Grensesnitt() {
		//Setter inn realistisk testdata med method nyGaupe og nyHare som er vist i klassen Kontroll
		Gaupe gaupe1=new Gaupe("G1","Hann",0.90,3.2,"01.01.20","Gulskogen",0.13);
		Gaupe gaupe2=new Gaupe("G2","Hunn",0.50,2.2,"02.01.20","Rødskogen",0.16);
		kontroll.nyGaupe(gaupe1);
		kontroll.nyGaupe(gaupe2);
		Hare hare1=new Hare("H1","Hann",0.90,3.2,"01.01.20","Gulskogen",'H',"svart");
		Hare hare2=new Hare("H2","Hunn",0.50,2.2,"02.01.20","Rødskogen",'V',"hvit");
		kontroll.nyHare(hare1);
		kontroll.nyHare(hare2);	
	}
	public void nyhare() {
		//Identitet i både nyhare og nygaupe er resultatet av methods jeg har laget.
		String identitet=Identitethare();
		String kjonn = JOptionPane.showInputDialog("Kjønn? (hann/hunn)");
		//Ettersom det er desimaltall, så må jeg bruke double.parsedouble for å motta desimaler
		double lengde = Double.parseDouble(JOptionPane.showInputDialog("Lengde? (M)"));
		double vekt = Double.parseDouble(JOptionPane.showInputDialog("Vekt? (Kg) "));
		String fangetdato = JOptionPane.showInputDialog("Fangetdato (dd.mm.yyyy)");
		String fangetsted = JOptionPane.showInputDialog("Hvor fanget du dyret?:");
		//Min metode for å overføre en string til en Char, samt få stor bokstav 
		String typeharetemp = JOptionPane.showInputDialog("Hvilken type hare? (’V’ for vanlig og ’S’ for sørhare");
		char typehare=typeharetemp.charAt(0);
		typehare = Character.toUpperCase(typehare);
		String farge = JOptionPane.showInputDialog("Farge på dyret?");
		//laging av objekt og legger til i arraylist
		kontroll.nyHare(new Hare(identitet,kjonn,lengde,vekt,fangetdato,fangetsted,typehare,farge));
	}
	
	public void skrivharer() {
		//Samme som nedenfor, men bare med harer
		ArrayList<Hare> harer = kontroll.getHarer();
		String uttekst = "";
		for(Hare k : harer) {
			uttekst+=k.toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, uttekst);
	}
	public void skrivgauper() {
		//henter gaupe listen , samtidig som jeg skriver inn alt inn i var uttekst. Får ut alle ved hjelp av en for løkke
		//som klikker enter hver gang et objekt er skrevet. Til slutt blir alt skrevet ut i en showmessagedialog
		ArrayList<Gaupe> gauper = kontroll.getGauper();
		String uttekst = "";
		for(Gaupe k : gauper) {
			uttekst+=k.toString() + "\n";
		}
		JOptionPane.showMessageDialog(null,  uttekst);
	}
	public void nygaupe() {
		//samme som over bare at jeg registrerer gauper
		String identitet=Identitetgaupe();
		String kjonn = JOptionPane.showInputDialog("Kjønn? (hann/hunn)");
		double lengde = Double.parseDouble(JOptionPane.showInputDialog("Lengde? (m)"));
		double vekt = Double.parseDouble(JOptionPane.showInputDialog("Vekt? (Kg) "));
		String fangetdato = JOptionPane.showInputDialog("Fangetdato (dd.mm.yyyy)");
		String fangetsted = JOptionPane.showInputDialog("Hvor fanget du dyret?:");
		double øretustene = Double.parseDouble(JOptionPane.showInputDialog("Lengden på øretustene? (m)"));
		kontroll.nyGaupe(new Gaupe(identitet,kjonn,lengde,vekt,fangetdato,fangetsted,øretustene));	
		System.out.println(identitet);
	}
	/* FOR BINÆRT SØK
	public void finngaupe() {
		String identitet;
		String x = JOptionPane.showInputDialog("identitet");
		identitet=x.toUpperCase();
		System.out.println(identitet);
		Gaupe gaupe = kontroll.finngaupeBinært(identitet);
		if(gaupe !=null) JOptionPane.showMessageDialog(null, gaupe.toString());
		else JOptionPane.showMessageDialog(null, "Finner ikke gaupen");
		
	}
	
	public void finnhare() {
		String identitet;
		String y = JOptionPane.showInputDialog("identitet");
		identitet=y.toUpperCase();
		System.out.println(identitet);
		Hare hare = kontroll.finnhareBinært(identitet);
		if(hare !=null) JOptionPane.showMessageDialog(null, hare.toString());
		else JOptionPane.showMessageDialog(null, "Finner ikke haren");
		
	}
	*/
	public void nyharegjenfanget() {
		//samme som den under bare at jeg registrerer gauper :-)
		String final_identitet;
		String identitet=JOptionPane.showInputDialog(null,"Identitet?");
		boolean check=false;
		
		final_identitet=identitet.toUpperCase();
		ArrayList<Hare> harer=kontroll.getHarer();
		for(int index = 0; index < harer.size(); index++) {
			Hare p = harer.get(index);
			
			String pnavn = p.getIdentitet();
			if (pnavn.contentEquals(final_identitet)) {
				check=true;
				System.out.println(check);
			}
			
		}
		
		if (check==true){
			System.out.println(check);
			double lengde = Double.parseDouble(JOptionPane.showInputDialog("Lengde? (m)"));
			double vekt = Double.parseDouble(JOptionPane.showInputDialog("Vekt? (Kg) "));
			String fangetdato = JOptionPane.showInputDialog("Fangetdato (dd.mm.yyyy)");
			String fangetsted = JOptionPane.showInputDialog("Hvor fanget du dyret?:");
			String typeharetemp = JOptionPane.showInputDialog("Hvilken type hare? (’V’ for vanlig og ’S’ for sørhare");
			char typehare=typeharetemp.charAt(0);
			typehare = Character.toUpperCase(typehare);
			String farge = JOptionPane.showInputDialog("Farge på dyret?");
			kontroll.nyHare(new Hare(final_identitet,lengde,vekt,fangetdato,fangetsted,typehare,farge));	
			check=true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Vi fant dessverre ikke dyret du refererer til."+"\n"+"Dersom dette er din første registrering av dette dyret"+"\n"+" Vennligst bruk det vanlige registreringsprogrammet");
			
		}
			
		
	}
	
	
	
	
	public void nygaupegjenfanget() {
		//samme som over bare at jeg registrerer gauper
		String final_identitet;
		//får input og lager en boolean flag om det eksisterer en tidligere gaupe med lik identitet
		String identitet=JOptionPane.showInputDialog(null,"Identitet?");
		boolean check=false;
		//bruker samme metode som i søkefunksjonen
		final_identitet=identitet.toUpperCase();
		ArrayList<Gaupe> gauper=kontroll.getGauper();
		for(int index = 0; index < gauper.size(); index++) {
			Gaupe p = gauper.get(index);
			//om det finnes, fortsetter registreringen, men om det ikke registreres så vil du få feilmelding
			String pnavn = p.getIdentitet();
			if (pnavn.contentEquals(final_identitet)) {
				check=true;
				System.out.println(check);
			}
			
		}
		//om det finnes så skrives det
		if (check==true){
			System.out.println(check);
			double lengde = Double.parseDouble(JOptionPane.showInputDialog("Lengde? (m)"));
			double vekt = Double.parseDouble(JOptionPane.showInputDialog("Vekt? (Kg) "));
			String fangetdato = JOptionPane.showInputDialog("Fangetdato (dd.mm.yyyy)");
			String fangetsted = JOptionPane.showInputDialog("Hvor fanget du dyret?:");
			double øretustene = Double.parseDouble(JOptionPane.showInputDialog("Lengden på øretustene? (m)"));
			kontroll.nyGaupe(new Gaupe(final_identitet,lengde,vekt,fangetdato,fangetsted,øretustene));	
			check=true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Vi fant dessverre ikke dyret du refererer til."+"\n"+"Dersom dette er din første registrering av dette dyret"+"\n"+" Vennligst bruk det vanlige registreringsprogrammet");
			
		}
			
		
	}
	
	

 public String Identitetgaupe() {
	 //Henter listen fra klassen kontroll
	 ArrayList<Gaupe> gaupene=kontroll.getGauper();
	 String identitet;
	 int identifier;
	 String final_identifier;
	 identitet="G";
	 //lager identitet ved hjelp av funksjonen size, der jeg plusser max antall objekter med 1 for å få ny identifier
	 identifier=gaupene.size()+1;
	 
	 final_identifier=identitet+identifier;
			 //returnerer identifieren
	return final_identifier;
 }
	
 public String Identitethare() {
	 //samme som over bare med hare istedenfor gaupe
	 ArrayList<Hare> gaupene=kontroll.getHarer();
	 String identitet;
	 int identifier;
	 String final_identifier;
	 identitet="H";
	 
	 identifier=gaupene.size()+1;
	 
	 final_identifier=identitet+identifier;
			 
	return final_identifier;
 }
	
	
 
 
 
 
 
 
 //finner hare ved hjelp av for løkke for å finne om det er gjenregistreringer også. 
 //Vurderte å lage det slik at alle kommer på en side, men 
 //virket bedre å ha en for hver popup
	public Hare finnhare() {
		String final_identitet;
		String identitet=JOptionPane.showInputDialog(null, "oppgi identitet");
		final_identitet=identitet.toUpperCase();
		ArrayList<Hare> harer=kontroll.getHarer();
		for(int index = 0; index < harer.size(); index++) {
			Hare p = harer.get(index);
			
			String pnavn = p.getIdentitet();
			
			
			if(pnavn.contentEquals(final_identitet)) JOptionPane.showMessageDialog(null,p);
		}
		return null;
	}
	
	public Gaupe finngaupe() {
		//samme som oppe men med gaupe
		String final_identitet;
		
		String identitet=JOptionPane.showInputDialog(null, "oppgi identitet");
		final_identitet=identitet.toUpperCase();
		ArrayList<Gaupe> gauper=kontroll.getGauper();
		for(int index = 0; index < gauper.size(); index++) {
			Gaupe p = gauper.get(index);
			
			String pnavn = p.getIdentitet();
			
			
			if(pnavn.contentEquals(final_identitet)) JOptionPane.showMessageDialog(null,p);
		}
		return null;
	}
	//menyhendelser. Altså om 1 blir registrert så blir funkjson 1 startet osv. Det er det jeg navngir nede
 //start
	public void start() {
		boolean fortsett = true;
		while(fortsett) {
			int valg = lesValget();
			switch(valg) {
				case ALT1 :gstart();
					break;
				case ALT2 : hstart();
					break;
				case ALT3 : fortsett = false;
			} 
		} 
	}
	//harer
	public void hstart() {
		boolean fortsett = true;
		while(fortsett) {
			int valg = lesValg2();
			switch(valg) {
				case ALT1 :nyhare();
					break;
				case ALT2 : nyharegjenfanget();
					break;
				case ALT3 :finnhare();
					break;
				case ALT4 : skrivharer();
					break;
					
				default : fortsett=false;
			} 
		} 
	}
	//gauper
	public void gstart() {

		boolean fortsett = true;

		while(fortsett) {
		
			int valg = lesvalg1();
		
			switch(valg) {
			case ALT1 : nygaupe();
			break;
			case ALT2 : nygaupegjenfanget();
			break;
			case ALT3 : finngaupe();
			break;
			case ALT4 : skrivgauper();
			break;
			default : fortsett = false;
			}
		}
	}
}

