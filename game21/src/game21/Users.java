package game21;

public class Users extends Employee {
	
	private String password;
	private String gender;
	//constructor of users and inherit Employee
	public Users(String gender,String name,String email,int age,String password,double wallet) {
		super(name,email,age,wallet);
		
		this.password=password;
		this.gender=gender;
	}
	
	public Users(double wallet) {
		super(wallet);
	}
	//overwrite
	public void ShowInfos() {
		System.out.println("Name: "+getName()+"\n");
		System.out.println("Email: "+getEmail()+"\n");
		System.out.println("Age: "+getAge()+"\n");
		System.out.println("Current balance: "+getWallet()+"\n");
		System.out.println("Gender: "+gender);
	}
	//Showing personal informations
	public void ShowInfos2() {
		System.out.println("Name: "+getName()+"\n");
		System.out.println("Age: "+getAge()+"\n");
		System.out.println("Email: "+getEmail()+"\n");
		System.out.println("Gender: "+gender);
	}
	//Showing balance details
	public void ShowInfos3() {
		System.out.println("Current balance: "+getWallet()+"\n");
	}
	
	
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
