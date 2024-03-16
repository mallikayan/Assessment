abstract class D{
	void meth1(){
		System.out.println(" non static");
	
		
	}
	
	static void meth2(){
		System.out.println("static");
	}
	
	abstract void meth3();
}

class C extends A{

	void meth3() {
		System.out.println("abstract");
		
	}

	 void meth1() {
		System.out.println("non static");
		
	}
	
}


public class Test2 {
	public static void main(String[] args) {
		C c = new C();
		c.meth3();
		D.meth2();
		c.meth1();
		
	}

}
