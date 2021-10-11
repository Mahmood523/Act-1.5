
public class Voile {
	public int id=6;
  
	private int largeur;	
    private String taille;
    public boolean vent;
    protected String materiau;
    
    private boolean enroule ;
    private boolean deroule ;
    
	
    

	public Voile(int id) {
		super();
		this.id = id;
	}

	
    
    



	public Voile(int id, int largeur, String taille, boolean vent, String materiau) {
		super();
		this.id = id;
		this.largeur = largeur;
		this.taille = taille;
		this.vent = vent;
		this.materiau = materiau;
	}







	public boolean enroule (boolean enroule ) {
    	if (vent == true)
    	enroule = false;
    	return enroule;
    	
    }
    
    public boolean deroule (boolean deroule ) {
    	if (vent == false)
    	deroule = true   ;
    	return deroule ;
    }
    
    






	public int getId() {
		return id;
	}







	public void setId(int id) {
		this.id = id;
	}







	public int getLargeur() {
		return largeur;
	}







	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}







	public String getTaille() {
		return taille;
	}







	public void setTaille(String taille) {
		this.taille = taille;
	}







	public boolean isVent() {
		return vent;
	}







	public void setVent(boolean vent) {
		this.vent = vent;
	}







	public String getMateriau() {
		return materiau;
	}







	public void setMateriau(String materiau) {
		this.materiau = materiau;
	}







	@Override
	public String toString() {
		return " qui est constitué de la Voile N°" + id ;
	}
     
    
}
