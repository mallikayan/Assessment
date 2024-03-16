class A{
	void showInfo(){
		System.out.println("parent");
	}
	
}

class B extends A{
	void showInfo(){
		System.out.println("child");
	}
}
public class Overriding {
	public static void main(String[] args) {
		B b = new B();
		b.showInfo();
	}

}
