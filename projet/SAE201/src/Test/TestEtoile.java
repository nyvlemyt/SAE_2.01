package Test;
import Main.*;
import ardoise.*;


public class TestEtoile {

	public static void main(String[] args) 
	{
		Ardoise ardoise = new Ardoise();
		
		Etoile vide = new Etoile(); 
		
		
		//branche 1
		PointPlan p25 = new PointPlan(170,52);
		PointPlan p26 = new PointPlan(173,45);
		PointPlan p27 = new PointPlan(177,52);
		Forme branche1 = new Chapeaux("branche 1", p25, p26, p27) ;

		//branche 2
		PointPlan p28 = new PointPlan(177,52);
		PointPlan p29 = new PointPlan(184,57);
		PointPlan p30 = new PointPlan(177,60);
		Forme branche2 = new Chapeaux("branche 2", p28, p29, p30) ;

		//branche 3
		PointPlan p31 = new PointPlan(170,60);
		PointPlan p32 = new PointPlan(174,66);
		PointPlan p33 = new PointPlan(177,60);
		Forme branche3 = new Chapeaux("branche 3", p31, p32, p33) ;

		//branche 4
		PointPlan p34 = new PointPlan(170,60);
		PointPlan p35 = new PointPlan(164,57);
		PointPlan p36 = new PointPlan(170,52);
		Forme branche4 = new Chapeaux("branche 4", p34, p35, p36) ;
		
		Etoile normal = new Etoile("normal", branche1,branche2,branche3,branche4); 
		Forme copie1 = new Etoile(normal); 
		Forme copie2 = new Etoile(copie1); 
		Forme copie3 = new Etoile ("copie2", copie1); 
		
		
		PointPlan p3 = new PointPlan(8,12);
		PointPlan p4 = new PointPlan(7,10);
		Forme quad = new Quadrilateres("quad", p3, p4);
		Etoile deQuad = new Etoile(quad, "a partir de quad"); 

	}

}