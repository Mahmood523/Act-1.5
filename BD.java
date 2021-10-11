
public class BD extends Livre {
	
	public boolean couleur;
	public String gd;
	public int tailleBD;
	
	

	

	

	public BD(String titre, String auteur, double prix, int np, boolean genre) {
		super(titre, auteur, prix, np, genre);
		// TODO Auto-generated constructor stub
	}

	public BD(String titre, String auteur, double prix, int np) {
		super(titre, auteur, prix, np);
		// TODO Auto-generated constructor stub
	}

	public boolean isCouleur() {
		return couleur;
	}

	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}

	public String getGd() {
		return gd;
	}

	public void setGd(String gd) {
		this.gd = gd;
	}

	public int getTailleBD() {
		return tailleBD;
	}

	public void setTailleBD(int tailleBD) {
		this.tailleBD = tailleBD;
	}
	
	public void Afficher() {
	     
		System.out.println("Le titre: "+titre+" L'auteur: "+auteur+" Le prix:"+prix+" Le nombre de pages: "+np+" Le genre: "+ genre);
		 
	}
	
	

	
	
	
	
	

}
