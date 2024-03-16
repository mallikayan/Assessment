interface G{
	abstract void meth5();
	
}
class H implements G{

	@Override
	public void meth5() {
		System.out.println("interface");
		
	}
	
}
public class E {
	public static void main(String[] args) {
		H h = new H();
		h.meth5();
	}

}
