class Demo
{ 
    public static void main(String ar[])
	{ 
	  int a=10 , b , c;
      b=a++ ;
      System.out.println("a :"+a);
      System.out.println("b :"+b);
	  System.out.println("-----------------------------------------");
	  System.out.println("Let's Solve Some Increment Decrement Expressions ");
	  a=10 ;
	  b=++a-a+--a;
	  System.out.println("b=++a-a+--a;");
	  System.out.println("a :"+a);
      System.out.println("b :"+b);
	  System.out.println("-----------------------------------------");
	  a=10 ;
	  b= ++a+a++-a++-a;
	  System.out.println("b= ++a+a++-a++-a;");
	  System.out.println("a :"+a);
      System.out.println("b :"+b);
	  System.out.println("-----------------------------------------");
	  a=10 ;
	  b= --a*a--+a++/--a+a--;
	  System.out.println("b= --a*a--+a++/--a+a--;");
	  System.out.println("a :"+a);
      System.out.println("b :"+b);
	  System.out.println("-----------------------------------------");
	  a=10 ;
	  b=5 ;
	  c=--b-a++%a++/--b*a++-b++*++a;
	  System.out.println("c=--b-a++%a++/--b*a++-b++*++a;");
	  System.out.println("a :"+a);
      System.out.println("b :"+b);
	  System.out.println("c :"+c);
	  System.out.println("-----------------------------------------");
	 
	  
	}
}	