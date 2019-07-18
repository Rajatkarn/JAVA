class Demo
{ 
   public static void main(String s[])
   { 
      int a=10,b=5;
	  boolean c;
	  c= a++<--b && ++a!=b--;
	  System.out.println("AND Operation :-" );
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  
	  System.out.println("---------------------------------------");
	  
	  a=10; b=5;
	  c= a++<--b || ++a!=b--;
	  System.out.println("OR Operation :-" );
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  
	  System.out.println("---------------------------------------");
	  
	  a=10; b=5;
	  c= (a++<--b);
	  System.out.println(" Without NOT Operation :-" );
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	
	  
	  a=10; b=5;
	  c= !(a++<--b); 
	  System.out.println(" With NOT Operator :-" );
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
   }
}
	  