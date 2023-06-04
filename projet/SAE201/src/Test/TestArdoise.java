package Test;
import java.util.ArrayList;

import Main.Chapeaux;
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
		Forme tour = new Quadrilateres("Tour",p1,p2);

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
		Forme montagne1 = new Triangles("Montagne 1", p7, p8, p9) ;
		
		//Montagne 2
		PointPlan p10 = new PointPlan(152,7);
		PointPlan p11 = new PointPlan(166,3);
		PointPlan p12 = new PointPlan(172,7);
		Forme montagne2 = new Triangles("Montagne 2", p10, p11, p12) ;
		
		//Toit maison
		PointPlan p13 = new PointPlan(80,140);
		PointPlan p14 = new PointPlan(130,100);
		PointPlan p15 = new PointPlan(180,140);
		Forme toitMaison = new Chapeaux("Toit maison", p13, p14, p15) ;
		
		//Oiseau 1
		PointPlan p16 = new PointPlan(118,13);
		PointPlan p17 = new PointPlan(123,20);
		PointPlan p18 = new PointPlan(128,13);
		Forme oiseau1 = new Chapeaux("Oiseau1", p16, p17, p18) ;

		//Oiseau 2
		PointPlan p19 = new PointPlan(133,30);
		PointPlan p20 = new PointPlan(136,32);
		PointPlan p21 = new PointPlan(138,30);
		Forme oiseau2 = new Chapeaux("oiseau2", p19, p20, p21) ;

		//Oiseau 3
		PointPlan p22 = new PointPlan(142,14);
		PointPlan p23 = new PointPlan(144,17);
		PointPlan p24 = new PointPlan(146,14);
		Forme oiseau3 = new Chapeaux("oiseau3", p22, p23, p24) ;

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
	
		
		
		ardoise.ajouterForme(tour);
<<<<<<< HEAD
		ardoise.ajouterForme(corpsMaison); 
		ardoise.ajouterForme(porteMaison);
		ardoise.ajouterForme(montagne1);
		ardoise.ajouterForme(montagne2);


=======
		ardoise.ajouterForme(corpsMaison);
		ardoise.ajouterForme(porteMaison); 
		ardoise.ajouterForme(porteMaison);
		ardoise.ajouterForme(montagne1);
		ardoise.ajouterForme(montagne2);
		ardoise.ajouterForme(toitMaison);
		ardoise.ajouterForme(oiseau1);
		ardoise.ajouterForme(oiseau2);
		ardoise.ajouterForme(oiseau3);
		ardoise.ajouterForme(branche1);
		ardoise.ajouterForme(branche2);
		ardoise.ajouterForme(branche3);
		ardoise.ajouterForme(branche4);
		
>>>>>>> 740f107a6bbf855e861f12f857c16204fcbf4b2d
		ardoise.test();
		
	}

}
