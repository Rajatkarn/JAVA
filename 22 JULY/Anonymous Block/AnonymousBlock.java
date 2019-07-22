class Anonymous
{
	
	int a = 10 ; String s = "Hello";
	{
		System.out.println(a+ "  " +s);
	}
	public  static void test()
	{
		System.out.println("This Code is Running");
	}
	
}

class Demo 
{ 
   public static void main(String ar[])
   { 
         Anonymous a = new Anonymous();
		 Anonymous.test();
   }
}

