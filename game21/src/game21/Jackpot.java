package game21;

import java.util.Random;

public class Jackpot extends Roulette {

	public Jackpot(double cas_wallet, double wallet) {
		super(cas_wallet, wallet);
	}
	
	Roulette rl1=new Roulette(0,5000);

	public void jackpoty(double amount){
		
		if(cas_wallet>=amount) {
		char random=(char)((int)(Math.random()*10)%26+65);
		char random2=(char)((int)(Math.random()*10)%26+65);
		char random3=(char)((int)(Math.random()*10)%26+65);
		
		System.out.println(random +" " + random2 + " " + random3 + " ");
		
		    if(random==random2 && random==random3) {
			    cas_wallet=amount*1000;
			    System.out.println("You won the game!\n");
			    System.out.println("Your new balance is: "+cas_wallet);
		}
		    else {
			    cas_wallet-=amount;
			    System.out.println("You lost the game!\n");
			    System.out.println("Your new balance is: "+cas_wallet);
		}
	}
		else {
			System.out.println("You cannot play!");
			System.exit(0);
		}
	}
		
}
