package Test;
import Main.*;
import ardoise.*;

public class TestChapeux {


	public static void main(String[] args) 
	{
		Ardoise ardoise = new Ardoise(); 
		
		PointPlan p1 = new PointPlan(118,13);
		PointPlan p2 = new PointPlan(123,20);
		PointPlan p3 = new PointPlan(128,13);
		PointPlan p4 = new PointPlan(123,10); 
		
		Chapeaux vide = new Chapeaux(); 
		Chapeaux normal = new Chapeaux("oiseau", p1,p2,p3);
		
		Chapeaux sens = new Chapeaux("oiseau2", p1,p3,1);
		Chapeaux sens2 = new Chapeaux("oiseau3", p1,p3,0);
		
		Chapeaux invSens = new Chapeaux("tect", p2,p4,1);
		Chapeaux invSens2 = new Chapeaux("tect2", p2,p4,0);
		
		Forme copie1 = new Chapeaux(normal); 
		Forme copie2 = new Chapeaux(copie1); 
		Forme copie3 = new Chapeaux("copie3",copie1); 

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
		ardoise.ajouterForme(sens);
		ardoise.ajouterForme(sens2);
		ardoise.ajouterForme(invSens);
		ardoise.ajouterForme(invSens2); 
		ardoise.ajouterForme(copie1);
		ardoise.ajouterForme(copie2);
		ardoise.ajouterForme(copie3);
		
		ardoise.test();

	}

}
