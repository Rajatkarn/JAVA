class Demo 
{ 
    public static void main(String ar[])
	{ 
	   int a;
	   a= 12 & 5 ;
	   System.out.println("----- Bitwise AND Operator -----");
       System.out.println("a = 12&5 = "+a);
	   a= 12 | 5 ;
	   System.out.println("----- Bitwise OR Operator -----");
       System.out.println("a = 12|5 = "+a);
	   a= 12 ^ 5 ;
	   System.out.println("----- Bitwise XOR Operator -----");
       System.out.println("a = 12^5 = "+a);
	   a= 12 >> 1 ;
	   System.out.println("----- Right Shift Operator -----");
       System.out.println("a = 12>>1 = "+a);
	   a= 12 << 1 ;
	   System.out.println("----- Left Shift Operator -----");
       System.out.println("a = 12<<1 = "+a);
	}
}