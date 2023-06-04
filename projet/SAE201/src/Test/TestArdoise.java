package Test;
import java.util.ArrayList;

import Main.Quadrilateres;
import Main.Triangles;
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
		
		//Montagne 1
		PointPlan p7 = new PointPlan(3,14);
		PointPlan p8 = new PointPlan(112,14);
		PointPlan p9 = new PointPlan(43,3);
		Forme montagne1 = new Triangles("montagne 1", p7, p8, p9) ;
		
		//Montagne 2
		PointPlan p10 = new PointPlan(152,7);
		PointPlan p11 = new PointPlan(166,3);
		PointPlan p12 = new PointPlan(172,7);
		Forme montagne2 = new Triangles("montagne 2", p10, p11, p12) ;
		
		ardoise.ajouterForme(tour);
		ardoise.ajouterForme(corpsMaison); 
<<<<<<< HEAD
		ardoise.ajouterForme(porteMaison); 
=======
		ardoise.ajouterForme(porteMaison);
		ardoise.ajouterForme(montagne1);
		ardoise.ajouterForme(montagne2);
>>>>>>> f9c78426bbc514c9e319e6865c104e41ed60581d

		ardoise.test();
		
	}

}
