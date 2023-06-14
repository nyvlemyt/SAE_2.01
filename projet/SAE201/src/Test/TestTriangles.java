package Test;

import Main.*;
import ardoise.*;

public class TestTriangles {

	public static void main(String[] args) {
Ardoise ardoise = new Ardoise(); 
		
		PointPlan p1 = new PointPlan(3,14);
		PointPlan p2 = new PointPlan(112,14);
		PointPlan p3 = new PointPlan(43,3);
		
		Triangles vide = new Triangles(); 
		Triangles normal = new Triangles("montagne1", p1,p2,p3);
		
	
		
		Forme copie1 = new Triangles(normal); 
		Forme copie2 = new Triangles(copie1); 
		Forme copie3 = new Triangles("copie3",copie1); 

		System.out.println(copie2); 
		copie2.setNomForme("copie2");
		System.out.println(copie2);
		
		PointPlan p10 = new PointPlan(98,3);
		PointPlan p20 = new PointPlan(103,10);
		PointPlan p30 = new PointPlan(108,3);
		
		System.out.println(normal);
		normal.setPoint1(p10);
		normal.setPoint2(p20); 
		normal.setPoint3(p30);
		System.out.println(normal);
		
		
		ardoise.ajouterForme(normal); 
		ardoise.ajouterForme(copie1);
		ardoise.ajouterForme(copie2);
		ardoise.ajouterForme(copie3);
		
		normal.deplacer(15, 20);
		
		ardoise.test();

	}

}
