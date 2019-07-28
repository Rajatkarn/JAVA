class A
{
	int x=10;
	void m1()
	{
		System.out.println("Hello A");
	}
}

class B
{
	int y=20;
	A a = new A(); // Association
	void m2()
	{
		System.out.println("Hi");
		System.out.println(y);
		System.out.println(a.x);
	}
}

class Demo{
	public static void main(String args[])
	{
		B b = new B();
		System.out.println(b.y);
		b.m2();
		System.out.println(b.a.x);
		b.a.m1();
	}
}
		