package Main;

import java.util.ArrayList;

import ardoise.*;

public class Maison extends FormesComposees{
	
	private Quadrilateres porte;
	private Quadrilateres contour;
	private Chapeaux toit; 

	public Maison() 
	{
		super();
		this.porte = new Quadrilateres();
		this.contour = new Quadrilateres();
		this.toit = new Chapeaux(); 
	}

	public Maison( String unnom, Quadrilateres unContour)
	{
		super(unnom);
		this.contour = unContour; 
		
		
	}
	
	public Maison(String nom, Quadrilateres unePorte, Quadrilateres leContour, Chapeaux leToit)
	{
		super(nom);
		this.porte = unePorte;
		this.contour = leContour;
		this.toit = leToit; 
	}
	
	@Override
	public void deplacer(int arg0, int arg1) 
	{
		
		
	}

	@Override
	public ArrayList<Segment> dessiner() {
		// TODO Auto-generated method stub
		return null;
	}

}
