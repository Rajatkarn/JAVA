class A
{
     int x;
	 String y;
	 public void show()
	 {
		 System.out.println(x+"  "+y);
	 }
	 A()
	 {
		 x=9;y="KK";
		 System.out.println("Hello User ! You are using non Parametric Constructor");
	 }
	 A(int a ,String b)
	 {
		 x=a; y=b;
		 System.out.println("Hello User ! You are using double Parametric Constructor");
	 }
	 A(int r)
	 {
		 x=r;
		 System.out.println("Hello User ! You are using Single Parametric Constructor");
	 }
	 
	
}

class Demo {
      public static void main(String ar[])
	  {
		  A a = new A(1,"Rajat");
		  A b = new A();
		  A c = new A(6);
		  A d = new A();
		  a.show();
		  b.show();
		  c.show();
		  d.show();
	  }
}	