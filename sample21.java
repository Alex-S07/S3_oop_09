package module4;
import javax.swing.*;
public class sw1 {
	sw1()
	{
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton("login");
		JLabel l=new JLabel("hello");
		l.setBounds(100,100,90,30);
		b.setBounds(150,150,90,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sw1();

	}

}
