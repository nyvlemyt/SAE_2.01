package Test;

import Main.*;
import ardoise.*;

public class TestQuadrilateres {

	public static void main(String[] args) {
		
		PointPlan p1 = new PointPlan(80,198);
		PointPlan p2 = new PointPlan(180,140);
		
		
		//Test 
		
		Ardoise ardoise = new Ardoise();
				
		Forme vide = new Quadrilateres(); 
		Forme quadra = new Quadrilateres("quadra1", p1, p2);
		Forme copie1 = new Quadrilateres(quadra); 
		Forme copie2 = new Quadrilateres(copie1);
		Forme copie3 = new Quadrilateres("copie2", copie2); 
			
		//Forme quad = new Quadrilateres("quad", p3, p4);
		//Etoile deQuad = new Etoile("a partir de quad", quad); 

		System.out.println(quadra); 
				
		ardoise.ajouterForme(vide);
		ardoise.ajouterForme(quadra);
		ardoise.ajouterForme(copie1);
		ardoise.ajouterForme(copie2);
		ardoise.ajouterForme(copie3);
		//ardoise.ajouterForme(quad);
		//ardoise.ajouterForme(deQuad);
		
		quadra.deplacer(80, 140);
		ardoise.test(); 

	}

}
