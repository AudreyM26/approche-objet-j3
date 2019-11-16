package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;
	private int etage;

	public Piece(double superficie, int numEtage) {
		super();
		this.superficie = superficie;
		this.etage = numEtage;
	}
	
	public abstract String getType();
	
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public int getEtage() {
		return this.etage;
	}
	public void setEtage(int numEtage) {
		this.etage = numEtage;
	}
	
	
}
