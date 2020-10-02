package paket1;

public class PazarList {
	
	//Promenljiva
	private int id;
	private double vrednost;
	private String datum;
	private String uneo;
	
	//Kon. bez arg.
	public PazarList() {
		super();
	}

	//Kon. sa arg.
	public PazarList(int id, double vrednost, String datum, String uneo) {
		super();
		this.id = id;
		this.vrednost = vrednost;
		this.datum = datum;
		this.uneo = uneo;
	}

//------------Getteri i Setteri-----------------------	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getVrednost() {
		return vrednost;
	}

	public void setVrednost(double vrednost) {
		this.vrednost = vrednost;
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
//------------------------------------------------------
	@Override
	public String toString() {
		return "ID: " + id + "\n" + "Vrednost: " + vrednost + "\n" + 
				"Datum: " + datum + "\n" + "Uneo: " + uneo + "\n";
	}
	
	
	
}
