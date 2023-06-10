package Main;

import java.util.ArrayList;

import ardoise.*;

public class Quadrilateres extends Forme {
	
	private PointPlan hautGauche;
	private PointPlan basGauche; 
	private PointPlan hautDroit ; 
	private PointPlan basDroit; 

	// Constructeur par défaut : 
	public Quadrilateres() 
	{
		super();
		this.setHautGauche(new PointPlan(0,0));
		this.setBasGauche(new PointPlan(0,0));
		this.setHautDroit(new PointPlan(0,0));
		this.setBasDroit(new PointPlan(0,0)) ;
	}
	// Constructeur qui initialise un nom et les points du quadrilatères : 
	public Quadrilateres(String nom, PointPlan p, PointPlan p0) 
	{
		super(nom);
		this.setHautGauche(p);
		this.setBasGauche(new PointPlan(p.getAbscisse(),p0.getOrdonnee()));
		this.setHautDroit(new PointPlan(p0.getAbscisse(),p.getOrdonnee())); 
		this.setBasDroit(p0);
	}
	
	// Constructeur par copie : 
	public Quadrilateres(Quadrilateres copie)
	{
		super(copie.getNomForme());
		this.setHautGauche(copie.getHautGauche());
		this.setBasGauche(copie.getBasGauche());
		this.setHautDroit(copie.getHautDroit());
		this.setBasDroit(copie.getBasDroit());
	}
	//getters : 
	public PointPlan getHautGauche() 
	{
		return this.hautGauche;
	}
	
	public PointPlan getBasGauche() 
	{
		return this.basGauche;
	}
	
	public PointPlan getHautDroit() 
	{
		return this.hautDroit;
	}
	
	public PointPlan getBasDroit() 
	{
		return this.basDroit;
	}
	
	//setters : 
	public void setHautGauche(PointPlan p1) 
	{
		this.hautGauche = p1;
	}
	
	public void setBasGauche(PointPlan p2) 
	{
		this.basGauche = p2;
	}
	
	public void setHautDroit(PointPlan p3) 
	{
		this.hautDroit = p3;
	}
	
	public void setBasDroit(PointPlan p4) 
	{
		this.basDroit = p4;
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

}
