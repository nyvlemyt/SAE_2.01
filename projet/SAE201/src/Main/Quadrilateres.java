package Main;

import java.util.ArrayList;

import Exception.PointPlanException;
import Exception.QuadrilateresException;
import ardoise.*;

public class Quadrilateres extends Forme {
	
	private PointPlan hautGauche;
	private PointPlan basGauche; 
	private PointPlan hautDroit ; 
	private PointPlan basDroit;

//Constructeur par défaut : 
	public Quadrilateres() throws PointPlanException 
	{
		super();
		this.setHautGauche(new PointPlan(0,0));
		this.setBasGauche(new PointPlan(0,0));
		this.setHautDroit(new PointPlan(0,0));
		this.setBasDroit(new PointPlan(0,0)) ;
	}
	
// Constructeur normal : 
	public Quadrilateres(String nom, PointPlan p, PointPlan p0) throws PointPlanException 
	{
		super(nom);
		this.setHautGauche(p);
		this.setBasGauche(new PointPlan(p.getAbscisse(),p0.getOrdonnee()));
		this.setHautDroit(new PointPlan(p0.getAbscisse(),p.getOrdonnee())); 
		this.setBasDroit(p0);
	}
	
//Constructeurs par copie : 
	public Quadrilateres(Object o) throws QuadrilateresException, PointPlanException 
	{
		super();
		try {
		Quadrilateres nouvQuadrilatères = (Quadrilateres) o ; 
		this.setNomForme(nouvQuadrilatères.getNomForme());
		this.setHautGauche(nouvQuadrilatères.getHautGauche());
		this.setBasGauche(nouvQuadrilatères.getBasGauche());
		this.setHautDroit(nouvQuadrilatères.getHautDroit());
		this.setBasDroit(nouvQuadrilatères.getBasDroit());
		 } 
		catch (ClassCastException e) {
		        throw new QuadrilateresException("L'objet passé en paramètre n'est pas de type Quadrilateres.");
		    }
	}
	
	
//Constructeur par copie avec nouveau nom : 
	public Quadrilateres(String nom, Object o) throws QuadrilateresException, PointPlanException
	{
		super(nom);
		try {
		Quadrilateres copie = (Quadrilateres) o; 
		this.setHautGauche(copie.getHautGauche());
		this.setBasGauche(copie.getBasGauche());
		this.setHautDroit(copie.getHautDroit());
		this.setBasDroit(copie.getBasDroit());
		 } 
		catch (ClassCastException e) {
		        throw new QuadrilateresException("L'objet passé en paramètre n'est pas de type Quadrilateres.");
		    }
	}
	
//getters : 
	public PointPlan getHautGauche() {return this.hautGauche;}
	
	public PointPlan getBasGauche() {return this.basGauche;}
	
	public PointPlan getHautDroit() {return this.hautDroit;}
	
	public PointPlan getBasDroit() {return this.basDroit;}
	
//setters : 
	public void setHautGauche(PointPlan p1) throws PointPlanException
	{
		try 
		{
			this.hautGauche = p1;
		} 
		catch (ClassCastException e)
		{
			throw new PointPlanException("L'objects passé en paramètre n'est pas de type PointPlan."); 
		}
	}
		
	
	public void setBasGauche(PointPlan p2) throws PointPlanException
	{
		try 
		{
			this.basGauche = p2;
		} 
		catch (ClassCastException e)
		{
			throw new PointPlanException("L'object passé en paramètre n'est pas de type PointPlan."); 
		}
	}
	
	public void setHautDroit(PointPlan p3) throws PointPlanException
	{
		try 
		{
			this.hautDroit = p3;
		} 
		catch (ClassCastException e)
		{
			throw new PointPlanException("L'object passé en paramètre n'est pas de type PointPlan."); 
		}
	}
	
	public void setBasDroit(PointPlan p4) throws PointPlanException
	{
		try 
		{
			this.basDroit = p4;
		}
		catch (ClassCastException e)
		{
		throw new PointPlanException("L'object passé en paramètre n'est pas de type PointPlan."); 
		}
	}
	
	@Override
	public void deplacer(int arg0, int arg1) 
	{
		this.hautGauche.deplacer(arg0, arg1);
		this.basGauche.deplacer(arg0, arg1);
		this.hautDroit.deplacer(arg0, arg1);
		this.basDroit.deplacer(arg0, arg1);
	}

	@Override
	public ArrayList<Segment> dessiner() 
	{
		ArrayList<Segment> liste = new ArrayList<Segment>(4);
		liste.add(new Segment(this.hautGauche,this.basGauche));
		liste.add(new Segment(this.hautGauche,this.hautDroit));
		liste.add(new Segment(this.basGauche,this.basDroit));
		liste.add(new Segment(this.hautDroit,this.basDroit));
		return liste;
	}

	@Override
	public String typeForme() 
	{
		return "Q";
	}
	
//toString : 
	public String toString()
	{
		return super.toString() + "\n"
				+ "type : "+ this.typeForme() +"\n"
				+ "Point Haut Gauche : " + this.getHautGauche() + "\n"
				+ "Point Bas Gauche : " + this.getBasGauche()	+ "\n" 
				+ "Point Haut Droit : " + this.getHautDroit() + "\n" 
				+ "Point Bas Droit : " + this.getBasDroit() + "\n" ; 
	}
	
}
