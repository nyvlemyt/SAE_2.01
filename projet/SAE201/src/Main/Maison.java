package Main;

import java.util.ArrayList;

import ardoise.*;

public class Maison extends FormesComposees{
	
	private Quadrilateres porte;
	private Quadrilateres contour;
	private Chapeaux toit; 

//Constructeur par défaut 
	public Maison() 
	{
		super();
		this.setPorte(new Quadrilateres());
		this.setContour(new Quadrilateres());
		this.setToit(new Chapeaux()); 
	}

//Constructeur normal : 
	public Maison(String nom, Object o1, Object o2 , Object o3)
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
	public Maison(Object o)
	{
		super();
		Maison m = (Maison) o;
		this.setNomForme(m.getNomForme()); 
		this.setContour(new Quadrilateres(m.getContour()));
		this.setPorte(new Quadrilateres(m.getPorte()));
		this.setToit(new Chapeaux(m.getToit()));
	}

// Constructeur avec nouveau nom : 
	public Maison(String nom, Object o)
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
		
		if (o instanceof Quadrilateres) 
		{
			 // Code à exécuter si o est un objet de type Quadrilateres
			Quadrilateres cont = (Quadrilateres) o;
			this.setContour(cont); 
			this.setToit(new Chapeaux("toit",cont.getBasGauche(), cont.getBasDroit(), 1));
			this.setPorte(new Quadrilateres(creerPorte(cont)));
		}
	}

//getters :
	public Quadrilateres getContour() {return contour;}

	public Quadrilateres getPorte() {return porte;}

	public Chapeaux getToit() {return toit;}

//setters : 
	public void setPorte(Object o) 
	{
		Quadrilateres unePorte = (Quadrilateres) o; 
		this.porte = unePorte;
	}
		
	public void setContour(Object o)
	{
		Quadrilateres unContour = (Quadrilateres) o; 
		this.contour = unContour;
	}
		
	public void setToit(Object o) 
	{
		Chapeaux unToit = (Chapeaux) o; 
		this.toit = unToit;
	}
	

//méthode pour creer une porte au centre du corp de la maison
	public Quadrilateres creerPorte(Object o)
	{  
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
