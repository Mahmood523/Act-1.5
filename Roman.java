
public class Roman extends Livre {
	
	public int nbChapitre;
	public String description;
	
	
	public Roman(String titre, String auteur, double prix, int np, boolean genre) {
		super(titre, auteur, prix, np, genre);
		// TODO Auto-generated constructor stub
	}
	public Roman(String titre, String auteur, double prix, int np) {
		super(titre, auteur, prix, np);
		// TODO Auto-generated constructor stub
	}
	public int getnbChapitre() {
		return nbChapitre;
	}
	public void setnbChapitre(int nbChapitre) {
		this.nbChapitre = nbChapitre;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	
	public void Afficher() {
	     
		System.out.println("Le titre: "+titre+" L'auteur: "+auteur+" Le prix:"+prix+" Le nombre de pages: "+np);
		
	}
	

}
