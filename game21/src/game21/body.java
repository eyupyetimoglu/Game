package game21;

import java.util.Scanner;

public class body {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		Users users=new Users("Woman","Ömer","darcankun@gmail.com",18,"tahaa123",50000);
		
		Roulette roulette=new Roulette(0,50000);
		
		BlackJack blackjack=new BlackJack(0,50000);
		
		Jackpot jp=new Jackpot(0,50000);
		
		double subAmount=users.getWallet();
		
		while(true) {
			if(users.getAge()<18) {
				System.out.println("You cannot enter!");
				System.exit(0);
			}
			else {
				while(true) {
				System.out.println("----------------------------");
				System.out.println("!*! WELCOME TO THE CASINO !*!");
				System.out.println("----------------------------");
				
				
				
				
				System.out.println("For see your infos press 1\nFor see your balance press 2\nFor see our games press 3");
				System.out.println("");
				System.out.println("If you want to exit press C");
				String press=in.nextLine();
				
				if(press.equals("1")) {
					users.ShowInfos2();
					System.out.println("For return press R");
					System.out.println("For close the system press C");
					String cont=in.nextLine();
					if(cont.equalsIgnoreCase("C")) {
						System.out.print("......Shutting down the System.....");
						System.exit(0);
					}
					else if(cont.equalsIgnoreCase("R")) {
						continue;
					}
				}
				
				 if(press.equals("2")) {
					users.ShowInfos3();
					
					System.out.print("For withdraw money press 1\n");
					System.out.print("For deposit money manuel press 2\n");
					System.out.print("For quick deposit money press 3\n");
					System.out.print("For quick withdraw money press 4\n");
					System.out.print("For return press 5");
					
					String x=in.nextLine();
					
					switch(x) {
					case "1":
						System.out.println("Enter your amount!");
						double amount=in.nextDouble();
						
						users.withdraw(amount);
						
						break;
					
					case "2":
						System.out.println("Enter your amount!");
						double deposit_amount=in.nextDouble();
						
						users.deposit(deposit_amount);
						
						
						break;
					
					case "3":
						System.out.println("1=50,2=100,3=250,4=500");
						int action=in.nextInt();
						
						if(action==1) {
							users.quick_deposit(1);
							
							break;
						}
						else if(action==2) {
							users.quick_deposit(2);
							
							break;
						}
						else if(action==3) {
							users.quick_deposit(3);
							
							break;
						}else if(action==4) {
							users.quick_deposit(4);
							
							break;
						}
						else {
							System.out.println("Invalid input");
							System.exit(0);
						}
						break;
					case "4":
						System.out.println("1=50,2=100,3=250,4=500");
						int z=in.nextInt();
						switch(z) {
						case 1:
							users.quick_withdraw(1);
							
							break;
						case 2:
							users.quick_withdraw(2);
							
							break;
						case 3:
							users.quick_withdraw(3);
							
							break;
						case 4:
							users.quick_withdraw(4);
							
							break;	
						default:
							System.out.println("Invalid input");
							System.exit(0);
							
						}
						
					case "5":
						continue;
					default:
						System.out.println("Invalid input");
						System.exit(0);
						break;
					}
					
					
					
				}
			     
			     if(press.equals("3")) {
			    	 System.out.println("For play the Roulette press 1\n");
			    	 System.out.println("For play the BlackJack press 2\n");
			    	 System.out.println("For play the Jackpot press 3");
			    	 
			    	 String pres=in.nextLine();
			    	 
			    	 if(pres.equals("3")) {
			    		 while(true) {
			    		 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
			    		 System.out.println("Welcome to the SlotMachine!");
			    		 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
			    		 System.out.println("For play the game press P");
			    		 System.out.println("For show the casino balance press F");
			    		 System.out.println("For buy a chip press S");
			    		 System.out.println("For transform the chips to money press T\n");
			    		 
			    		 String jack=in.nextLine();
			    		 
			    		 if(jack.equalsIgnoreCase("S")) {
			    			 System.out.println("WELCOME TO THE SHOP\n");
			    			 System.out.println("Enter your amount");
			    			 double amonte=in.nextDouble();
			    			 
			    			 jp.walletToCasWallet(amonte);
			    			 continue;
			    		 }
			    		 else if(jack.equalsIgnoreCase("T")) {
			    			 System.out.println("Enter your amount");
			    			 double amonte2=in.nextDouble();
			    			 
			    			 jp.casWalletToWallet(amonte2);
			    			 continue;
			    			 
			    		 }
			    		 else if(jack.equalsIgnoreCase("F")) {
			    			 jp.ShowInfos1();
			    			 continue;
			    		 }
			    		 
			    		 else if(jack.equalsIgnoreCase("P")) {
			    			 while(true) {
			    			  System.out.println("Press 1 to spin the slot\n");
			    			  System.out.println("Press 2 to exit the system");
			    		     int exit=in.nextInt();
			    		     switch(exit) {
			    		     case 2:
			    		    	 System.out.println("....Shutting down the system....");
						    	 System.exit(0); 
			    		     
			    		     case 1:
			    			 System.out.println("Enter your bid amount");
			    			 double bid=in.nextDouble();
			    			 
			    			 jp.jackpoty(bid);
			    			 break;
			    			 default:
			    				 System.out.println("....Invalid input!....");
						    	 System.exit(0); 
			    		     }
			    			 }
			    		 }
			    		 
			    		 
			    		 } 
			    	 }
			    	 
			    	 if(pres.equals("1")) {
			    		 while(true) {
			    		 System.out.println("*************************************\n");
			    		 System.out.println("Welcome to the Roulette center!");
			    		 System.out.println("*************************************\n");
			    		 System.out.println("For show the casino balance press F");
			    		 System.out.println("For buy a chip press S");
			    		 System.out.println("For transform the chips to money press T");
			    		 System.out.println("For play the game press P");
			    		
			    		 String acttion=in.nextLine();
			    		 
			    		 
			    		 if(acttion.equalsIgnoreCase("S")) {
			    			 System.out.println("WELCOME TO THE SHOP\n");
			    			 System.out.println("Enter your amount");
			    			 
			    			 
			    			 double amonte=in.nextDouble();
			    			 
			    			 roulette.walletToCasWallet(amonte);
			    			 continue;
			    			 
			    		 }
			    		 
			    		
			    		 else if(acttion.equalsIgnoreCase("T")) {
			    			 System.out.println("Enter your amount");
			    			 double amonte2=in.nextDouble();
			    			 
			    			 roulette.casWalletToWallet(amonte2);
			    			 continue;
			    			 
			    		 }
			    		 
			    		 else if(acttion.equalsIgnoreCase("P")) {
			    			 while(true) {
			    			 System.out.println("For Select color press 1.\nFor playing the number press 2\nFor quitting the system press 3");
			    			 int s=in.nextInt();
			    			 
			    			 switch(s) {
			    			 case 1:
			    				 
			    				 System.out.println("Enter your color!");
			    				 in.nextLine();
			    				 String color=in.nextLine();
			    				 
			    				 System.out.println("Enter your bet amouunt!\n");
			    				 double amount=in.nextDouble();
			    				 
			    				 
			    				 roulette.playingSectionColor(color, amount);
			    				 break;
			    				 
			    			 case 2:
			    				 System.out.println("Enter your number!");
				    			 int x=in.nextInt();
				    			 System.out.println("Enter your bet amouunt!\n");
				    			 double y=in.nextDouble();
				    			
				    			 roulette.playingSection(x, y);
				    			 break;
				    			 
			    			 case 3:
			    				 System.out.print(".....Shutting down the system.....");
			    				 System.exit(0);
				    		default:
				    			System.out.print("Invalid input!");
				    			System.exit(0);
			    				 
			    			 }
			    			 }
			    		 }
			    		 
			    		 else if(acttion.equalsIgnoreCase("F")) {
			    			 roulette.ShowInfos1();
			    			 continue;
			    		 }
			    		 
			    		  
			    		 }
			    		 
			    	 }
			    	  {
			    	 if(pres.equals("2")) {
			    		 System.out.println("=====================================");
			    		 System.out.println("Welcome to the BlackJack game!");
			    		 System.out.println("=====================================");
			    		 System.out.println("For show the casino balance press F");
			    		 System.out.println("For buy a chip press S");
			    		 System.out.println("For transform the chips to money press T");
			    		 System.out.println("For run the game press P");
			    		 System.out.println("For exit the system press E");
			    		 
			    		 String acttion1=in.nextLine();
			    		 while(true) {
			    		 if(acttion1.equalsIgnoreCase("S")) {
			    			 System.out.println("WELCOME TO THE SHOP\n");
			    			 System.out.println("Enter your amount");
			    			 double amonte=in.nextDouble();
			    			 
			    			 roulette.walletToCasWallet(amonte);
			    			 break;
			    		 }
			    		 else if(acttion1.equalsIgnoreCase("T")) {
			    			 System.out.println("Enter your amount");
			    			 double amonte2=in.nextDouble();
			    			 
			    			 roulette.casWalletToWallet(amonte2);
			    			 break;
			    			 
			    		 }
			    		 else if (acttion1.equalsIgnoreCase("P")) {
			    			    

			    			    String playAgain = "Y";

			    			    while (playAgain.equalsIgnoreCase("Y")) {
			    			        System.out.println("Enter your bid: ");
			    			        if (in.hasNextInt()) {
			    			            int b = in.nextInt();
			    			            

			    			            int c1 = blackjack.StartingDeckUser();
			    			            System.out.println("Your hand is: " + c1);

			    			            int c2 = blackjack.StartingDeckCp();
			    			            System.out.println("Cp's hand is: " + c2);

			    			            String drawC = in.nextLine();

			    			            do {
			    			            	if (c1 == 21) {
			    			                    System.out.println("You won the game !\nYou have Blackjack!");
			    			                    playAgain = "N";
			    			                    break;
			    			                }
			    			                if (c1 <= 21) {
			    			                    System.out.print("Another Card (Y/N): ");
			    			                    drawC = in.nextLine();

			    			                    if (drawC.equalsIgnoreCase("Y")) {
			    			                        int draw = blackjack.drawCard();
			    			                        c1 += draw;
			    			                        System.out.println("Card: " + draw);
			    			                        System.out.println("Total: " + c1);

			    			                        if (c1 > 21) {
			    			                            System.out.println("Your hand is already over 21. You lost the game.");
			    			                            playAgain = "N";
			    			                        }
			    			                    }
			    			                } else {
			    			                    
			    			                    playAgain = "N"; 
			    			                }

			    			            } while (drawC.equalsIgnoreCase("Y") && c1 <= 21);

			    			            
			    			            if (c1 <= 21) {
			    			                while (c2 < 21) {
			    			                    int drawCp = blackjack.CpdrawCard();
			    			                    c2 += drawCp;
			    			                }

			    			                System.out.println("Cp's hand is: " + c2);

			    			                if (c2 > 21 || c1 > c2) {
			    			                    System.out.println("You won the game! Cp's cards: " + c2 + "\n" + "Your cards: " + c1);
			    			                } else if (c1 == c2) {
			    			                    System.out.println("It's tie up! Cp's cards: " + c2 + "\n" + "Your cards: " + c1);
			    			                } else {
			    			                    System.out.println("You lost the game! CP Wins\n");
			    			                }
			    			            } 

			    			            
			    			            System.out.print("Do you want to play again? (Y/N): ");
			    			            playAgain = in.nextLine();

			    			            if (playAgain.equalsIgnoreCase("N")) {
			    			                System.out.println("....Shutting down the system....");
			    			                System.exit(0);
			    			            }
			    			        } else {
			    			            System.out.println("Invalid bid. Exiting...");
			    			            break;  
			    			        }
			    			    }
			    			}
			     
			     if(press.equals("C")) {
			    	 System.out.println("....Shutting down the system....");
			    	 System.exit(0); 
			     }
			     
			     
			    	 }
				}
				}
		}
			     if(press.equals("C")) {
			    	 System.out.println("....Shutting down the system....");
			    	 System.exit(0); 
			     }
			}
	}
	}
	}
}
