package Main;

import ardoise.Forme;

public abstract class FormesComposees extends Forme{
	
	public FormesComposees() {
		super(); 
	}
	public FormesComposees(String nom) {
		super(nom); 
	}
	
	public String typeForme() 
	{
		return "GF";
	}

}
