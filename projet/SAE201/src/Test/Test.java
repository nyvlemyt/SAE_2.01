package Test;
import Main.*;
<<<<<<< HEAD
import ardoise.*; 
=======
import ardoise.Ardoise;
import ardoise.PointPlan;
>>>>>>> 823f834e69c4ae9988030db1139478f596f41126
public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		Ardoise ardoise = new Ardoise();
		
		
		FormesComposees fc = new Maison(); 
		System.out.println(fc.typeForme());
	
		//branche 1
		PointPlan p25 = new PointPlan(170,52);
		PointPlan p26 = new PointPlan(173,45);
		PointPlan p27 = new PointPlan(177,52);
		Chapeaux branche1 = new Chapeaux("branche 1", p25, p26, p27) ;

				//branche 2
				PointPlan p28 = new PointPlan(177,52);
				PointPlan p29 = new PointPlan(184,57);
				PointPlan p30 = new PointPlan(177,60);
				Chapeaux branche2 = new Chapeaux("branche 2", p28, p29, p30) ;

				//branche 3
				PointPlan p31 = new PointPlan(170,60);
				PointPlan p32 = new PointPlan(174,66);
				PointPlan p33 = new PointPlan(177,60);
				Chapeaux branche3 = new Chapeaux("branche 3", p31, p32, p33) ;

				//branche 4
				PointPlan p34 = new PointPlan(170,60);
				PointPlan p35 = new PointPlan(164,57);
				PointPlan p36 = new PointPlan(170,52);
				Chapeaux branche4 = new Chapeaux("branche 4", p34, p35, p36) ;
		
				FormesComposees etoile = new Etoile(null,branche1,branche2,branche3,branche4) ;
				
				
				
				ardoise.ajouterForme(etoile);
				ardoise.test() ;
=======

		Ardoise ardoise = new Ardoise();
		
		PointPlan p16 = new PointPlan(88,23);
		PointPlan p18 = new PointPlan(98,23);
		Chapeaux oiseau1 = new Chapeaux("essaie", p16,p18, 1); 
	    ardoise.ajouterForme(oiseau1);
		ardoise.test();
>>>>>>> 823f834e69c4ae9988030db1139478f596f41126
	}

}
