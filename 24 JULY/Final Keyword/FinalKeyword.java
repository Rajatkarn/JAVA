final  class A {}  // This Class Can't be Inherited
class B{
	final int x =10;
	final void show()
	{
		System.out.println(" This Method Can't be Override");
	}
	public void test()
	{
		System.out.println(" This Method Can be Override");
	}
}

class C extends B{

	/*void show(){
			System.out.println(" ----------TESTING----------");
	}*/ // Compile Time Error
	void Test()
	{
		System.out.println(" Test Successfull ");
	}
}
class Demo{
	public static void main(String ar[])
	{
		C c = new C();
		c.show();
		c.test();
		System.out.println(c.x);
	}
}

		

