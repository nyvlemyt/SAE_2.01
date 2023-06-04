package Test;
import java.util.ArrayList;

import Main.Quadrilateres;
import ardoise.*; 

public class TestArdoise {

	public static void main(String[] args) 
	{
		
		Ardoise ardoise = new Ardoise();

		//Tour
		PointPlan p1 = new PointPlan(9,198);
		PointPlan p2 = new PointPlan(20,100);
		Forme tour = new Quadrilateres("tour",p1,p2);

		//Corps Maison
		PointPlan p3 = new PointPlan(80,198);
		PointPlan p4 = new PointPlan(180,140);
		Forme corpsMaison = new Quadrilateres("Corps Maison", p3, p4);
		
		//Porte Maison 
		PointPlan p5 = new PointPlan(120,198);
		PointPlan p6 = new PointPlan(140,170);
		Forme porteMaison = new Quadrilateres("Porte Maison", p5, p6);
		
		ardoise.ajouterForme(tour);
		ardoise.ajouterForme(corpsMaison); 
		ardoise.ajouterForme(porteMaison); 

		ardoise.test();
		
	}

}
