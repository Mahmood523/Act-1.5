
public class LivreRecette extends Livre {
	
	public String astuce;
	public String nvAstuce;
	public int nbRecettes;
	public Recette rc1;
	
	

	public LivreRecette(String titre, String auteur, double prix, int np, boolean genre) {
		super(titre, auteur, prix, np, genre);
		// TODO Auto-generated constructor stub
	}

	public LivreRecette(String titre, String auteur, double prix, int np) {
		super(titre, auteur, prix, np);
		// TODO Auto-generated constructor stub
	}

	public String getAstuce() {
		return astuce;
	}

	public void setAstuce(String astuce) {
		this.astuce = astuce;
	}

	public int getNbRecettes() {
		return nbRecettes;
	}

	public void setNbRecettes(int nbRecettes) {
		this.nbRecettes = nbRecettes;
	}

	
    public void addRecette(Recette rc1) {
    	
    	
	
	
    }
	
	
}
