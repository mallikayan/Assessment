class Company{
	int id=1;
	String name="Ayan";
	static String abc="xyz";
	static String companyname="abc";
	
	void displayInfo(){
		System.out.println(id);
		System.out.println(name);
	}
	static void showInfo(){
		System.out.println("companyname");
		System.out.println("abc");
	}
}
public class Static {
	public static void main(String[] args) {
		Company c = new Company();
		c.displayInfo();
		Company.showInfo();
	}

}
