
public class Livre {
    
	 public String titre;
     public String auteur;
     public double prix;
     public int np;
     public boolean genre;
	
     
	
     public Livre(String titre, String auteur, double prix, int np) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.np = np;
	}

	public Livre(String titre, String auteur, double prix, int np, boolean genre) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.np = np;
		this.genre = genre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getNp() {
		return np;
	}

	public void setNp(int np) {
		this.np = np;
	}

	public boolean isGenre() {
		return genre;
	}

	public void setGenre(boolean genre) {
		this.genre = genre;
	}

	public void Afficher() {
     
		System.out.println("Le titre: "+titre+" L'auteur: "+auteur+" Le prix:"+prix+" Le nombre de pages: "+np);
		
	}
	
     
}
