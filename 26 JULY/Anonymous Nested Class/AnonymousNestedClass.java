class A
{
	void m1()
	{
		System.out.println("Hello Rajat");
	}
}

class Demo
{
	public static void main(String args[])
	{
		A a = new A(){
			void m1()
			{
				System.out.println("Hi Rajat");
			}
		};
		a.m1();
	}
}