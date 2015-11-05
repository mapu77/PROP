package capaDomini;

import java.util.*;

public class TaulerKenKen extends Tauler {

	private Vector<RegioKenKen> VR;
	
	public TaulerKenKen(int m, int n) {
		super(m, n);
	}
	
	public int nRegio(Cella c) {
		for (int i=0; i<VR.size(); ++i) {
			for (int j=0; j<VR.get(i).getNumCeldas(); ++j) {
				Cella aux = VR.get(i).getCella(j);
				if (aux.getX() == c.getX() && aux.getY() == c.getY()) return VR.get(i).getId();	
			}
		}
		return 0;
	}
	
	public void afegeixRegio (RegioKenKen r) {
		VR.add(r);
	}
	
	public int getNCols() {
		return alto;
	}
	
	public int getNFiles() {
		return ancho;
	}

}