
import javax.swing.*;
import java.awt.*;

public class SimpleGui1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPane panel = new MyDrawPane();
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
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