package Main;

import java.util.ArrayList;

import Exception.ChapeauxException;
import Exception.PointPlanException;
import Exception.QuadrilateresException;
import ardoise.*;

public class Maison extends FormesComposees{
	
	private Quadrilateres porte;
	private Quadrilateres contour;
	private Chapeaux toit; 

//Constructeur par défaut 
	public Maison() throws QuadrilateresException, ChapeauxException, PointPlanException 
	{
		super();
		this.setPorte(new Quadrilateres());
		this.setContour(new Quadrilateres());
		this.setToit(new Chapeaux()); 
	}

//Constructeur normal : 
	public Maison(String nom, Object o1, Object o2 , Object o3) throws QuadrilateresException, ChapeauxException
	{
		super(nom);
		Quadrilateres unePorte = (Quadrilateres) o1; 
		Quadrilateres unContour = (Quadrilateres) o2;
		Chapeaux unToit = (Chapeaux) o3; 
		this.setPorte(unePorte);
		this.setContour(unContour);
		this.setToit(unToit); 
	}

// Constructeurs par copie : 
	public Maison(Object o) throws QuadrilateresException, ChapeauxException, PointPlanException
	{
		super();
		Maison m = (Maison) o;
		this.setNomForme(m.getNomForme()); 
		this.setContour(new Quadrilateres(m.getContour()));
		this.setPorte(new Quadrilateres(m.getPorte()));
		this.setToit(new Chapeaux(m.getToit()));
	}

// Constructeur avec nouveau nom : 
	public Maison(String nom, Object o) throws Exception
	{
		super(nom);
		if (o instanceof Maison) 
		{
			 // Code à exécuter si o est un objet de type Maison
			Maison m = (Maison) o; 
			this.setContour(new Quadrilateres(m.getContour()));
			this.setPorte(new Quadrilateres(m.getPorte()));
			this.setToit(new Chapeaux(m.getToit()));
		}
		
		else if (o instanceof Quadrilateres) 
		{
			 // Code à exécuter si o est un objet de type Quadrilateres
			Quadrilateres cont = (Quadrilateres) o;
			this.setContour(cont); 
			this.setToit(new Chapeaux("toit",cont.getBasGauche(), cont.getBasDroit(), 1));
			this.setPorte(new Quadrilateres(creerPorte(cont)));
		}
		else
		{
			throw new Exception("L'objet passé en paramètre n'est ni de type Maison, ni de type Quadrilateres.");
		}
	}

//getters :
	public Quadrilateres getContour() {return contour;}

	public Quadrilateres getPorte() {return porte;}

	public Chapeaux getToit() {return toit;}

//setters : 
	public void setPorte(Object o) throws QuadrilateresException 
	{
		try {
		Quadrilateres unePorte = (Quadrilateres) o; 
		this.porte = unePorte;
		}
		catch (ClassCastException e) {
	        throw new QuadrilateresException("L'objet passé en paramètre n'est pas de type Quadrilateres.");
	    }
	}
		
	public void setContour(Object o) throws QuadrilateresException
	{
		try {
		Quadrilateres unContour = (Quadrilateres) o; 
		this.contour = unContour;
		}
		catch (ClassCastException e) {
        throw new QuadrilateresException("L'objet passé en paramètre n'est pas de type Quadrilateres.");
    }
	}
		
	public void setToit(Object o) throws ChapeauxException
	{
		try {
		Chapeaux unToit = (Chapeaux) o; 
		this.toit = unToit;
		}
		catch (ClassCastException e) {
			throw new ChapeauxException("L'objet passé en paramètre n'est pas de type Triangles."); 
		}
	}
	

//méthode pour creer une porte au centre du corp de la maison
	public Quadrilateres creerPorte(Object o) throws QuadrilateresException, PointPlanException
	{  
		try {
		Quadrilateres q = (Quadrilateres) o;
		int xA = q.getHautGauche().getAbscisse();
		int xB = q.getHautDroit().getAbscisse(); 
		int z = (xB + xA) / 2 ; 
		
		int yC = q.getHautDroit().getOrdonnee();
		int yB = q.getBasDroit().getOrdonnee();
		int w = (yC+yB) / 2;
			
		Quadrilateres porte = new Quadrilateres();
		
		if (xB - xA >= 30) 
		{
			porte.setHautGauche(new PointPlan(z-10, q.getHautGauche().getOrdonnee()));
			porte.setHautDroit(new PointPlan(z+10, q.getHautGauche().getOrdonnee()));
		}
		else
		{
			porte.setHautGauche(new PointPlan(z-1, q.getHautGauche().getOrdonnee()));
			porte.setHautDroit(new PointPlan(z+1, q.getHautGauche().getOrdonnee()));
		}
		porte.setBasGauche(new PointPlan(porte.getHautGauche().getAbscisse(), w));
		porte.setBasDroit(new PointPlan(porte.getHautDroit().getAbscisse(), w));
			
		return porte ; 
		}
		catch (ClassCastException e) {
	        throw new QuadrilateresException("L'objet passé en paramètre n'est pas de type Quadrilateres.");
	    }
	}
	
	@Override
	public void deplacer(int arg0, int arg1) 
	{
		this.contour.deplacer(arg0, arg1);
		this.toit.deplacer(arg0, arg1);
		this.porte.deplacer(arg0, arg1);
	}
	
	@Override
	public ArrayList<Segment> dessiner() 
	{
		ArrayList<Segment> liste = new ArrayList<Segment>(9);
	// Contour : 
		liste.add(new Segment(this.contour.getHautGauche(),this.contour.getBasGauche()));
		liste.add(new Segment(this.contour.getHautGauche(),this.contour.getHautDroit()));
		liste.add(new Segment(this.contour.getBasGauche(),this.contour.getBasDroit()));
		liste.add(new Segment(this.contour.getHautDroit(),this.contour.getBasDroit()));
		
	// Porte : 
		liste.add(new Segment(this.porte.getHautGauche(),this.porte.getBasGauche()));
		liste.add(new Segment(this.porte.getHautGauche(),this.porte.getHautDroit()));
		liste.add(new Segment(this.porte.getHautDroit(),this.porte.getBasDroit()));
		
	// Toit : 
		liste.add(new Segment(this.toit.getPoint1(),this.toit.getPoint2()));
		liste.add(new Segment(this.toit.getPoint3(),this.toit.getPoint2()));
	
		return liste;
	}
	
	
//toString : 
	public String toString()
	{
		return super.toString() + "\n"
				+ "Mon corps de maison : " + this.getContour().toString() + "\n" 
				+ "Ma porte : " + this.getPorte().toString() + "\n"
				+ "Mon toit : " + this.getToit().toString()  + "\n" ; 
	}
}
