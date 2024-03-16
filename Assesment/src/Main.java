class Emp{
	String name;
	int id;
	float sal;
	String address;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	public Emp(String name, int id, float sal, String address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}
	
	
	
}
public class Main {
	public static void main(String[] args) {
		Emp e = new Emp("ayan", 10, 20000, "malad");
		Emp f = new Emp("hussain", 2, 3000, "borivali");
		System.out.println(e);
		System.out.println(f);
	}
}
