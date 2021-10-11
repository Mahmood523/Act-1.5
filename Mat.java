
public class Mat {
	public int id=5;
	public int longueur;
	public String reigidite;
	
	
	public Mat(int id) {
		super();
		this.id = id;
	}


	public Mat(int id, int longueur, String reigidite) {
		super();
		this.id = id;
		this.longueur = longueur;
		this.reigidite = reigidite;
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


	public String getReigidite() {
		return reigidite;
	}


	public void setReigidite(String reigidite) {
		this.reigidite = reigidite;
	}


	@Override
	public String toString() {
		return " est consituté du Mat n°" + id ;
	}


	
	
	

}
