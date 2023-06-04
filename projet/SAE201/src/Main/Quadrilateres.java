package Main;

import java.util.ArrayList;

import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

public class Quadrilateres extends Forme {
	
	private PointPlan hautGauche;
	private PointPlan basGauche; 
	private PointPlan hautDroit ; 
	private PointPlan basDroit; 

	public Quadrilateres() 
	{
		super();
		this.hautGauche = new PointPlan(0,0);
		this.basGauche = new PointPlan(0,0);
		this.hautDroit = new PointPlan(0,0);
		this.basDroit = new PointPlan(0,0) ;
	}

	public Quadrilateres(String nom, PointPlan p, PointPlan p0) 
	{
		super(nom);
		this.hautGauche = p;
		this.basGauche = new PointPlan(p.getAbscisse(),p0.getOrdonnee());
		this.hautDroit = new PointPlan(p0.getAbscisse(),p.getOrdonnee()); 
		this.basDroit = p0;
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
	public String typeForme() {
		return "Q";
	}

}
