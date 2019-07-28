class A {
	 int x = 10;
	 private int i = 40;
	 static int y = 20;
	 void m1()
	 {
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(i);
		 // System.out.println(z); // This is not Accepted Directly we First have to make the object of B
		 B b = new B();
		 System.out.println(b.z);
	 }

class B {
	final static int h = 50; // Final Static members are allowed in Non Static Nested Class 
	// static int r = 50; Static Members are not allowed in Non Static Nested Class
	int z = 30;
	void m2()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(i);
		System.out.println(z);
	}
}
}

class Demo {
	public static void main(String ar[])
	{
		// B b = new B(); // We cannot create instance of nested Class Directly 
		System.out.println(A.B.h);
		//System.out.println(x); // Another Class Variable can't be used directly
		//System.out.println(y); // Another Class Variable can't be used directly
		System.out.println(A.y);
		A a = new A();
		System.out.println(a.x);
		a.m1();
		A.B b = a.new B();
		System.out.println(b.z);
		b.m2();
		//System.out.println(b.x); // We Can't use Class A via Class B object
	}
}