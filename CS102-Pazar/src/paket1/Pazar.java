package paket1;

import java.util.List;

public class Pazar {
	
//Proneljive	
	
	private double deset;
	private double dvadeset;
	private double pedeset;
	private double sto;
	private double dvesta;
	private double petsto;
	private double hiljadu;
	private double dvehiljade;
	private double pethiljada;
	private int drugo1;
	private double drugo2;
	
	//Kons. bez argu.
	public Pazar() {
		super();
	}

	//Kons. sa argu.
	public Pazar(double deset, double dvadeset, double pedeset, double sto, double dvesta, double petsto,
			double hiljadu, double dvehiljade, double pethiljada, int drugo1, double drugo2) {
		super();
		this.deset = deset;
		this.dvadeset = dvadeset;
		this.pedeset = pedeset;
		this.sto = sto;
		this.dvesta = dvesta;
		this.petsto = petsto;
		this.hiljadu = hiljadu;
		this.dvehiljade = dvehiljade;
		this.pethiljada = pethiljada;
		this.drugo1 = drugo1;
		this.drugo2 = drugo2;
	}
	
	//Getteri i Setteri
	public double getDeset() {
		return deset;
	}

	public void setDeset(double deset) {
		this.deset = deset;
	}

	public double getDvadeset() {
		return dvadeset;
	}

	public void setDvadeset(double dvadeset) {
		this.dvadeset = dvadeset;
	}

	public double getPedeset() {
		return pedeset;
	}

	public void setPedeset(double pedeset) {
		this.pedeset = pedeset;
	}

	public double getSto() {
		return sto;
	}

	public void setSto(double sto) {
		this.sto = sto;
	}

	public double getDvesta() {
		return dvesta;
	}

	public void setDvesta(double dvesta) {
		this.dvesta = dvesta;
	}

	public double getPetsto() {
		return petsto;
	}

	public void setPetsto(double petsto) {
		this.petsto = petsto;
	}

	public double getHiljadu() {
		return hiljadu;
	}

	public void setHiljadu(double hiljadu) {
		this.hiljadu = hiljadu;
	}

	public double getDvehiljade() {
		return dvehiljade;
	}

	public void setDvehiljade(double dvehiljade) {
		this.dvehiljade = dvehiljade;
	}

	public double getPethiljada() {
		return pethiljada;
	}

	public void setPethiljada(double pethiljada) {
		this.pethiljada = pethiljada;
	}

	public int getDrugo1() {
		return drugo1;
	}

	public void setDrugo1(int drugo1) {
		this.drugo1 = drugo1;
	}

	public double getDrugo2() {
		return drugo2;
	}

	public void setDrugo2(double drugo2) {
		this.drugo2 = drugo2;
	}

	@Override
	public String toString() {
		return "10 x " + deset + "\n" + "20 x " + dvadeset + "\n" +
				"50 x " + pedeset + "\n" + "100 x " + sto + "\n" +
				"200 x " + dvesta + "\n" + "500 x " + petsto + "\n" +
				"1000 x " + hiljadu + "\n" + "2000 x " + dvehiljade + "\n" +
				"5000 x " + pethiljada + "\n" + drugo1 + "x " + drugo2 + "\n";
	}

	
	
	
}
