class A {
	private int i = 40;
	int x = 10;
	static int y = 20;
	void m1()
	{
		class B
		{
			final static int h =50;
			int z = 30;
			void m2()
			{
				System.out.println(z);
				System.out.println(i);
				System.out.println(x);
				System.out.println(y);
			}
		}
		System.out.println(B.h);
		B b = new B();
		b.m2();
		System.out.println(b.z);
	}
}

class Demo {
	public static void main(String Args[])
	{
		//System.out.println(A.B.h);
		//B b = new B();
		//System.out.println(x);
		//System.out.println(y);
		System.out.println(A.y);
		A a = new A();
		//A.B b = a.new B();
		//A.B b = new A.B();
		a.m1();
	}
}