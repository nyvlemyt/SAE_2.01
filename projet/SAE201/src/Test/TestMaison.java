package Test;

import Main.*;
import ardoise.*;

public class TestMaison {

	public static void main(String[] args) {
		
		//Corps Maison
		PointPlan p3 = new PointPlan(80,198);
		PointPlan p4 = new PointPlan(180,140);
		Forme corpsMaison = new Quadrilateres("Corps Maison", p3, p4);
				
				//Porte Maison 	
		PointPlan p5 = new PointPlan(120,198);
		PointPlan p6 = new PointPlan(140,170);
		Forme porteMaison = new Quadrilateres("Porte Maison", p5, p6);
				
				//Toit maison
		PointPlan p13 = new PointPlan(80,140);
		PointPlan p14 = new PointPlan(130,100);
		PointPlan p15 = new PointPlan(180,140);
		Forme toitMaison = new Chapeaux("Toit maison", p13, p14, p15) ;
		
		
		Ardoise ardoise = new Ardoise();
		
		Maison vide = new Maison();
		Maison house = new Maison(null, porteMaison, corpsMaison, toitMaison);
		Forme copie1 = new Maison(house); 
		Forme copie2 = new Maison(copie1); 
		Forme copie3 = new Maison(copie2); 

	}

}
