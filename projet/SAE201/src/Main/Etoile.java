package Main;

import java.util.ArrayList;

import Exception.ChapeauxException;
import Exception.PointPlanException;
import ardoise.*;

public class Etoile extends FormesComposees{

	private Chapeaux branche1 ;
	private Chapeaux branche2 ;
	private Chapeaux branche3 ;
	private Chapeaux branche4 ;
	
//Constructeur par défaut : 
	public Etoile() throws PointPlanException, ChapeauxException 
	{
			super();
			this.setBranche1(new Chapeaux()) ;
			this.setBranche2( new Chapeaux()) ;
			this.setBranche3( new Chapeaux()) ;
			this.setBranche4(new Chapeaux()) ;
	}
//Constructeur normal : 	
	public Etoile(String nom, Object o1, Object o2 , Object o3 , Object o4) throws ChapeauxException
	{
			super(nom) ;
			Chapeaux b1 = (Chapeaux) o1; 
			Chapeaux b2 = (Chapeaux) o2; 
			Chapeaux b3 = ( Chapeaux) o3;
			Chapeaux b4 = (Chapeaux) o4; 
			this.setBranche1(b1) ;
			this.setBranche2(b2) ;
			this.setBranche3(b3) ;
			this.setBranche4(b4) ;
	}


//Construteurs par copie : 
	public Etoile(Object o) throws ChapeauxException, PointPlanException
	{
		super();
		Etoile e = (Etoile) o ;
		this.setNomForme(e.getNomForme());
		this.setBranche1(new Chapeaux(e.getBranche1()));
		this.setBranche2(new Chapeaux(e.getBranche2()));
		this.setBranche3(new Chapeaux(e.getBranche3()));
		this.setBranche4(new Chapeaux(e.getBranche4()));
	}

//Construteur avec nouveau nom : 
	public Etoile(String nom, Object o) throws Exception
	{
		super(nom); 
		
		if (o instanceof Etoile) 
		{
            // Code à exécuter si o est un objet de type Etoile
        	Etoile e = (Etoile) o; 
    		this.setBranche1(new Chapeaux(e.getBranche1()));
    		this.setBranche2(new Chapeaux(e.getBranche2()));
    		this.setBranche3(new Chapeaux(e.getBranche3()));
    		this.setBranche4(new Chapeaux(e.getBranche4()));
        }
		else if (o instanceof Quadrilateres) 
		{
            // Code à exécuter si o est un objet de type Quadrilateres
			Quadrilateres q = (Quadrilateres) o; 
			PointPlan basG = new PointPlan(q.getBasGauche().getAbscisse(), q.getBasGauche().getOrdonnee()); 
			PointPlan basD = new PointPlan(q.getBasDroit().getAbscisse(), q.getBasDroit().getOrdonnee());
			PointPlan hautG = new PointPlan(q.getHautGauche().getAbscisse(), q.getHautGauche().getOrdonnee());
			PointPlan hautD = new PointPlan(q.getHautDroit().getAbscisse(), q.getHautDroit().getOrdonnee());
		
			this.setBranche1(new Chapeaux("banche 1",q.getBasDroit(),q.getBasGauche(),1));
			this.setBranche2(new Chapeaux("banche 2",basG ,hautG,0));
			this.setBranche3(new Chapeaux("banche 3",q.getHautDroit(),q.getHautGauche(),0));
			this.setBranche4(new Chapeaux("banche 4",basD,hautD,1));

        } 
		else
		{
			throw new Exception("L'objet passé en paramètre n'est ni de type Etoile, ni de type Quadrilateres.");
		}
	}
	
//getters : 
	public Chapeaux getBranche1() {return branche1;}

	public Chapeaux getBranche2() {return branche2;}

	public Chapeaux getBranche3() {return branche3;}
	
	public Chapeaux getBranche4() {return branche4;}
	
//setters : 
	public void setBranche1(Object o) throws ChapeauxException
	{ 
		try {
		Chapeaux nouvBranche = (Chapeaux) o; 
		this.branche1 = nouvBranche;
		}
		catch (ClassCastException e)
		{
			throw new ChapeauxException("L'objet passé en paramètre n'est pas de type Chapeaux.");
		}
	}
	
	public void setBranche2(Object o) throws ChapeauxException 
	{
		try {
		Chapeaux nouvBranche = (Chapeaux) o; 
		this.branche2 = nouvBranche;
	}
	catch (ClassCastException e)
	{
		throw new ChapeauxException("L'objet passé en paramètre n'est pas de type Chapeaux.");
	}
	}

	public void setBranche3(Object o) throws ChapeauxException 
	{
		try {
		Chapeaux nouvBranche = (Chapeaux) o; 
		this.branche3 = nouvBranche;
		}
		catch (ClassCastException e)
		{
			throw new ChapeauxException("L'objet passé en paramètre n'est pas de type Chapeaux.");
		}
		}
	
	public void setBranche4(Object o) throws ChapeauxException 
	{
		try {
		Chapeaux nouvBranche = (Chapeaux) o; 
		this.branche4 = nouvBranche;
	}
	catch (ClassCastException e)
	{
		throw new ChapeauxException("L'objet passé en paramètre n'est pas de type Chapeaux.");
	}
	}

	

	@Override
	public void deplacer(int arg0, int arg1) 
	{
		this.branche1.deplacer(arg0, arg1);
		this.branche2.deplacer(arg0, arg1);
		this.branche3.deplacer(arg0, arg1);
		this.branche4.deplacer(arg0, arg1);
	}

	@Override
	public ArrayList<Segment> dessiner() 
	{
		ArrayList<Segment> liste = new ArrayList<Segment>(8) ;
	// Ajouter les segments de la branche 1
	    liste.add(new Segment(this.branche1.getPoint1(), this.branche1.getPoint2()));
	    liste.add(new Segment(this.branche1.getPoint2(), this.branche1.getPoint3()));

	// Ajouter les segments de la branche 2
	    liste.add(new Segment(this.branche2.getPoint1(), this.branche2.getPoint2()));
	    liste.add(new Segment(this.branche2.getPoint2(), this.branche2.getPoint3()));

	// Ajouter les segments de la branche 3
	    liste.add(new Segment(this.branche3.getPoint1(), this.branche3.getPoint2()));
	    liste.add(new Segment(this.branche3.getPoint2(), this.branche3.getPoint3()));

	// Ajouter les segments de la branche 4
	    liste.add(new Segment(this.branche4.getPoint1(), this.branche4.getPoint2()));
	    liste.add(new Segment(this.branche4.getPoint2(), this.branche4.getPoint3()));
		
		return liste ;
	}
	
//toString : 
	public String toString()
	{
		return super.toString() + "\n" 
				+ "Ma Branche 1 : " + this.getBranche1().toString() + "\n"
				+ "Ma Branche 2 : " + this.getBranche2().toString() + "\n"
				+ "Ma Branche 3 : " + this.getBranche3().toString() + "\n"
				+ "Ma Branche 4 : " + this.getBranche4().toString() ;
	}


}
