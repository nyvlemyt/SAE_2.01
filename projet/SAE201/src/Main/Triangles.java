package Main;

import java.util.ArrayList;

import Exception.PointPlanException;
import Exception.TrianglesException;
import ardoise.*;

public class Triangles extends Forme {
	
	
	private PointPlan point1 ;
	private PointPlan point2 ;
	private PointPlan point3 ;

//Constructeur par défaut : 
	public Triangles() throws PointPlanException 
	{
		super();
		this.setPoint1(new PointPlan(0,0)) ;
		this.setPoint2(new PointPlan(0,0)) ;
		this.setPoint3(new PointPlan(0,0)) ;
	}
	
//Constructeur normal : 
	public Triangles(String nom, PointPlan p1, PointPlan p2, PointPlan p3) throws PointPlanException 
	{	
		super(nom) ;
		this.setPoint1(p1) ;
		this.setPoint2(p2) ;
		this.setPoint3(p3) ;
	}
	
//Constructeurs par copie : 
	public Triangles(Object o) throws TrianglesException, PointPlanException 
	{
		super();
		try {
		Triangles nouvTriangles = (Triangles) o; 
		this.setNomForme(nouvTriangles.getNomForme());
		this.setPoint1(new PointPlan(nouvTriangles.getPoint1().getAbscisse(),nouvTriangles.getPoint1().getOrdonnee()));
		this.setPoint2(new PointPlan(nouvTriangles.getPoint2().getAbscisse(),nouvTriangles.getPoint2().getOrdonnee()));
		this.setPoint3(new PointPlan(nouvTriangles.getPoint3().getAbscisse(),nouvTriangles.getPoint3().getOrdonnee()));	
		}
		catch (ClassCastException e) {
			throw new TrianglesException("L'objet passé en paramètre n'est pas de type Triangles.");
	}
	}
		
//Constructeur par copie avec nouveau nom : 
	public Triangles(String nom, Object o) throws TrianglesException, PointPlanException
	{
		super(nom);
		try {
		Triangles nouvTriangles = (Triangles) o; 
		this.setPoint1(new PointPlan(nouvTriangles.getPoint1().getAbscisse(),nouvTriangles.getPoint1().getOrdonnee()));
		this.setPoint2(new PointPlan(nouvTriangles.getPoint2().getAbscisse(),nouvTriangles.getPoint2().getOrdonnee()));
		this.setPoint3(new PointPlan(nouvTriangles.getPoint3().getAbscisse(),nouvTriangles.getPoint3().getOrdonnee()));	
		}
		catch (ClassCastException e) {
			throw new TrianglesException("L'objet passé en paramètre n'est pas de type Triangles.");
		}
	}
	
//getters : 
	public PointPlan getPoint1() {return this.point1;}
		
	public PointPlan getPoint2() {return this.point2;}
		
	public PointPlan getPoint3() {return this.point3;}
		
//setters : 
	public void setPoint1(PointPlan p1) throws PointPlanException
	{
		try {
		this.point1 = p1;
		} 
		catch (ClassCastException e)
		{
		throw new PointPlanException("L'object passé en paramètre n'est pas de type PointPlan."); 
		}
	}
		
	public void setPoint2(PointPlan p2) throws PointPlanException
	{
		try {
		this.point2 = p2;
		} 
		catch (ClassCastException e)
		{
		throw new PointPlanException("L'object passé en paramètre n'est pas de type PointPlan."); 
		}
	}
		
	public void setPoint3(PointPlan p3) throws PointPlanException
	{
		try {
		this.point3 = p3;
		} 
		catch (ClassCastException e)
		{
		throw new PointPlanException("L'object passé en paramètre n'est pas de type PointPlan."); 
		}
	}
		

	@Override
	public void deplacer(int arg0, int arg1) 
	{	
		this.point1.deplacer(arg0, arg1);
		this.point2.deplacer(arg0, arg1);
		this.point3.deplacer(arg0, arg1);
	}

	@Override
	public ArrayList<Segment> dessiner() 
	{
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
	
//toString : 
	public String toString()
	{
		return super.toString() + "\n"
				+ "type : "+ this.typeForme()  +"\n" 
				+ "Point 1 : " + this.getPoint1() + "\n" 
				+ "Point 2 : " + this.getPoint2() + "\n" 
				+ "Point 3 : " + this.getPoint3() + "\n" ;
	}
}
