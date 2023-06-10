package Test;
import Main.*;
import ardoise.Ardoise;
import ardoise.PointPlan;
public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ardoise ardoise = new Ardoise();
		
		PointPlan p16 = new PointPlan(88,23);
		PointPlan p18 = new PointPlan(98,23);
		Chapeaux oiseau1 = new Chapeaux("essaie", p16,p18, 1); 
	    ardoise.ajouterForme(oiseau1);
		ardoise.test();
	}

}
