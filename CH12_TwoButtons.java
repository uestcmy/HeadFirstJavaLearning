import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH12_TwoButtons{
	JFrame frame;
	JLabel label;
	public static void main(String[] arge){
		CH12_TwoButtons gui= new CH12_TwoButtons();
		gui.go();
	}
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Change label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Change circle");
		colorButton.addActionListener(new ColorListener());

		label = new JLabel("I'm a label");
		MyDraw drawPanel = new MyDraw();

		frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
		frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
		frame.getContentPane().add(BorderLayout.EAST,labelButton);
		frame.getContentPane().add(BorderLayout.WEST,label);
		
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	class LabelListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			label.setText("Ouch!");
		}
	}
	class ColorListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			frame.repaint();
		}
	}
}
class MyDraw extends JPanel{
	public void paintComponent(Graphics g){
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		
		Color randomColor = new Color(red,green,blue);
		g.setColor(randomColor);
		g.fillOval(70,70,100,100);//start x,y,width,hight
	}
}