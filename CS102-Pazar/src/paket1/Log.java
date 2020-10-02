package paket1;

public class Log {
	
	//Promenljive
	private int id;
	private String poruka;
	private String vreme;
	
	//Kons. bez arg.
	public Log() {
		super();
	}

	//Kons. sa arg.
	public Log(int id, String poruka, String vreme) {
		super();
		this.id = id;
		this.poruka = poruka;
		this.vreme = vreme;
	}

//------------Getteri i setteri-------------------------------	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPoruka() {
		return poruka;
	}

	public void setPoruka(String poruka) {
		this.poruka = poruka;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}
//-----------------------------------------------------
	@Override
	public String toString() {
		return poruka;
	}
	
	
	
}
