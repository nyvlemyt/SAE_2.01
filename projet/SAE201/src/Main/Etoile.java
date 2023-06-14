package Main;

import java.util.ArrayList;

import ardoise.*;

public class Etoile extends FormesComposees{

	private Chapeaux branche1 ;
	private Chapeaux branche2 ;
	private Chapeaux branche3 ;
	private Chapeaux branche4 ;
	
//Constructeur par défaut : 
	public Etoile() 
	{
			super();
			this.setBranche1(new Chapeaux()) ;
			this.setBranche2( new Chapeaux()) ;
			this.setBranche3( new Chapeaux()) ;
			this.setBranche4(new Chapeaux()) ;
	}
//Constructeur normal : 	
	public Etoile(String nom, Chapeaux b1, Chapeaux b2, Chapeaux b3, Chapeaux b4)
	{
			super(nom) ;
			this.setBranche1(b1) ;
			this.setBranche2(b2) ;
			this.setBranche3(b3) ;
			this.setBranche4(b4) ;
	}


//Construteurs par copie : 
	public Etoile(Etoile e)
	{
		super(e.getNomForme()); 
		this.setBranche1(new Chapeaux(e.getBranche1()));
		this.setBranche2(new Chapeaux(e.getBranche2()));
		this.setBranche3(new Chapeaux(e.getBranche3()));
		this.setBranche4(new Chapeaux(e.getBranche4()));
	}
	
	public Etoile(Object o)
	{
		super();
		Etoile e = (Etoile) o ;
		this.setBranche1(new Chapeaux(e.getBranche1()));
		this.setBranche2(new Chapeaux(e.getBranche2()));
		this.setBranche3(new Chapeaux(e.getBranche3()));
		this.setBranche4(new Chapeaux(e.getBranche4()));
	}

//Construteur par copie avec nouveau nom : 
	public Etoile(String nom, Object o)
	{
		super(nom); 
		Etoile e = (Etoile) o; 
		this.setBranche1(new Chapeaux(e.getBranche1()));
		this.setBranche2(new Chapeaux(e.getBranche2()));
		this.setBranche3(new Chapeaux(e.getBranche3()));
		this.setBranche4(new Chapeaux(e.getBranche4()));
	}

//Constructeur avec un Quadrilatere : 
	public Etoile(Object o, String nom)
	{
		super(nom);
		Quadrilateres q = (Quadrilateres) o; 
		this.setBranche1(new Chapeaux("banche 1",q.getBasGauche(),q.getBasDroit(),1));
		this.setBranche2(new Chapeaux("banche 2",q.getBasGauche(),q.getHautGauche(),0));
		this.setBranche3(new Chapeaux("banche 1",q.getHautGauche(),q.getHautDroit(),0));
		this.setBranche4(new Chapeaux("banche 1",q.getBasDroit(),q.getHautDroit(),1));
	}
	
//getters : 
	public Chapeaux getBranche1() {return branche1;}

	public Chapeaux getBranche2() {return branche2;}

	public Chapeaux getBranche3() {return branche3;}
	
	public Chapeaux getBranche4() {return branche4;}
	
//setters : 
	public void setBranche1(Chapeaux nouvBranche1) {this.branche1 = nouvBranche1;}
	
	public void setBranche2(Chapeaux nouvBranche2) {this.branche2 = nouvBranche2;}

	public void setBranche3(Chapeaux nouvBranche3) {this.branche3 = nouvBranche3;}

	public void setBranche4(Chapeaux nouvBranche4) {this.branche4 = nouvBranche4;}

	

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
		return super.toString() + "/n" 
				+ "Ma Branche 1 : " + this.getBranche1().toString() + "/n"
				+ "Ma Branche 2 : " + this.getBranche2().toString() + "/n"
				+ "Ma Branche 3 : " + this.getBranche3().toString() + "/n"
				+ "Ma Branche 4 : " + this.getBranche4().toString() ;
	}


}
