
public class Cabine {

	public int id=3;
	public int surface;
	public int hauteur;
	
	public Cabine(int id) {
		super();
		this.id = id;
	}

	public Cabine(int id, int surface, int hauteur) {
		super();
		this.id = id;
		this.surface = surface;
		this.hauteur = hauteur;
	}

	  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	@Override
	public String toString() {
		return "La cabine n°" + id  ;
	}
	
	
	
	
}
