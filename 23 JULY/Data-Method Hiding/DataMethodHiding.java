class SuperClass{
	int x=8;
	public static void testClass(){
		System.out.println("The Static Method in SuperClass");
	}
	public void testInstance(){
		System.out.println("The Instance Method in SuperClass");
	}
}

class SubClass extends SuperClass{
	int x=5;
	public static void testClass(){
		System.out.println("The Static Method in SubClass");
	}
	public void testInstance(){
		System.out.println("The Instance Method in SubClass");
	}
}

class Hiding{
	public static void main (String ar[]){
		SuperClass a = new SubClass();
	    a.testClass();
	    a.testInstance();
	    System.out.println(a.x);
	    SubClass b = new SubClass();
	    b.testClass();
	    b.testInstance();
	    System.out.println(b.x);
	}
}

	