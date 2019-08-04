import java.awt.*;
import java.awt.event.*;
public class LoginFrame extends Frame {
	Panel p;
	Button b;
	TextField t1,t2;
	Label l1,l2,l3;
  
	LoginFrame(){
	   setLayout(null);
	   setTitle("Login Form");
	   setSize(400,400);
	   setBackground(Color.GRAY);
	   p=new Panel();
	   p.setLayout(null);
	   p.setBounds(50, 50, 300, 250);
	   p.setBackground(Color.WHITE);
	   add(p);
	   l1=new Label("USER ID :");
	   l1.setBounds(50,60,100,30);
	   p.add(l1);
	   l2=new Label("PASSWORD :");
	   l2.setBounds(50,100,100,30);
	   p.add(l2);
	   t1=new TextField();
	   t1.setBounds(150,65,100,20);
	   p.add(t1);
	   t2=new TextField();
	   t2.setBounds(150,105,100,20);
	   p.add(t2);
	   b=new Button("LOGIN");
	   b.addActionListener(new A());
	   b.setBounds(125,160,50,20);
	   p.add(b);
	   l3 = new Label("------------------------");
	   l3.setBounds(150,320,100,20);
	   add(l3);
	}
	class A implements ActionListener{
    	@Override
		public void actionPerformed(ActionEvent arg0) {
			String s1 = t1.getText();
			String s2 = t2.getText();
			if(s1 == "INCAPP" && s2 == "INDIA")
			{
				l3.setText("Login Success");
			}else {
				l3.setText("Loooogin Failed");
			}
			
		}
		
	}
}
