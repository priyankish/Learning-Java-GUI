
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
		g.setColor(Color.black);
		g.fillRect(0,0,this.getWidth(),this.getHeight()); /* These arguments mean "0 pixel from left", "0 pixel from top",
		                                                     "as wide as the panel", "as high as the panel*/
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color myColor = new Color(red, green, blue); // RGB values specify a particular colour
		g.setColor(myColor);
		g.fillOval(90,90,90,90);
}
}