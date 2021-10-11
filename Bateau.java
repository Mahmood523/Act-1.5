
public class Bateau {
	public int id=1 ;
	
	public String size ;
	public String fonction ;
	
	
	

	public Bateau(int id) {
		super();
		this.id = id;
	}

	
	
	public Bateau(int id, String size, String fonction) {
		super();
		this.id = id;
		this.size = size;
		this.fonction = fonction;
	}
    
     
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
    


	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public String getFonction() {
		return fonction;
	}



	public void setFonction(String fonction) {
		this.fonction = fonction;
	}



	public void affiche (int id, String size, String fonction) {
		System.out.print("ID :"+id+" Size :"+size+" Fonction :"+fonction);
	}



	@Override
	public String toString() {
		return "Le bateau n°" + id ;
	}
	
	

}
