package Main;

import ardoise.Forme;

public abstract class FormesComposees extends Forme{
	
	public FormesComposees()
	{
		super(); 
	}
	public FormesComposees(String nom) 
	{
		super(nom); 
	}
	
	public String typeForme() 
	{
		return "GF";
	}
	
	public String toString()
	{
		return super.toString() + "\n" 
				+ "Je suis une forme composée de type : " 
				+ this.typeForme() + "\n" ; 
	}
}
