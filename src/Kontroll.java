import java.util.ArrayList;



public class Kontroll {

//lager lister
	// TODO Auto-generated method stub
	private ArrayList<Hare> harer = new ArrayList<>();
	private ArrayList<Gaupe> gauper = new ArrayList<>();

	
	/* DETTE ER DEN BINÆRE METODEN
	public Gaupe finngaupeBinært(String identitet) {
	//samme som nede bare med gaupe

		Collections.sort(gauper);
	
		Gaupe dummy = new Gaupe(identitet, null, 1,1,null,null,1);
		
		int indeks = Collections.binarySearch(gauper, dummy);

		if(indeks >=0) return gauper.get(indeks);
		else return null;
	}
	public Hare finnhareBinært(String identitet) {

		Collections.sort(harer);
		//sorterer først
		Hare dummy = new Hare(identitet, null,1,1,null,null,'x',null);
		//lager en dummy for å sammenligne mot
		int indeks = Collections.binarySearch(harer, dummy);
		//gjør binært søk
		//Vi tester om noe ble funnet:
		if(indeks >=0) return harer.get(indeks);
		else return null;
	}
	*/
	//getters setters og adders
	
	public void nyGaupe(Gaupe gaupe) {
		gauper.add(gaupe);
	}

	
	public ArrayList<Hare> getHarer() {
		return harer;
	}

	public ArrayList<Gaupe> getGauper() {
		return gauper;
	}
	
	public void nyHare(Hare haren) {
		harer.add(haren);
	}

}
