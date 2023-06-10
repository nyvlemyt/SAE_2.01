package Main;

import java.util.ArrayList;

import ardoise.*;

public class Chapeaux extends Forme {

	private PointPlan point1 ;
	private PointPlan point2 ;
	private PointPlan point3 ;

	public Chapeaux() {
		
		super();
		this.point1 = new PointPlan(0,0) ;
		this.point2 = new PointPlan(0,0) ;
		this.point3 = new PointPlan(0,0) ;
	}
	
	public Chapeaux(String nom, PointPlan p1, PointPlan p2, PointPlan p3) {
		
		super(nom) ;
		this.point1 = p1 ;
		this.point2 = p2 ;
		this.point3 = p3 ;
	}

	@Override
	public void deplacer(int arg0, int arg1) {
		
		this.point1.deplacer(arg0, arg1);
		this.point2.deplacer(arg0, arg1);
		this.point3.deplacer(arg0, arg1);

	}

	@Override
	public ArrayList<Segment> dessiner() {
		
		ArrayList<Segment> liste = new ArrayList<Segment>(2) ;
		liste.add(new Segment(this.point1,this.point2)) ;
		liste.add(new Segment(this.point2,this.point3)) ;
		
		return liste ;
	}

	@Override
	public String typeForme() {
		return "C";
	}

}
