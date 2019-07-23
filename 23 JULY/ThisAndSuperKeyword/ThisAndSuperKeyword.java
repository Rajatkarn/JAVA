class A{
	int x=10;
}
class B extends A{
	int y = 20;
	int x = 40;
	void m1()
	{
		int z=30;
		int x=50;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(y);
		System.out.println(z);
	}
	void m2()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

class Demo{
	public static void main(String s[])
	{
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
		// System.out.println(b.super.x);
		System.out.println(b.y);
	}
}
