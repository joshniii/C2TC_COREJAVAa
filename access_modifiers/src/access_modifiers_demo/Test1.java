package access_modifiers_demo;

public class Test1 {
	public int i=10;
	public void show() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.show();
		System.out.println(t1.i);

	}

}
