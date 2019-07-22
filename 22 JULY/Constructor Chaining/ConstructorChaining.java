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
		// x=9;y="KK";
		 System.out.println("Hello User ! I am First");
	 }
	 A(int a ,String b)
	 {
		 this(a);
		 x=a; y=b;
		 System.out.println("Hello User ! I am Third");
	 }
	 A(int r)
	 {
		 this();
		 x=r;
		 System.out.println("Hello User ! I am Second");
	 }
	 
	
}

class Demo {
      public static void main(String ar[])
	  {
		  A a = new A(1,"Rajat");
		 
	  }
}	