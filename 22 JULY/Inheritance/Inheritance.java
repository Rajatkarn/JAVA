class A{
	static int x=10;
	String y = "Hello";
}

class B extends A{
	static int c = x;
	static void test()
	{
		System.out.println(c);
	}
}

class Demo { 
    public static void main(String s[])
	{ 
	     B a = new B();
		 B.test();
	}
}