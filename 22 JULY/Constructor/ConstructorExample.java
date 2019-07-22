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
		 System.out.println("Hello Program ");
	 }
	 static
	 { 
	    System.out.println(" Hi User ");
	 }
	
}

class Demo {
      public static void main(String ar[])
	  {
		  A a = new A();
		  A b = new A();
		  a.show();
		  b.show();
	  }
}	
     