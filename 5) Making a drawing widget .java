import javax.swing.*;
import java.awt.*;  //Both of these are needed now

public class SimpleGui {   //The main method implementation as seen earlier
	public static void main(String[] args) {
		JFrame frame = new JFrame("A button");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel panel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
	}
}
class MyDrawPanel extends JPanel { /* Make a subclass of JPanel, a widget that you can add to a frame just like anything else.
                                   Except this one is your own customized widget. */
	public void paintComponent(Graphics g){ /* Here is the important Graphics method. You never call it yourself. The system calls it 
	                                           and provides a drawing surface of type Graphics that you can paint on. */
		g.setColor(Color.red);
		g.fillRect(20, 50, 100, 100);  // g is like a painting machine. You tell it what shape to paint with what colour //
}
}
