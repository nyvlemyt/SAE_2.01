package Test;

import Main.*;
import ardoise.*;

public class TestQuadrilateres {

	public static void main(String[] args) {
		
		PointPlan p1 = new PointPlan(80,140);
		PointPlan p2 = new PointPlan(180,198);
		
		//Test 
		
		Ardoise ardoise = new Ardoise();
				
		Forme vide = new Quadrilateres(); 
		Forme quadra = new Quadrilateres("quadra1", p1, p2);
		Forme copie1 = new Quadrilateres(quadra); 
		Forme copie2 = new Quadrilateres("copie2", copie1); 

		System.out.println(quadra); 
				
		ardoise.ajouterForme(quadra);
		ardoise.ajouterForme(copie1);
		ardoise.ajouterForme(copie2);
		
		ardoise.dessinerGraphique();
		attendreSecondes(3000);
		quadra.deplacer(-10, -10);
		ardoise.dessinerGraphique();

	}

	public static void attendreSecondes(int x) 
	{
        try 
        {
            Thread.sleep(x); // Attendre 1 seconde (1000 millisecondes)
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
	}
}
