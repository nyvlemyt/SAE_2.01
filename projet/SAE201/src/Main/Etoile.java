package Main;

import java.util.ArrayList;

import ardoise.*;

public class Etoile extends FormesComposees{

	private Chapeaux branche1 ;
	private Chapeaux branche2 ;
	private Chapeaux branche3 ;
	private Chapeaux branche4 ;
	
	public Etoile() {
			
			super();
			this.branche1 = new Chapeaux() ;
			this.branche2 = new Chapeaux() ;
			this.branche3 = new Chapeaux() ;
			this.branche4 = new Chapeaux() ;
	}
	
	public Etoile(String nom, Chapeaux b1, Chapeaux b2, Chapeaux b3, Chapeaux b4) {
			
			super(nom) ;
			this.branche1 = b1 ;
			this.branche2 = b2 ;
			this.branche3 = b3 ;
			this.branche4 = b4 ;
		}


	
	
	
	@Override
	public void deplacer(int arg0, int arg1) {
		
		this.branche1.deplacer(arg0, arg1);
		this.branche2.deplacer(arg0, arg1);
		this.branche3.deplacer(arg0, arg1);
		this.branche4.deplacer(arg0, arg1);
	}

	@Override
	public ArrayList<Segment> dessiner() {
		ArrayList<Segment> liste = new ArrayList<Segment>(4) ;
		// Ajouter les segments de la branche 1
	    liste.add(new Segment(this.branche1.getPoint1(), this.branche1.getPoint2()));
	    liste.add(new Segment(this.branche1.getPoint2(), this.branche1.getPoint3()));

	    // Ajouter les segments de la branche 2
	    liste.add(new Segment(this.branche2.getPoint1(), this.branche2.getPoint2()));
	    liste.add(new Segment(this.branche2.getPoint2(), this.branche2.getPoint3()));

	    // Ajouter les segments de la branche 3
	    liste.add(new Segment(this.branche3.getPoint1(), this.branche3.getPoint2()));
	    liste.add(new Segment(this.branche3.getPoint2(), this.branche3.getPoint3()));

	    // Ajouter les segments de la branche 4
	    liste.add(new Segment(this.branche4.getPoint1(), this.branche4.getPoint2()));
	    liste.add(new Segment(this.branche4.getPoint2(), this.branche4.getPoint3()));
		
		return liste ;
	}

	public Chapeaux getBranche1() {
		return branche1;
	}

	public void setBranche1(Chapeaux nouvBranche1) {
		this.branche1 = nouvBranche1;
	}

	public Chapeaux getBranche2() {
		return branche2;
	}

	public void setBranche2(Chapeaux nouvBranche2) {
		this.branche2 = nouvBranche2;
	}

	public Chapeaux getBranche3() {
		return branche3;
	}

	public void setBranche3(Chapeaux nouvBranche3) {
		this.branche3 = nouvBranche3;
	}

	public Chapeaux getBranche4() {
		return branche4;
	}

	public void setBranche4(Chapeaux nouvBranche4) {
		this.branche4 = nouvBranche4;
	}

}
