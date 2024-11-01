package game21;

public class Employee {

	private String name;
	private String email;
	private int age;
	private double wallet;
	
	public Employee(String name,String email,int age,double wallet) {
		
		this.name=name;
		this.email=email;
		this.age=age;
		this.wallet=wallet;
		
	}
	
	public Employee(double wallet) {
		this.wallet=wallet;
	}
	
	
	//Shoving the infos
	public void ShowInfos() {
		
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Age: "+age);
		System.out.println("Current balance: "+wallet);
		
	}
	
	
	
	public void deposit(double amount) {
		if(amount>5000) {
			System.out.println("You cannot deposit money over 5000!");
		}
		else{wallet+=amount;
		System.out.println("Your new balance is: "+wallet);
		}
	}
	
	//for deposit the money
	public void quick_deposit(int x) {
		switch(x) {
		case 1:
			wallet+=50;
			System.out.println("New balance is: "+wallet);
			break;
		case 2:
			wallet+=100;
			System.out.println("New balance is: "+wallet);
			break;
		case 3:
			wallet+=250;
			System.out.println("New balance is: "+wallet);
			break;
		case 4:
			wallet+=500;
			System.out.println("New balance is: "+wallet);
			break;	
		default:
			System.out.println("Invalid input");
			break;
			
		}
	}
	
	public void quick_withdraw(int x) {
		switch(x) {
		case 1:
			wallet-=50;
			System.out.println("New balance is: "+wallet);
			break;
		case 2:
			wallet-=100;
			System.out.println("New balance is: "+wallet);
			break;
		case 3:
			wallet-=250;
			System.out.println("New balance is: "+wallet);
			break;
		case 4:
			wallet-=500;
			System.out.println("New balance is: "+wallet);
			break;	
		default:
			System.out.println("Invalid input");
			break;
			
		}
	}
	
	//for withdraw the money
	public void withdraw(double amount) {
		if(wallet<amount) {
			System.out.println("You dont have enough money for withdraw!");
		}
		else if(amount>2000) {
			System.out.println("You cannot withdraw money over 2000!");
		}
		else if(wallet>=amount) {
			wallet-=amount;
			System.out.println("Your new balance is: " +wallet);
		}
	}
	
//setter and getter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
}
