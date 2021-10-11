
public class Pont {
	public int id=4;
	public int longueur;
	public int largeur;
	
	
	public Pont(int id) {
		super();
		this.id = id;
	}


	public Pont(int id, int longueur, int largeur) {
		super();
		this.id = id;
		this.longueur = longueur;
		this.largeur = largeur;
	}
    
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getLongueur() {
		return longueur;
	}


	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}


	public int getLargeur() {
		return largeur;
	}


	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}


	@Override
	public String toString() {
		return "Le pont n°" + id ;
	}


	
	
	

}
