package game21;

public class BlackJack extends Roulette { 
	
	public BlackJack(double cas_wallet,double wallet) {
		super(cas_wallet,wallet);
	}
	//for drawing card
	public int drawCard() {
		System.out.println("You chose to draw");
		int drawCard=(int)((Math.random()*11)+1);
		return drawCard;
	}
	public int CpdrawCard() {
		System.out.println("Cp chose to draw");
		int drawCard=(int)((Math.random()*11)+1);
		return drawCard;
	}
	//for Starting 
	public int StartingDeckUser() {
		int card1_user=(int)((Math.random()*11)+1);
		int card2_user=(int)((Math.random()*11)+1);
		
		int total_user=card1_user+card2_user;
		
		return total_user;
	}
	public int StartingDeckCp() {
		int card1_cp=(int)((Math.random()*11)+1);
		int card2_cp=(int)((Math.random()*11)+1);
		
		int total_cp=card1_cp+card2_cp;
		
		return total_cp;
	}

}
