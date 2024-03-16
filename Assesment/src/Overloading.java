class Test{
	int a = 10;
	int b = 20;
	String name = "abc";
	
	void displayInfo(int a)
	{
		System.out.println(a);
	}
	void displayInfo(int a, String name){
		System.out.println(a);
		System.out.println(name);
	}
}
public class Overloading {
	public static void main(String[] args) {
		Test t = new Test();
	
		t.displayInfo(10);
		t.displayInfo(10, "ayan");
	}

}
