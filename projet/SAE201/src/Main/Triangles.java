package Main;

import java.util.ArrayList;

import ardoise.*;

public class Triangles extends Forme {
	
	
	private PointPlan point1 ;
	private PointPlan point2 ;
	private PointPlan point3 ;

	public Triangles() {
		
		super();
		this.setPoint1(new PointPlan(0,0)) ;
		this.setPoint2(new PointPlan(0,0)) ;
		this.setPoint3(new PointPlan(0,0)) ;
	}
	
	public Triangles(String nom, PointPlan p1, PointPlan p2, PointPlan p3) {
		
		super(nom) ;
		this.setPoint1(p1) ;
		this.setPoint2(p2) ;
		this.setPoint3(p3) ;
	}
	
	// Constructeur par copie : 
		public Triangles(Triangles nouvTriangles)
		{
			super(nouvTriangles.getNomForme());
			this.setPoint1(nouvTriangles.getPoint1());
			this.setPoint2(nouvTriangles.getPoint2());
			this.setPoint3(nouvTriangles.getPoint3());
			
		}
	
	//getters : 
		public PointPlan getPoint1() 
		{
			return this.point1;
		}
		
		public PointPlan getPoint2() 
		{
			return this.point2;
		}
		
		public PointPlan getPoint3() 
		{
			return this.point3;
		}
		
		//setters : 
		public void setPoint1(PointPlan nouvPoint1) 
		{
			this.point1 = nouvPoint1;
		}
		
		public void setPoint2(PointPlan nouvPoint2) 
		{
			this.point2 = nouvPoint2;
		}
		
		public void setPoint3(PointPlan nouvPoint3) 
		{
			this.point3 = nouvPoint3;
		}
		

	@Override
	public void deplacer(int arg0, int arg1) {
		
		this.point1.deplacer(arg0, arg1);
		this.point2.deplacer(arg0, arg1);
		this.point3.deplacer(arg0, arg1);

	}

	@Override
	public ArrayList<Segment> dessiner() {
		
		ArrayList<Segment> liste = new ArrayList<Segment>(3) ;
		liste.add(new Segment(this.point1,this.point2)) ;
		liste.add(new Segment(this.point2,this.point3)) ;
		liste.add(new Segment(this.point3,this.point1)) ;
		
		return liste ;
	}

	@Override
	public String typeForme() 
	{
		return "T";
	}

}
