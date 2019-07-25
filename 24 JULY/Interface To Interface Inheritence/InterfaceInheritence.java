interface A{
	void m1();
	void m2();
}
interface B{
	void m1();
	void m3();
}
interface C extends A,B{
	void m4();
}

class X implements A{
	public void m1(){
		System.out.println(" I am M1 Method inherited from A Interface");
	}
	public void m2(){
		System.out.println(" I am M2 Method inherited from A Interface");
	}
	public void m5(){
		System.out.println(" I am M5 Method Created in Class X");
	}
}

class Y implements B{
	public void m1(){
		System.out.println(" I am M1 Method inherited from B Interface");
	}
	public void m3(){
		System.out.println(" I am M3 Method inherited from B Interface");
	}
}

class Z implements C{
	public void m1(){
		System.out.println(" I am M1 Method inherited from C Interface");
	}
	public void m2(){
		System.out.println(" I am M2 Method inherited from C Interface");
	}
	public void m3(){
		System.out.println(" I am M3 Method inherited from C Interface");
	}
	public void m4(){
		System.out.println(" I am M3 Method inherited from C Interface");
	}
}

class Demo
{
	public static void main(String ar[])
	{
		// X a = new A();
		A a = new X();
		a.m1();
		a.m2();
		//a.m5();
		
		X x = new X();
		x.m1();
		x.m2();
		x.m5();
		
		//A a1 = new Y();
		B b = new Y();
		b.m1();
		b.m3();
		
		A a1 = new X();
		a1.m1();
		a1.m2();
		
		B b1 = new Z();
		b1.m1();
		b1.m3();
		
		C c = new Z();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
	}
}
		