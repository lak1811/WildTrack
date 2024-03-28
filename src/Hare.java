import java.util.ArrayList;

public class Hare implements Comparable<Hare>{
	private String identitet;
	private String kjonn;
	private double lengde;
	private double vekt;
	private String fangetdato;
	private String fangetsted;
	private char typehare;
	private String farge;
	
	public Hare(String identitet, String kjonn, double lengde, double vekt, String fangetdato, String fangetsted,char typehare, String farge) {
		this.identitet = identitet;
		this.kjonn = kjonn;
		this.lengde = lengde;
		this.vekt = vekt;
		this.fangetdato = fangetdato;
		this.fangetsted = fangetsted;
		this.typehare = typehare;
		this.farge = farge;
	}
	
	public Hare(String identitet,double lengde, double vekt, String fangetdato, String fangetsted, char typehare, String farge) {
		this.identitet=identitet;
		this.lengde = lengde;
		this.vekt = vekt;
		this.fangetdato = fangetdato;
		this.fangetsted = fangetsted;
		this.typehare = typehare;
		this.farge = farge;
	}
	

	private ArrayList<Hare> hare = new ArrayList<>();
	
	//gettere og settere
	
	public Hare(String identitet) {
		this.identitet = identitet;
	}

	

	public String getIdentitet() {
		return identitet;
	}



	public String getKjonn() {
		return kjonn;
	}



	public double getLengde() {
		return lengde;
	}



	public double getVekt() {
		return vekt;
	}



	public String getFangetdato() {
		return fangetdato;
	}



	public String getFangetsted() {
		return fangetsted;
	}



	public char getTypehare() {
		return typehare;
	}



	public String getFarge() {
		return farge;
	}

//tostring metode, samt get for liste og for å sammenligne

	@Override
	public String toString() {
		return "Hare [identitet=" + identitet + ", kjonn=" + kjonn + ", lengde=" + lengde + ", vekt=" + vekt
				+ ", fangetdato=" + fangetdato + ", fangetsted=" + fangetsted + ", typehare=" + typehare + ", farge="
				+ farge + "]";
	}

	public ArrayList<Hare> getHarer() {
		return hare;
	}


	@Override
	public int compareTo(Hare denandre) {		
		return this.identitet.compareTo(denandre.getIdentitet());



}
}
