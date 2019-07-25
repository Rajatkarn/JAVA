interface A {
	void m1();
	default void abc()
	{
		System.out.println(" Incapp ");
	}
	static void m2()
	{
		System.out.println(" Hi A ");
	}
}

class B
{
	void xyz()
	{
		System.out.println(" India ");
	}
}

class E extends B implements A {
	public void m1()
	{
		System.out.println(" Hello B ");
	}
}

class D implements A {
	public void m1()
	{
		System.out.println(" Hello D ");
	}
}

class Demo
{
	public static void main (String ar[])
	{
	A.m2();
	A a = new D();
	a.m1();
	a.abc();
	
	a= new E();
	a.m1();
	a.abc();
	
	B b= new B();
	b.xyz();
}
}

		
	