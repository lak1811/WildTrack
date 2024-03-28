import java.util.ArrayList;





public class Gaupe implements Comparable<Gaupe> {
	private String identitet;
	private String kjonn;
	private double lengde;
	private double vekt;
	private String fangetdato;
	private String fangetsted;
	private double øretustene;
	
	
	private ArrayList<Gaupe> gauper = new ArrayList<>();
	
	//3 constructors for å få flere muligheter til å lage et objekt
	public Gaupe(String identitet, String kjonn, double lengde,double vekt,String fangetdato,String fangetsted,double øretustene) {
		this.identitet = identitet;
		this.kjonn = kjonn;
		this.lengde = lengde;
		this.vekt = vekt;
		this.fangetdato = fangetdato;
		this.fangetsted = fangetsted;
		this.øretustene = øretustene;
		
		
	
	
	}
	
	public Gaupe(String identitet) {
		this.identitet = identitet;
	}
	
	
	public Gaupe(String identitet,double lengde,double vekt,String fangetdato,String fangetsted, double øretustene) {
		this.identitet=identitet;
		this.lengde = lengde;
		this.vekt = vekt;
		this.fangetdato = fangetdato;
		this.fangetsted = fangetsted;
		this.øretustene = øretustene;
		
		
		
	
	
	}
	//getters setters, tostring og en compareto
	

	@Override
	public int compareTo(Gaupe denandre) {		
		return this.identitet.compareTo(denandre.getIdentitet());
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

	public double getØretustene() {
		return øretustene;
	}

	public ArrayList<Gaupe> getGauper() {
		return gauper;
	}
	
	


	@Override
	public String toString() {
		return "Gaupe [identitet=" + identitet + ", kjonn=" + kjonn + ", lengde=" + lengde + ", vekt=" + vekt
				+ ", fangetdato=" + fangetdato + ", fangetsted=" + fangetsted + ", øretustene=" + øretustene + "]";
	}
	

	
	
	
}
