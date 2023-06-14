package Test;

import Exception.TrianglesException;
import Main.*;
import ardoise.*;

public class TestTriangles {

	public static void main(String[] args) {
Ardoise ardoise = new Ardoise(); 
		
		PointPlan p1 = new PointPlan(3,14);
		PointPlan p2 = new PointPlan(112,14);
		PointPlan p3 = new PointPlan(43,3);
		
		Forme vide = new Triangles(); 
		Forme normal = new Triangles("montagne1", p1,p2,p3);
		Forme copie1 = null;
		try {
			copie1 = new Triangles(normal);
		} catch (TrianglesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		try {
			Forme copie3 = new Triangles("copie3",copie1);
		} catch (TrianglesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		System.out.println(normal);


		ardoise.ajouterForme(normal); 

		
		ardoise.dessinerGraphique();
		attendreSecondes(3000);
		normal.deplacer(10, 10);
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
