import javax.lang.model.type.DeclaredType;

public class ChaineCryptee{
	
	private String chaine;
	private int decalage;
	
	public ChaineCryptee(String chaine, int decalage) {
		if( chaine == null ) {
			this.chaine = "";
		}
		this.chaine = chaine;
		this.decalage = decalage;
	}
	
	public String decrypte() {
		return this.chaine;
	}
	
	public String crypte() {
		String c = "";
		try {
			for(int i = 0; i < this.chaine.length(); i++) {
				c =  c + decaleCaractere((this.chaine).charAt(i), this.decalage);
			}
			
		}catch(NullPointerException e){
			System.out.println(e);
		}
		return c;
	}
	
	public char decaleCaractere(char chaine, int decalage) {
		if (chaine < 'A' || chaine > 'Z')
			return chaine;
		else
			return ( char ) ((( chaine - 'A' + decalage) % 26 ) + 'A' );
	}
	
	public static void main(String[] args) {
		
		ChaineCryptee c = new ChaineCryptee(null, 2);
		System.out.println(c.crypte());
		

	}
	
}
