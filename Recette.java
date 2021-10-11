
public class Recette  {
	
	public String nom;
	public String description;
	public int difficulte;
	public String etapes;
	public String nvEtape;
	public String nvAstuce;
	
	

	
    
	

	public Recette(String nom, String description, int difficulte) {
		super();
		this.nom = nom;
		this.description = description;
		this.difficulte = difficulte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(int difficulte) {
		this.difficulte = difficulte;
	}

	public String getEtapes() {
		return etapes;
	}

	public void setEtapes(String etapes) {
		this.etapes = etapes;
	}
	
	
	
	public String getNvEtape() {
		return nvEtape;
	}

	public void setNvEtape(String nvEtape) {
		this.nvEtape = nvEtape;
	}

	
	public String getNvAstuce() {
		return nvAstuce;
	}

	public void setNvAstuce(String nvAstuce) {
		this.nvAstuce = nvAstuce;
	}

	public String addEtape(String etapes) {
		
	return	etapes= (etapes +" puis "+nvEtape);
		
	}
	
    public String addAstuce(String astuce) {
		
		return	astuce= (astuce +" et "+nvAstuce);
			
		}
	
	
	
	
	
	
	
	
	
	
	
	

}
