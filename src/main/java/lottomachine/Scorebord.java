package lottomachine;

import java.util.ArrayList;

public class Scorebord {
	private ArrayList<Lottobal> glazen = new ArrayList<Lottobal>();
	private Lottobal reservebal;
	
	public Scorebord(){
		
	}
	
	public void plaatsBal(Lottobal bal){
		glazen.add(bal);
	}
	
	public void maakLeeg(){
		glazen.clear();
		reservebal = null;
		// glazen.removeAll(glazen) kan je ook gebruiken
	}
	
	public void plaatsBonusBal(Lottobal bal){
		reservebal = bal;
	}
	
//	public void sorteerBallenVerbeterd(){
//		for (int i = glazen.size(); i > 0; i--) {
//			for (int j = 0; j < i-1; j++) { 
//	            if (glazen.get(j).isNummerGroterDan(glazen.get(j+1))) {
//	            	Lottobal bal = glazen.get(j);
//	            	glazen.set(j, glazen.get(j + 1));
//	            	glazen.set(j + 1, bal);
//	            }
//	        }
//		}
//	}
	
	public void sorteerBallen(){
		for (int i = glazen.size(); i > 0; i--) {
			for (int j = 0; j < i-1; j++) { 
	            if (glazen.get(j).getNummer() > glazen.get(j+1).getNummer()) {
	            	Lottobal bal = glazen.get(j);
	            	glazen.set(j, glazen.get(j + 1));
	            	glazen.set(j + 1, bal);
	            }
	        }
		}
	}
	
	public void printScorebord(){
		System.out.println("Getallen: " + glazen);
		System.out.println("Bonusgetal: " + reservebal);
	}
}
