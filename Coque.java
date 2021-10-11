
public class Coque {
	public int id=2 ;
    public String materiau;
    public int epaisseur;
	
    
	public Coque(int id) {
		super();
		this.id = id;
	}


	public Coque(int id, String materiau, int epaisseur) {
		super();
		this.id = id;
		this.materiau = materiau;
		this.epaisseur = epaisseur;
	}

    
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMateriau() {
		return materiau;
	}


	public void setMateriau(String materiau) {
		this.materiau = materiau;
	}


	public int getEpaisseur() {
		return epaisseur;
	}


	public void setEpaisseur(int epaisseur) {
		this.epaisseur = epaisseur;
	}


	@Override
	public String toString() {
		return "La coque n°" + id ;
	}
	
	
    
    
    
}
