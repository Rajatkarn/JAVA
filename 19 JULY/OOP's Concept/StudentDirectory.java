class Student
{ 
    private int Roll_No ;
	private String Name;
	String College_Name = "KCC Institute of Technology and Management";
	public void input(int r , String n)
	{ 
	     Roll_No = r;
		 Name = n ;
		 //College_name = C_name;
	}
	public void show()
	{ 
	     System.out.println(Roll_No+"  "+Name+"  "+College_Name);
	}
}

class Demo
{ 
    public static void main(String ar[])
	{ 
	   Student a = new Student();
	   Student b = new Student();
	   a.input(01,"Rajat Karn");
	   b.input(02,"Tanya Kaur");
	   a.show();
	   b.show();
	}
}