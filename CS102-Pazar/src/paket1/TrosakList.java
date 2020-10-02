package paket1;

public class TrosakList {
	
	//Promenljive
	private int id;
	private String naziv;
	private double trosak;
	private String datum;
	private String uneo;
	
	//Kon. bez. arg.
	public TrosakList() {
		super();
	}

	//Kons. sa arg.
	public TrosakList(int id, String naziv, double trosak, String datum, String uneo) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.trosak = trosak;
		this.datum = datum;
		this.uneo = uneo;
	}

//----------------------Getteri i Setteri-------------------------------------------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getTrosak() {
		return trosak;
	}

	public void setTrosak(double trosak) {
		this.trosak = trosak;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getUneo() {
		return uneo;
	}

	public void setUneo(String uneo) {
		this.uneo = uneo;
	}
//------------------------------------------------------------
	@Override
	public String toString() {
		return "ID: " + id + "\n" + "Naziv: " + naziv + "\n" +
				"Vrednost: " + trosak + "\n" + "Datum: " + datum + "\n" +
				"Uneo: " + uneo + "\n";
	}
	
	
}
