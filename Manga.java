
public class Manga extends Livre {
	
	public String noiretblanc;
	public String dg;
	public int tailleManga;
	public Manga(String titre, String auteur, float prix, int np, String noiretblanc, String dg, int tailleManga) {
		super(titre, auteur, prix, np);
		this.noiretblanc = noiretblanc;
		this.dg = dg;
		this.tailleManga = tailleManga;
	}
	public String getNoiretblanc() {
		return noiretblanc;
	}
	public void setNoiretblanc(String noiretblanc) {
		this.noiretblanc = noiretblanc;
	}
	public String getDg() {
		return dg;
	}
	public void setDg(String dg) {
		this.dg = dg;
	}
	public int getTailleManga() {
		return tailleManga;
	}
	public void setTailleManga(int tailleManga) {
		this.tailleManga = tailleManga;
	}
	
	public void Afficher() {
	     
		System.out.println("Le titre: "+titre+" L'auteur: "+auteur+" Le prix:"+prix+" Le nombre de pages: "+np);
		
	}
	
	
	
	
	

}
