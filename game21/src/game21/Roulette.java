package game21;

import java.util.random.*;

public class Roulette extends Employee {
	
	Users user=new Users(5000.0);
	
	protected double cas_wallet;
	
	
	public Roulette(double cas_wallet,double wallet) {
		super(wallet);
		this.cas_wallet=cas_wallet;
		
	}
	
	//for selling the chips
	public void casWalletToWallet(double reTransform) {
	    if(cas_wallet>reTransform) {
	       double total=0.0;
	       total+=reTransform/2;
	       double totalWallet=getWallet()+total;
	       System.out.println("Your new balance is: "+totalWallet);
	       
	    }
	    else {
	    	System.out.println("!!!!!");
	    	System.exit(0);
	    }
	}
	
	public void ShowInfos1() {
		System.out.print("Your Casino coin is: "+cas_wallet+"\n");
	}
	//for buying casino chips
	public void walletToCasWallet(double Transform) {
		if(getWallet()>Transform) {
		double SubAmount=(getWallet()-Transform);
		cas_wallet=Transform/1;
		System.out.println("Your new balance is: "+SubAmount);
		SubAmount=getWallet();
		System.out.print("Your new Casino coin balance is: "+cas_wallet);
		
		}
		else {
			System.out.println("Cannot transform cause not enough money");
			System.exit(0);
		}
	}
	//for play the color
	public void playingSectionColor(String color,double amount) {
		int cp=(int)(Math.random()*100);
		
		String winner_color;
		
		
	  if(cas_wallet>=amount) {	
		
		if(cp%2==0 && cp!=0) {
			winner_color="red";
			
			if(color.equals("red")) {
				System.out.println("You won the game!\n"+"The winner color is: "+winner_color + " Number is: "+cp);
				cas_wallet+=amount;
				System.out.println("New balance is: "+cas_wallet);
			}
			else {
				cas_wallet-=amount;
				System.out.println("You lost the game.Winner color is: "+winner_color);
				System.out.println("New balance is: "+cas_wallet);
			}
			
		}
		if(cp%2!=0) {
			winner_color="black";
			
			if(color.equals("black")) {
				System.out.println("You won the game!\n"+"The winner color is: "+winner_color+"Number is: "+cp);
				cas_wallet+=amount;
				System.out.println("New balance is: "+cas_wallet);
			}
			else {
				cas_wallet-=amount;
				System.out.println("You lost the game.Winner color is: "+winner_color);
				System.out.println("New balance is: "+cas_wallet);
			}
		}
		if(cp==0) {
			winner_color="green";
			
			if(color.equals("green")) {
				System.out.println("You won the game!\n"+"The winner color is: "+winner_color+"Number is: "+cp);
				cas_wallet+=amount;
				System.out.println("New balance is: "+cas_wallet);
			}
			else {
				cas_wallet-=amount;
				System.out.println("You lost the game.Winner color is: "+winner_color);
				System.out.println("New balance is: "+cas_wallet);
			}
		}
	  }
	  else {
		  System.out.println("You dont have enough money to play");
		  System.exit(0);
	  }
	}
	//for selecting the number
	public void playingSection(int y,double amount) {
		int cp=(int)(Math.random()*100);
		
		if(cas_wallet>=amount) {
		
		 if(y==cp) {
			System.out.println("You won the game !!!\n"+"Winner number is: "+cp);
			cas_wallet*=amount;
			System.out.println("New balance is: "+cas_wallet);
		 }
		 else {
			System.out.println("Not your lucky day !!!\n"+"The winner number is: "+cp );
			cas_wallet-=amount;
			System.out.println("New balance is: "+cas_wallet);
		 }
		}
		else {
			System.out.println("Cannot play");
			System.exit(0);
		}
	}
	//for replace the chip colors
	public void betSection(int x) {
		switch(x) {
		case 1:
			cas_wallet-=25;
			
			System.out.println("New balance is: "+cas_wallet);
			break;
		case 2:
			cas_wallet-=50;
			System.out.println("New balance is: "+cas_wallet);
			break;
		case 3:
			cas_wallet-=100;
			System.out.println("New balance is: "+cas_wallet);
			break;
		case 4:
			cas_wallet-=250;
			System.out.println("New balance is: "+cas_wallet);
			break;
		default:
			System.out.println("Invalid input!");
			break;
		}
	}

	public double getCas_wallet() {
		return cas_wallet;
	}

	public void setCas_wallet(double cas_wallet) {
		this.cas_wallet = cas_wallet;
	}

}
