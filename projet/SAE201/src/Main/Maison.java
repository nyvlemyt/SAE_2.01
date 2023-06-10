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
		this.setPorte(new Quadrilateres());
		this.setContour(new Quadrilateres());
		this.setToit(new Chapeaux()); 
	}

	public Maison( String unnom, Quadrilateres unContour)
	{
		super(unnom);
		this.setContour(unContour); 
		
		
	}
	
	public Maison(String nom, Quadrilateres unePorte, Quadrilateres leContour, Chapeaux leToit)
	{
		super(nom);
		this.setPorte(unePorte);
		this.setContour(leContour);
		this.setToit(leToit); 
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

	//getters :
	public Quadrilateres getContour() 
	{
		return contour;
	}

	public Quadrilateres getPorte() 
	{
		return porte;
	}

	public Chapeaux getToit()
	{
		return toit;
	}

	//setters : 
	public void setPorte(Quadrilateres unePorte)
	{
		this.porte = unePorte;
	}
	
	public void setContour(Quadrilateres unContour) 
	{
		this.contour = unContour;
	}
	
	public void setToit(Chapeaux unToit) 
	{
		this.toit = unToit;
	}

}
