import javax.swing.*;
import java.awt.*;
public class SimpleAnimation {
int x = 70;
int y = 70;
public static void main (String[] args) {
SimpleAnimation gui = new SimpleAnimation ();
gui.go();
}
public void go() {
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
MyDrawPanel drawPanel = new MyDrawPanel();
frame.getContentPane().add(drawPanel);
frame.setSize(300,300);
frame.setVisible(true);
for (int i = 0; i < 130; i++) {
x++;
y++;
drawPanel.repaint();
try {
Thread.sleep(50);  //Using threads to slow the motion down. Threads come later.
} catch(Exception ex) { }
}
}
class MyDrawPanel extends JPanel {
public void paintComponent(Graphics g) {
g.setColor(Color.green);
g.fillOval(x,y,40,40);
}
} 
} 

//But this animation leaves a smear doesn't it?? To see how this smear is fixed, look at the Fixed animatiom file.
