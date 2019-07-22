class A
{ 
    int x=2;
    static String y = "YoYo";
    public void show()
     {
        System.out.println(x+"  "+y);
	 }
    static {
        System.out.println("Hi Rajat");
	}
}

class Demo{
    static{
        System.out.println("Hello User");
	}
    public static void main(String ar[])
	{
        A a = new A(); 
       	A b = new A();
		a.x=7 ; a.y="Tina";
		b.x=8 ; b.y="Ramu";
		   a.show();
		   b.show();
	}
}		
    