package Main;

import java.util.ArrayList;

import ardoise.*;

public class Chapeaux extends Forme {

	private PointPlan point1 ;
	private PointPlan point2 ;
	private PointPlan point3 ;

//Constructeur par défaut : 
	public Chapeaux() 
	{	
		super();
		this.setPoint1(new PointPlan(0,0)) ;
		this.setPoint2(new PointPlan(0,0)) ;
		this.setPoint3(new PointPlan(0,0)) ;
	}
	
//Constructeur normal : 
	public Chapeaux(String nom, PointPlan p1, PointPlan p2, PointPlan p3) 
	{	
		super(nom) ;
		this.setPoint1(p1) ;
		this.setPoint2(p2) ;
		this.setPoint3(p3) ;
	}
	
/* Ce constructeur creer un Chapeaux 
  
 	* @p1 et @p3 doivent avoir la même valeur en y ou la même valeur de x pour PointPlan(x,y)
 	* 
 	* le permier test verifie si p1 et p3 sont alignés verticalement ou horizontalement
 	* 
 	* si @sens == 1; le chapeau aura le point central au dessus des deux autres (y<) ou à gauche (x<)
 	* sinon, il sera en dessous ou à droite
 
 	* Ce constructeur est utile pour la classe Maison et si on veut creer une étoile à partir de 4 points
 */
	public Chapeaux(String nom, PointPlan p1, PointPlan p3, int sens)
	{
		super(nom) ;
		this.setPoint1(p1) ;
		this.setPoint3(p3) ;
		
		if ( p1.getOrdonnee() == p3.getOrdonnee() )
		{
			int x_milieu = (p1.getAbscisse() + p3.getAbscisse()) / 2;
			if (sens == 1) 
				this.setPoint2(new PointPlan(x_milieu, p3.getOrdonnee()/2)); 
			else 
				this.setPoint2(new PointPlan(x_milieu, p3.getOrdonnee() + p3.getOrdonnee()/2)); 		
		}
		if (p1.getAbscisse() == p3.getAbscisse() )
		{
			int y_milieu = (p1.getOrdonnee() + p3.getOrdonnee()) / 2; 
			if (sens == 1)
				this.setPoint2(new PointPlan(p3.getAbscisse()/2, y_milieu)); 
			else
				this.setPoint2(new PointPlan(p3.getAbscisse() + p3.getAbscisse()/2, y_milieu));
		}
	}

//Constructeurs par copie : 
	public Chapeaux(Chapeaux nouvChapeaux)
	{
		super(nouvChapeaux.getNomForme());
		this.setPoint1(nouvChapeaux.getPoint1());
		this.setPoint2(nouvChapeaux.getPoint2());
		this.setPoint3(nouvChapeaux.getPoint3());
	}
	
	public Chapeaux(Object o)
	{
		super();
		Chapeaux copie = (Chapeaux) o; 
		this.setPoint1(copie.getPoint1());
		this.setPoint2(copie.getPoint2());
		this.setPoint3(copie.getPoint3());
	}
	

//Constructeur par copie avec nouveaux nom :
	public Chapeaux(String nom, Object o)
	{
		super(nom);
		Chapeaux copie = (Chapeaux) o; 
		this.setPoint1(copie.getPoint1());
		this.setPoint2(copie.getPoint2());
		this.setPoint3(copie.getPoint3());
	}

//getters : 
	public PointPlan  getPoint1() { return this.point1; }
	
	public PointPlan getPoint2 () { return this.point2; }
	
	public PointPlan getPoint3 () {return this.point3;}
	
//setters : 
	public void setPoint1(PointPlan p1) {this.point1 = p1;}
	
	public void setPoint2(PointPlan p2) {this.point2 = p2;}
	
	public void setPoint3(PointPlan p3) {this.point3 = p3; }
	
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
		ArrayList<Segment> liste = new ArrayList<Segment>(2) ;
		liste.add(new Segment(this.point1,this.point2)) ;
		liste.add(new Segment(this.point2,this.point3)) ;
		return liste ;
	}

	@Override
	public String typeForme() 
	{
		return "C";
	}
	
//toString : 
	public String toString()
	{
		return super.toString() +"/n" 
				+ "Point 1 : " + this.getPoint1() + "/n" 
				+ "Point 2 : " + this.getPoint2() + "/n" 
				+ "Point 3 : " + this.getPoint3() + "/n"  ;
	}
}
