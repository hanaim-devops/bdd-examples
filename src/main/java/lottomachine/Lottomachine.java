package lottomachine;

public class Lottomachine {
	
	public Lottomachine() {
		
	}
	
	public void voerTrekkingUit(){
		GlazenBol bol = new GlazenBol();
		Scorebord bord = new Scorebord();
		bord.maakLeeg();
		
		for(int i = 0; i < 6; i++){
			Lottobal bal = bol.schepBal();
			bord.plaatsBal(bal);
		}
		
		Lottobal bal = bol.schepBal();
		bord.plaatsBonusBal(bal);
		bord.sorteerBallen();
		bord.printScorebord();
	}
}
