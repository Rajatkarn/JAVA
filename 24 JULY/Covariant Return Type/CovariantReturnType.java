class A{
	{
	System.out.println("Hello A");
	}
}

class B extends A{
	{
	System.out.println("Hello B");
	}
}

class D{
	public A m1(){
		System.out.println("Hello D");
		return new A();
	}
}

class E extends D {
	public B m1(){
		System.out.println("Hello E");
		return new B();
	}
}

class Covariant{
	public static void main (String ar[])
	{ 
	    D d = new E();
		A a = d.m1();
	}
}