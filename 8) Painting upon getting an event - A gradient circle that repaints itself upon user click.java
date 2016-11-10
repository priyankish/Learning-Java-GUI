
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui1 implements ActionListener {
	JFrame frame;
	public static void main(String[] args) {
		SimpleGui1 gui = new SimpleGui1();
		gui.go();
	}
public void go(){
		frame = new JFrame();
		JButton button = new JButton("Click to change colours.");
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPane panel = new MyDrawPane();
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
	}
public void actionPerformed(ActionEvent event){
	frame.repaint(); /* When the user clicks, the frame is told repaint() itself. That means paintComponent() is 
	                    called on every widget in the frame!*/
}
}
class MyDrawPane extends JPanel {
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color startColor = new Color(red, green, blue); 
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		Color endColor = new Color(red, green, blue); 
		GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
		g2.setPaint(gradient);
		g2.fillOval(70,70,100,100);
}
}