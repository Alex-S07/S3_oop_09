package module4;
import java.awt.GridLayout;
import javax.swing.*;
public class GuiPanel {
	GuiPanel(){
		JFrame f=new JFrame("Example");
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,2));
		JLabel l1 = new JLabel("Username");
		JTextField t1= new JTextField();
		JLabel l2 = new JLabel("Password");
		JPasswordField pa= new JPasswordField();
		JButton b1=new JButton("login");
		JButton b2=new JButton("clear");
		l1.setBounds(50,40,80,40);
		t1.setBounds(60,50,80,40);
		
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(pa);
		p.add(b1);
		p.add(b2);
		
		f.add(p);
	
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
public static void main(String args[]) {
	new GuiPanel();
}

}
